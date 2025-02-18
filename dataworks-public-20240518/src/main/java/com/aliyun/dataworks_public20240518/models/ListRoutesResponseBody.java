// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListRoutesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListRoutesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutesResponseBody self = new ListRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutesResponseBody setPagingInfo(ListRoutesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListRoutesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRoutesResponseBodyPagingInfoRouteList extends TeaModel {
        /**
         * <p>The creation time, which is a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Route destination CIDR</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>Route ID</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Network Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NetworkId")
        public Long networkId;

        /**
         * <p>Unique identifier of the resource group to which it belongs</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Unique identifier of network resource</p>
         * 
         * <strong>example:</strong>
         * <p>ns-679XXXXXX</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListRoutesResponseBodyPagingInfoRouteList build(java.util.Map<String, ?> map) throws Exception {
            ListRoutesResponseBodyPagingInfoRouteList self = new ListRoutesResponseBodyPagingInfoRouteList();
            return TeaModel.build(map, self);
        }

        public ListRoutesResponseBodyPagingInfoRouteList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRoutesResponseBodyPagingInfoRouteList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public ListRoutesResponseBodyPagingInfoRouteList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRoutesResponseBodyPagingInfoRouteList setNetworkId(Long networkId) {
            this.networkId = networkId;
            return this;
        }
        public Long getNetworkId() {
            return this.networkId;
        }

        public ListRoutesResponseBodyPagingInfoRouteList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRoutesResponseBodyPagingInfoRouteList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class ListRoutesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of network resource routing information obtained.</p>
         */
        @NameInMap("RouteList")
        public java.util.List<ListRoutesResponseBodyPagingInfoRouteList> routeList;

        /**
         * <p>All data entries</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRoutesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRoutesResponseBodyPagingInfo self = new ListRoutesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListRoutesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRoutesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRoutesResponseBodyPagingInfo setRouteList(java.util.List<ListRoutesResponseBodyPagingInfoRouteList> routeList) {
            this.routeList = routeList;
            return this;
        }
        public java.util.List<ListRoutesResponseBodyPagingInfoRouteList> getRouteList() {
            return this.routeList;
        }

        public ListRoutesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
