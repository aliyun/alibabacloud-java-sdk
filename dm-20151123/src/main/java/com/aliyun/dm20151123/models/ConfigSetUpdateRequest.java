// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetUpdateRequest extends TeaModel {
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
    @NameInMap("Id")
    public String id;

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

    public static ConfigSetUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetUpdateRequest self = new ConfigSetUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetUpdateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetUpdateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfigSetUpdateRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetUpdateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
