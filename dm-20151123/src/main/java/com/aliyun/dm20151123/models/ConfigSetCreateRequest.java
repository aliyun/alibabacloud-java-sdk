// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCreateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Name")
    public String name;

    public static ConfigSetCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCreateRequest self = new ConfigSetCreateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetCreateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetCreateRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
