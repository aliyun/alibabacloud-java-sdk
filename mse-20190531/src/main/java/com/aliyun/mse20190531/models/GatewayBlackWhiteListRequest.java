// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayBlackWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (Chinese, default) and en (English).</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>parse from filterParams</p>
     */
    @NameInMap("FilterParams")
    public GatewayBlackWhiteListRequestFilterParams filterParams;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The page number. Valid values: integers greater than 0. Default value: 1.</p>
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
         * <p>The unique identifier of the gateway. If both GatewayUniqueId and GatewayId are specified, GatewayId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The search content.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("SearchContent")
        public String searchContent;

        /**
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li><p>ROUTE: searches by route. Set SearchContent to the route name.</p>
         * </li>
         * <li><p>DOMAIN: searches by domain name. Set SearchContent to the domain name.</p>
         * </li>
         * <li><p>IP: searches by specified IP address. Set SearchContent to the IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("SearchType")
        public String searchType;

        /**
         * <p>This parameter is not available.</p>
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
