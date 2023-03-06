// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEcsInstancesRequest extends TeaModel {
    /**
     * <p>\["i-bp13y63575oypr9d\*\*\*\*","i-bp1gyhphjaj73jsr\*\*\*\*"]</p>
     */
    @NameInMap("ecsInstanceIds")
    public String ecsInstanceIds;

    /**
     * <p>test</p>
     */
    @NameInMap("ecsInstanceName")
    public String ecsInstanceName;

    /**
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>\[{ "tagKey":"a","tagValue":"b"}]</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>vpc-bp16k1dvzxtmagcva\*\*\*\*</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ListEcsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsInstancesRequest self = new ListEcsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsInstancesRequest setEcsInstanceIds(String ecsInstanceIds) {
        this.ecsInstanceIds = ecsInstanceIds;
        return this;
    }
    public String getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    public ListEcsInstancesRequest setEcsInstanceName(String ecsInstanceName) {
        this.ecsInstanceName = ecsInstanceName;
        return this;
    }
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    public ListEcsInstancesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListEcsInstancesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListEcsInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ListEcsInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
