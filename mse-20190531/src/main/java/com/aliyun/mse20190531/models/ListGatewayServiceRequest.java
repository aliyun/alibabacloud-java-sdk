// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DescSort")
    public Boolean descSort;

    @NameInMap("FilterParams")
    public ListGatewayServiceRequestFilterParams filterParams;

    @NameInMap("OrderItem")
    public String orderItem;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceRequest self = new ListGatewayServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayServiceRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayServiceRequest setFilterParams(ListGatewayServiceRequestFilterParams filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public ListGatewayServiceRequestFilterParams getFilterParams() {
        return this.filterParams;
    }

    public ListGatewayServiceRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayServiceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayServiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListGatewayServiceRequestFilterParams extends TeaModel {
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SourceType")
        public String sourceType;

        public static ListGatewayServiceRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceRequestFilterParams self = new ListGatewayServiceRequestFilterParams();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceRequestFilterParams setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayServiceRequestFilterParams setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayServiceRequestFilterParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayServiceRequestFilterParams setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayServiceRequestFilterParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
