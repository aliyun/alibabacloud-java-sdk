// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckClustersRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("vpcId")
    public String vpcId;

    public static ListAckClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClustersRequest self = new ListAckClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClustersRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
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
