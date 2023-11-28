// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The IDs of the ECS instances.</p>
     */
    @NameInMap("ecsInstanceIds")
    public String ecsInstanceIds;

    /**
     * <p>The name of the ECS instance.</p>
     */
    @NameInMap("ecsInstanceName")
    public String ecsInstanceName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The tags of the ECS instance. You must configure tagKey and tagValue.</p>
     */
    @NameInMap("tags")
    public String tags;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setEcsInstanceIds(String ecsInstanceIds) {
        this.ecsInstanceIds = ecsInstanceIds;
        return this;
    }
    public String getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    public ListNodesRequest setEcsInstanceName(String ecsInstanceName) {
        this.ecsInstanceName = ecsInstanceName;
        return this;
    }
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    public ListNodesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListNodesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListNodesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
