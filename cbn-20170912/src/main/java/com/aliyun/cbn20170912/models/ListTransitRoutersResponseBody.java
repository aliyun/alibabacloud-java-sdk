// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. For more information about paging, see the related parameter descriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68521297-5FA6-46CB-B4EB-658F1C68C8CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of transit router instances.</p>
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
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
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
         * <p>The transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>CIDRdesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>CIDRname</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the system is allowed to automatically add a route for the transit router CIDR block to the transit router route table. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: allowed.</p>
         * <p>   If the value is <strong>true</strong>, after you create a VPN connection of the private gateway type and create a route learning relationship for the VPN connection, the system automatically adds the following route entry to the transit router route table that has a route learning relationship with the VPN connection:</p>
         * <p>A blackhole route whose destination CIDR block is the transit router CIDR block from which a gateway IP address is allocated to the IPsec connection.</p>
         * <p>The blackhole route is propagated only to the route tables of VBR instances under the transit router.</p>
         * </li>
         * <li><p><strong>false</strong>: not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublishCidrRoute")
        public Boolean publishCidrRoute;

        /**
         * <p>The ID of the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr-46p5ceg21e8152****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-j3jzhw1zpau2km****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the transit router instance was created.</p>
         * <p>The time is displayed in UTC in the <code>YYYY-MM-DDThh:mmZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T09:39Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The region ID of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the transit router instance. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Active</strong>: active.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * <li><strong>Upgrading</strong>: being upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the multicast feature is enabled for the transit router instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportMulticast")
        public Boolean supportMulticast;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTags> tags;

        /**
         * <p>The list of transit router CIDR blocks.</p>
         */
        @NameInMap("TransitRouterCidrList")
        public java.util.List<ListTransitRoutersResponseBodyTransitRoutersTransitRouterCidrList> transitRouterCidrList;

        /**
         * <p>The description of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        @NameInMap("TransitRouterDescription")
        public String transitRouterDescription;

        /**
         * <p>The transit router instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The name of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        /**
         * <p>The type of the transit router instance. Valid values:</p>
         * <ul>
         * <li><strong>Enterprise</strong>: Enterprise Edition transit router.</li>
         * <li><strong>Basic</strong>: Basic Edition transit router.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
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
