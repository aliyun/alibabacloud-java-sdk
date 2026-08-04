// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategiesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in paging query. Valid values: 1 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The list of access destination instance IDs.</p>
     */
    @NameInMap("DestinationIds")
    public java.util.List<String> destinationIds;

    /**
     * <p>The type of the access destination. Valid values:</p>
     * <ul>
     * <li><strong>Connector</strong>: connector.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connector</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The list of forwarding rule IDs.</p>
     */
    @NameInMap("ForwardIds")
    public java.util.List<String> forwardIds;

    /**
     * <p>The name of the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_rand_str_acs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page in paging query. Valid values: 1 to 1000.</p>
     * 
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
