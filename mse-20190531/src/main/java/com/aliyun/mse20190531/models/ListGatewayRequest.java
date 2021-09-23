// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OrderItem")
    public String orderItem;

    @NameInMap("DescSort")
    public Boolean descSort;

    @NameInMap("FilterParams")
    public ListGatewayRequestFilterParams filterParams;

    public static ListGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRequest self = new ListGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayRequest setFilterParams(ListGatewayRequestFilterParams filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public ListGatewayRequestFilterParams getFilterParams() {
        return this.filterParams;
    }

    public static class ListGatewayRequestFilterParams extends TeaModel {
        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("Name")
        public String name;

        public static ListGatewayRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRequestFilterParams self = new ListGatewayRequestFilterParams();
            return TeaModel.build(map, self);
        }

        public ListGatewayRequestFilterParams setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListGatewayRequestFilterParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
