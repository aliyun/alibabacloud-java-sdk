// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashRequest extends TeaModel {
    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("description")
    public String description;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("version")
    public String version;

    @NameInMap("ownerId")
    public String ownerId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashRequest self = new ListLogstashRequest();
        return TeaModel.build(map, self);
    }

    public ListLogstashRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogstashRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLogstashRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListLogstashRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListLogstashRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListLogstashRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListLogstashRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
