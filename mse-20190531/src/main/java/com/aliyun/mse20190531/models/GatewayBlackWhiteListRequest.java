// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayBlackWhiteListRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is unavailable for public use.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("FilterParams")
    public GatewayBlackWhiteListRequestFilterParams filterParams;

    /**
     * <p>This parameter is unavailable for public use.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GatewayBlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        GatewayBlackWhiteListRequest self = new GatewayBlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public GatewayBlackWhiteListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GatewayBlackWhiteListRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public GatewayBlackWhiteListRequest setFilterParams(GatewayBlackWhiteListRequestFilterParams filterParams) {
        this.filterParams = filterParams;
        return this;
    }
    public GatewayBlackWhiteListRequestFilterParams getFilterParams() {
        return this.filterParams;
    }

    public GatewayBlackWhiteListRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public GatewayBlackWhiteListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GatewayBlackWhiteListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class GatewayBlackWhiteListRequestFilterParams extends TeaModel {
        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway. If this parameter is used together with the GatewayId parameter, the value of the GatewayId parameter is used.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The content that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("SearchContent")
        public String searchContent;

        /**
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li>ROUTE: The list is queried by route. If the value of this parameter is ROUTE, set the SearchContent parameter to the route name.</li>
         * <li>DOMAIN: The list is queried by domain name. If the value of this parameter is DOMAIN, set the SearchContent parameter to the domain name.</li>
         * <li>IP: The list is queried by specified IP address. If the value of this parameter is IP, set the SearchContent parameter to the IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("SearchType")
        public String searchType;

        /**
         * <p>This parameter is unavailable for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Type")
        public String type;

        public static GatewayBlackWhiteListRequestFilterParams build(java.util.Map<String, ?> map) throws Exception {
            GatewayBlackWhiteListRequestFilterParams self = new GatewayBlackWhiteListRequestFilterParams();
            return TeaModel.build(map, self);
        }

        public GatewayBlackWhiteListRequestFilterParams setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GatewayBlackWhiteListRequestFilterParams setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GatewayBlackWhiteListRequestFilterParams setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public GatewayBlackWhiteListRequestFilterParams setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GatewayBlackWhiteListRequestFilterParams setSearchContent(String searchContent) {
            this.searchContent = searchContent;
            return this;
        }
        public String getSearchContent() {
            return this.searchContent;
        }

        public GatewayBlackWhiteListRequestFilterParams setSearchType(String searchType) {
            this.searchType = searchType;
            return this;
        }
        public String getSearchType() {
            return this.searchType;
        }

        public GatewayBlackWhiteListRequestFilterParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
