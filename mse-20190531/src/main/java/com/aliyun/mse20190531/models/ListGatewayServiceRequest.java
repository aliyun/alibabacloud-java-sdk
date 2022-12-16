// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to enable sorting.
    @NameInMap("DescSort")
    public Boolean descSort;

    // The parameters that specify filter conditions, which are in the format of {"key1":"value1"}.
    @NameInMap("FilterParams")
    public ListGatewayServiceRequestFilterParams filterParams;

    // The item based on which entries are sorted.
    @NameInMap("OrderItem")
    public String orderItem;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
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
        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The group.
        @NameInMap("GroupName")
        public String groupName;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The protocol of the service.
        // 
        // *   HTTP
        // *   HTTPS
        // *   HTTP2
        // *   GRPC
        // *   DUBBO
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        // The type of the service source.
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

        public ListGatewayServiceRequestFilterParams setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
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
