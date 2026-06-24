// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckClustersRequest extends TeaModel {
    /**
     * <p>The page number. (Deprecated).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of records per page. (Deprecated).</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The ID of the VPC where the ACK cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp12nu14urf0upaf4****</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ListAckClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClustersRequest self = new ListAckClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClustersRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAckClustersRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAckClustersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
