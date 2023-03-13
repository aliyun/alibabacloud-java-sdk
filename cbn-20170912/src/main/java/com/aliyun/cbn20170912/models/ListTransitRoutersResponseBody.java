// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A list of transit routers.</p>
     */
    @NameInMap("TransitRouters")
    public java.util.List<ListTransitRoutersResponseBodyTransitRouters> transitRouters;

    public static ListTransitRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRoutersResponseBody self = new ListTransitRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRoutersResponseBody setTransitRouters(java.util.List<ListTransitRoutersResponseBodyTransitRouters> transitRouters) {
        this.transitRouters = transitRouters;
        return this;
    }
    public java.util.List<ListTransitRoutersResponseBodyTransitRouters> getTransitRouters() {
        return this.transitRouters;
    }

    public static class ListTransitRoutersResponseBodyTransitRoutersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRoutersResponseBodyTransitRoutersTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersResponseBodyTransitRoutersTags self = new ListTransitRoutersResponseBodyTransitRoutersTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersResponseBodyTransitRoutersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRoutersResponseBodyTransitRoutersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList extends TeaModel {
        /**
         * <p>The CIDR block of the transit router.</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the CIDR block.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the system is allowed to automatically add a route to the route table of the transit router. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <br>
         * <p>        A value of **true** indicates that after you create a private VPN connection and create a route learning correlation for the private VPC connection, the system automatically adds the following route to the route table of the transit router that is in route learning correlation with the private VPN connection:</p>
         * <p>          A blackhole route whose destination CIDR block is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. </p>
         * <p>          The blackhole route is advertised only to the route tables of virtual border routers (VBRs) that are connected to the transit router. </p>
         * <br>
         * <p>*   **false**: no</p>
         */
        @NameInMap("PublishCidrRoute")
        public Boolean publishCidrRoute;

        /**
         * <p>The ID of the CIDR block.</p>
         */
        @NameInMap("TransitRouterCidrId")
        public String transitRouterCidrId;

        public static ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList self = new ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList setPublishCidrRoute(Boolean publishCidrRoute) {
            this.publishCidrRoute = publishCidrRoute;
            return this;
        }
        public Boolean getPublishCidrRoute() {
            return this.publishCidrRoute;
        }

        public ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList setTransitRouterCidrId(String transitRouterCidrId) {
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

    }

    public static class ListTransitRoutersResponseBodyTransitRouters extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the transit router was created.</p>
         * <br>
         * <p>The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the region where the transit router is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the transit router. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The transit router is being created.</p>
         * <p>*   **Active**: The transit router is available.</p>
         * <p>*   **Modifying**: The transit router is being modified</p>
         * <p>*   **Deleting**: The transit router is being deleted.</p>
         * <p>*   **Upgrading**: The transit router is being upgraded.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether multicast is enabled for the transit router. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("SupportMulticast")
        public Boolean supportMulticast;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTags> tags;

        /**
         * <p>The CIDR blocks of the transit router.</p>
         */
        @NameInMap("TransitRouterCidrList")
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList> transitRouterCidrList;

        /**
         * <p>The description of the transit router.</p>
         */
        @NameInMap("TransitRouterDescription")
        public String transitRouterDescription;

        /**
         * <p>The ID of the transit router.</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The name of the transit router.</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        /**
         * <p>The edition of the transit router. Valid values:</p>
         * <br>
         * <p>*   **Enterprise**: Enhance Edition</p>
         * <p>*   **Basic**: Basic Edition</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTransitRoutersResponseBodyTransitRouters build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersResponseBodyTransitRouters self = new ListTransitRoutersResponseBodyTransitRouters();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersResponseBodyTransitRouters setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListTransitRoutersResponseBodyTransitRouters setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRoutersResponseBodyTransitRouters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRoutersResponseBodyTransitRouters setSupportMulticast(Boolean supportMulticast) {
            this.supportMulticast = supportMulticast;
            return this;
        }
        public Boolean getSupportMulticast() {
            return this.supportMulticast;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTags(java.util.List<ListTransitRoutersResponseBodyTransitRoutersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTags> getTags() {
            return this.tags;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterCidrList(java.util.List<ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList> transitRouterCidrList) {
            this.transitRouterCidrList = transitRouterCidrList;
            return this;
        }
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList> getTransitRouterCidrList() {
            return this.transitRouterCidrList;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterDescription(String transitRouterDescription) {
            this.transitRouterDescription = transitRouterDescription;
            return this;
        }
        public String getTransitRouterDescription() {
            return this.transitRouterDescription;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRoutersResponseBodyTransitRouters setTransitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        public ListTransitRoutersResponseBodyTransitRouters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
