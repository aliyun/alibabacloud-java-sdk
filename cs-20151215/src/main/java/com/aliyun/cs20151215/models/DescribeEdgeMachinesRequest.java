// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachinesRequest extends TeaModel {
    // host name
    @NameInMap("hostname")
    public String hostname;

    // life state
    @NameInMap("life_state")
    public String lifeState;

    // model
    @NameInMap("model")
    public String model;

    // online state
    @NameInMap("online_state")
    public String onlineState;

    // page number
    @NameInMap("page_number")
    public Long pageNumber;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    public static DescribeEdgeMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachinesRequest self = new DescribeEdgeMachinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachinesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeEdgeMachinesRequest setLifeState(String lifeState) {
        this.lifeState = lifeState;
        return this;
    }
    public String getLifeState() {
        return this.lifeState;
    }

    public DescribeEdgeMachinesRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeEdgeMachinesRequest setOnlineState(String onlineState) {
        this.onlineState = onlineState;
        return this;
    }
    public String getOnlineState() {
        return this.onlineState;
    }

    public DescribeEdgeMachinesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEdgeMachinesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
