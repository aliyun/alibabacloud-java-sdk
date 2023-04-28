// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceRequest extends TeaModel {
    /**
     * <p>systemError</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("FilterParams")
    public ListGatewayServiceRequestFilterParams filterParams;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>code</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>mse-200-105</p>
     */
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
        /**
         * <p>cluster not found</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>clusterNotFound</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>illegalRequest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>mse-200-021</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>mse-100-001</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>illegal request:%s</p>
         */
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
