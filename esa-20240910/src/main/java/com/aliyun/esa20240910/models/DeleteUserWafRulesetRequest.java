// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUserWafRulesetRequest extends TeaModel {
    /**
     * <p>WAF ruleset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteUserWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserWafRulesetRequest self = new DeleteUserWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteUserWafRulesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
