// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsRequest extends TeaModel {
    /**
     * <p>The JSON array string used to add advanced whitelist or precise defense whitelist rules. This parameter applies only to scenarios where the OperationCode is <code>advance_mark_mis_info</code> or <code>defense_mark_mis_info</code>. Do not pass this parameter for other operations.</p>
     * <p>Each rule includes the following fields:</p>
     * <ul>
     * <li><code>field</code>: The matching field, which is obtained from the FiledName field in the MarkFieldsSource returned by the DescribeSecurityEventOperations operation.</li>
     * <li><code>fieldValue</code>: The user-defined matching value, which does not need to equal the original field value of the current alert.</li>
     * <li><code>operate</code>: The matching operator, which must be included in the list returned by the SupportedMisType corresponding to the field. Do not use a common fixed enumeration to replace the supported scope of the current field.</li>
     * <li><code>assetScope</code>: The effective scope object of the whitelist rule, which includes matchMode (the scope mode) and the corresponding matchTargetIds (the list of scope targets).</li>
     * </ul>
     * <p>The assetScope field specifies the effective scope of the rule. If you only process alerts and do not add whitelist rules, you can leave this parameter empty or pass an empty array string <code>[]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;processPath&quot;,&quot;fieldValue&quot;:&quot;/tmp/evil&quot;,&quot;operate&quot;:&quot;strEqual&quot;,&quot;assetScope&quot;:{&quot;matchMode&quot;:&quot;DeviceGroupNormal&quot;,&quot;matchTargetIds&quot;:[&quot;device-group-1&quot;]}}]</p>
     */
    @NameInMap("MarkMissParam")
    public String markMissParam;

    /**
     * <p>The operation code for processing endpoint alerts. The allowed operations for the code are as follows:</p>
     * <ul>
     * <li><code>advance_mark_mis_info</code>: Adds the alert to the advanced whitelist.</li>
     * <li><code>defense_mark_mis_info</code>: Adds the alert to the precise defense whitelist.</li>
     * <li><code>mark_mis_info</code>: Marks the alert as a false positive and adds it to the common whitelist.</li>
     * <li><code>rm_mark_mis_info</code>: Removes the alert from the common or advanced whitelist.</li>
     * <li><code>rm_defense_mark_mis_info</code>: Removes the alert from the precise defense whitelist.</li>
     * <li><code>ignore</code>: Ignores the alert.</li>
     * <li><code>manual_handled</code>: Marks the alert as manually handled.</li>
     * <li><code>cancle_manual</code>: Cancels the manually handled status of the alert.</li>
     * </ul>
     * <p>The preceding set is not a fixed list of operations that can be performed on every alert. The actual available operations are also restricted by conditions such as feature switches, dynamic whitelists, alert operation configurations, and the current status. Before calling this operation, call the DescribeSecurityEventOperations operation to query the currently available operations for the alert and check UserCanOperate. Use only the OperationCode values that are allowed in the query results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The operation parameters, represented as a JSON object string. If this parameter is not passed or an empty string is passed, the backend processes it as <code>{}</code>. The specific parameters must correspond to the OperationCode and are subject to the OperationParams returned by the DescribeSecurityEventOperations operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The remark for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the similar alert query task. You can obtain the ID by calling the CreateSimilarSecurityEventsQueryTask operation. The task must belong to the current calling account and must be a similar alert query task. Before calling this operation, call the DescribeSecurityEventOperationStatus operation to query the TaskStatus. Wait until the status reaches DataRetrieved before initiating the processing. The New or RetrievingData status indicates that data extraction is not complete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>666038</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static HandleSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsRequest self = new HandleSimilarSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsRequest setMarkMissParam(String markMissParam) {
        this.markMissParam = markMissParam;
        return this;
    }
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    public HandleSimilarSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSimilarSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSimilarSecurityEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public HandleSimilarSecurityEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
