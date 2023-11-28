// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashRequest extends TeaModel {
    /**
     * <p>rg-acfm2h5vbzd\*\*\*\*</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>\[{"tagKey":"key1","tagValue":"value1"}]</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>ls-cn-n6w1o5jq\*\*\*\*</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Details of the request header.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>5.5.3\_with_X-Pack</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("version")
    public String version;

    public static ListLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashRequest self = new ListLogstashRequest();
        return TeaModel.build(map, self);
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

    public ListLogstashRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogstashRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLogstashRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLogstashRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ListLogstashRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
