// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to add to the whitelist in batches. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     */
    @NameInMap("MarkBatch")
    public Boolean markBatch;

    /**
     * <p>The JSON array string used when adding an advanced whitelist or precise defense whitelist rule. This parameter applies only when OperationCode is set to <code>advance_mark_mis_info</code> or <code>defense_mark_mis_info</code>. Do not pass this parameter for other operations.</p>
     * <p>Each rule contains the following fields:</p>
     * <ul>
     * <li><code>field</code>: The matching field, which is obtained from the FiledName in MarkFieldsSource returned by DescribeSecurityEventOperations.</li>
     * <li><code>fieldValue</code>: The user-defined matching value, which does not need to be equal to the original field value of the current alert.</li>
     * <li><code>operate</code>: The matching operator, which must belong to the SupportedMisType list returned for the field. Do not use a general fixed enumeration instead of the supported range for the current field.</li>
     * <li><code>assetScope</code>: The effective scope object of the whitelist rule, which includes matchMode (scope mode) and the corresponding matchTargetIds (scope target list).</li>
     * </ul>
     * <p>The assetScope parameter specifies the effective scope of the rule. If you only handle the alert and do not add a whitelist rule, you can omit this parameter or pass an empty array string <code>[]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;processPath&quot;,&quot;fieldValue&quot;:&quot;/tmp/evil&quot;,&quot;operate&quot;:&quot;strEqual&quot;,&quot;assetScope&quot;:{&quot;matchMode&quot;:&quot;DeviceGroupNormal&quot;,&quot;matchTargetIds&quot;:[&quot;device-group-1&quot;]}}]</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation code for handling the endpoint alert. Valid values:</p>
     * <ul>
     * <li>advance_mark_mis_info: Adds to the advanced whitelist.</li>
     * <li>defense_mark_mis_info: Adds to the precise defense whitelist.</li>
     * <li>mark_mis_info: Marks as a false positive (standard whitelisting).</li>
     * <li>rm_mark_mis_info: Removes from the standard or advanced whitelist.</li>
     * <li>rm_defense_mark_mis_info: Removes from the precise defense whitelist.</li>
     * <li>ignore: Ignores the alert.</li>
     * <li>manual_handled: Marks as manually handled.</li>
     * <li>cancle_manual: Cancels the manually handled status.
     * The preceding list is not a fixed set of operations that can be performed on every alert. The actual available operations are also restricted by feature switches, dynamic whitelists, alert operation configurations, and the current status. Before you call this operation, call DescribeSecurityEventOperations to query the currently available operations for the alert and check UserCanOperate. Use only the OperationCode values that are allowed in the query result.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The operation parameters, represented as a JSON object string. If this parameter is not passed or an empty string is passed, the backend processes it as <code>{}</code>. The specific parameters must correspond to the OperationCode and are subject to the OperationParams returned by DescribeSecurityEventOperations.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remark for the handling operation.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The IDs of the security alert events to handle.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<Long> securityEventIds;

    public static HandleSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsRequest self = new HandleSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsRequest setMarkBatch(Boolean markBatch) {
        this.markBatch = markBatch;
        return this;
    }
    public Boolean getMarkBatch() {
        return this.markBatch;
    }

    public HandleSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    public HandleSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSecurityEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public HandleSecurityEventsRequest setSecurityEventIds(java.util.List<Long> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

}
