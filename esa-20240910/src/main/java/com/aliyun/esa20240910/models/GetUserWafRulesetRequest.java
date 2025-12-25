// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserWafRulesetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetUserWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserWafRulesetRequest self = new GetUserWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public GetUserWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUserWafRulesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
