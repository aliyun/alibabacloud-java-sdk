// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionRequest extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The rule action ID that you want to query.</p>
     * <p>You can query the rule action ID by using the following methods:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation and view the <strong>ActionId</strong> parameter in the response.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation and view the <strong>Id</strong> parameter in the response.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionRequest self = new GetRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public GetRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
