// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachinesRequest extends TeaModel {
    /**
     * <p>The `hostname` of the cloud-native box.</p>
     */
    @NameInMap("hostname")
    public String hostname;

    /**
     * <p>The lifecycle status.</p>
     */
    @NameInMap("life_state")
    public String lifeState;

    /**
     * <p>The type of cloud-native box.</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The status of the cloud-native box. Valid values:</p>
     * <br>
     * <p>*   `offline`</p>
     * <p>*   `online`</p>
     */
    @NameInMap("online_state")
    public String onlineState;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
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
