// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteRequest extends TeaModel {
    /**
     * <p>Language type for returned information:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Sorting. This field is currently unavailable and being deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>Filter conditions in the format {&quot;key1&quot;:&quot;value1&quot;}</p>
     */
    @NameInMap("FilterParams")
    public ListGatewayRouteRequestFilterParams filterParams;

    /**
     * <p>Sorting property.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreate</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of instances displayed per page (currently not in effect, queries all instances by default).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteRequest self = new ListGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayRouteRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayRouteRequest setFilterParams(ListGatewayRouteRequestFilterParams filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public ListGatewayRouteRequestFilterParams getFilterParams() {
        return this.filterParams;
    }

    public ListGatewayRouteRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayRouteRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayRouteRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListGatewayRouteRequestFilterParams extends TeaModel {
        /**
         * <p>Default service ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultServiceId")
        @Deprecated
        public Long defaultServiceId;

        /**
         * <p>Domain ID</p>
         * 
         * <strong>example:</strong>
         * <p>284</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>Associated domain</p>
         * 
         * <strong>example:</strong>
         * <p>*.alites.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Gateway ID</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>Gateway unique identifier ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-30a0106924c94bca8712ec4e79fc5acc</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>Route name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Route path</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Order (unused)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        /**
         * <p>Route status:</p>
         * <ul>
         * <li><p>Unpublished: 0</p>
         * </li>
         * <li><p>Publishing: 2</p>
         * </li>
         * <li><p>Published: 3</p>
         * </li>
         * <li><p>Editing (updates not published): 4</p>
         * </li>
         * <li><p>Unpublishing: 5</p>
         * </li>
         * <li><p>Unavailable: 6</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListGatewayRouteRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteRequestFilterParams self = new ListGatewayRouteRequestFilterParams();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListGatewayRouteRequestFilterParams setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public ListGatewayRouteRequestFilterParams setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public ListGatewayRouteRequestFilterParams setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGatewayRouteRequestFilterParams setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayRouteRequestFilterParams setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayRouteRequestFilterParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRouteRequestFilterParams setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayRouteRequestFilterParams setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public ListGatewayRouteRequestFilterParams setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
