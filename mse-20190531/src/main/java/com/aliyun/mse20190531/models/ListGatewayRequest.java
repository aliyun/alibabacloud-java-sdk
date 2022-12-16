// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to enable the sorting feature. This feature is not available.
    @NameInMap("DescSort")
    public Boolean descSort;

    // The details of parameters.
    @NameInMap("FilterParams")
    public ListGatewayRequestFilterParams filterParams;

    // The order information.
    @NameInMap("OrderItem")
    public String orderItem;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRequest self = new ListGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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

    public ListGatewayRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
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

    public static class ListGatewayRequestFilterParams extends TeaModel {
        // The type of the gateway.
        @NameInMap("GatewayType")
        public String gatewayType;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MseTag")
        public String mseTag;

        // The name of the gateway.
        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The ID of the virtual private cloud (VPC).
        @NameInMap("Vpc")
        public String vpc;

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

        public ListGatewayRequestFilterParams setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayRequestFilterParams setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGatewayRequestFilterParams setMseTag(String mseTag) {
            this.mseTag = mseTag;
            return this;
        }
        public String getMseTag() {
            return this.mseTag;
        }

        public ListGatewayRequestFilterParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRequestFilterParams setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListGatewayRequestFilterParams setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

    }

}
