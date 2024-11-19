// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteRuleActionRequest extends TeaModel {
    /**
     * <p>The identifier of the rule action that you want to delete.</p>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation to create a rule action, the rule action ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation to view the rule action ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleActionRequest self = new DeleteRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public DeleteRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
