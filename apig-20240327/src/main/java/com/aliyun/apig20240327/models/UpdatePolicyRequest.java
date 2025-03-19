// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    /**
     * <p>Policy configuration</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;unitNum&quot;:1,&quot;timeUnit&quot;:&quot;s&quot;,&quot;enable&quot;:true}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>this is a timeout policy description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Policy name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>celue-timeout-test</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
