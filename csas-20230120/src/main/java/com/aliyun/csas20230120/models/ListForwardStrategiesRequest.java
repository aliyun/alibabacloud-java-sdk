// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategiesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("DestinationIds")
    public java.util.List<String> destinationIds;

    /**
     * <strong>example:</strong>
     * <p>Connector</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("ForwardIds")
    public java.util.List<String> forwardIds;

    /**
     * <strong>example:</strong>
     * <p>acs_rand_str_acs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListForwardStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategiesRequest self = new ListForwardStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategiesRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListForwardStrategiesRequest setDestinationIds(java.util.List<String> destinationIds) {
        this.destinationIds = destinationIds;
        return this;
    }
    public java.util.List<String> getDestinationIds() {
        return this.destinationIds;
    }

    public ListForwardStrategiesRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ListForwardStrategiesRequest setForwardIds(java.util.List<String> forwardIds) {
        this.forwardIds = forwardIds;
        return this;
    }
    public java.util.List<String> getForwardIds() {
        return this.forwardIds;
    }

    public ListForwardStrategiesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListForwardStrategiesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
