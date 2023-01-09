// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to enable sorting.
    @NameInMap("DescSort")
    public Boolean descSort;

    // The parameters that specify filter conditions. The parameters are in the format of {"key1":"value1"}.
    @NameInMap("FilterParams")
    public ListGatewayRouteRequestFilterParams filterParams;

    // The item based on which entries are sorted.
    @NameInMap("OrderItem")
    public String orderItem;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
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
        // The default service ID.
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        // The domain ID.
        @NameInMap("DomainId")
        public Long domainId;

        // The associated domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The name of the gateway.
        @NameInMap("Name")
        public String name;

        // The order.
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        // The status.
        @NameInMap("Status")
        public Integer status;

        public static ListGatewayRouteRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRouteRequestFilterParams self = new ListGatewayRouteRequestFilterParams();
            return TeaModel.build(map, self);
        }

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
