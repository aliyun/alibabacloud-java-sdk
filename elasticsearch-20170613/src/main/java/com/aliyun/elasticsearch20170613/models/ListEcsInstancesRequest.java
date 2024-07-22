// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEcsInstancesRequest extends TeaModel {
    /**
     * <p>test</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp13y63575oypr9d****&quot;,&quot;i-bp1gyhphjaj73jsr****&quot;]</p>
     */
    @NameInMap("ecsInstanceIds")
    public String ecsInstanceIds;

    /**
     * <p>[{ &quot;tagKey&quot;:&quot;a&quot;,&quot;tagValue&quot;:&quot;b&quot;}]</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ecsInstanceName")
    public String ecsInstanceName;

    /**
     * <p>10</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>[&quot;i-bp13y63575oypr9d\<em>\</em>\<em>\</em>&quot;,&quot;i-bp1gyhphjaj73jsr\<em>\</em>\<em>\</em>&quot;]</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>vpc-bp16k1dvzxtmagcva\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;tagKey&quot;:&quot;a&quot;,&quot;tagValue&quot;:&quot;b&quot;}]</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp16k1dvzxtmagcva****</p>
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
