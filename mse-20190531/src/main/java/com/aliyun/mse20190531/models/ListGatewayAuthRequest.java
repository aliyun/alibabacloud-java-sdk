// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (default): Chinese, en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>The filter conditions. Refer to the examples.</p>
     */
    @NameInMap("FilterParams")
    public ListGatewayAuthRequestFilterParams filterParams;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthRequest self = new ListGatewayAuthRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayAuthRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayAuthRequest setFilterParams(ListGatewayAuthRequestFilterParams filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public ListGatewayAuthRequestFilterParams getFilterParams() {
        return this.filterParams;
    }

    public ListGatewayAuthRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayAuthRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayAuthRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListGatewayAuthRequestFilterParams extends TeaModel {
        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The whitelist mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>rutain-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The enabling status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>JWT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayAuthRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthRequestFilterParams self = new ListGatewayAuthRequestFilterParams();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthRequestFilterParams setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayAuthRequestFilterParams setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public ListGatewayAuthRequestFilterParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayAuthRequestFilterParams setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListGatewayAuthRequestFilterParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
