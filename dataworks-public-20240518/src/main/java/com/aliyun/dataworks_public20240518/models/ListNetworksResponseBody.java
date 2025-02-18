// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNetworksResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListNetworksResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request is successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworksResponseBody self = new ListNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworksResponseBody setPagingInfo(ListNetworksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListNetworksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNetworksResponseBodyPagingInfoNetworkList extends TeaModel {
        /**
         * <p>The time when the network resource was created. The value is a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who creates the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11075500042XXXXX</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the serverless resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze13vamugr7jenXXXXX</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the network resource. Valid values: Pending, Creating, Running, Deleting, and Deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListNetworksResponseBodyPagingInfoNetworkList build(java.util.Map<String, ?> map) throws Exception {
            ListNetworksResponseBodyPagingInfoNetworkList self = new ListNetworksResponseBodyPagingInfoNetworkList();
            return TeaModel.build(map, self);
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworksResponseBodyPagingInfoNetworkList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListNetworksResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The network resources of the serverless resource group.</p>
         */
        @NameInMap("NetworkList")
        public java.util.List<ListNetworksResponseBodyPagingInfoNetworkList> networkList;

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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNetworksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNetworksResponseBodyPagingInfo self = new ListNetworksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListNetworksResponseBodyPagingInfo setNetworkList(java.util.List<ListNetworksResponseBodyPagingInfoNetworkList> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<ListNetworksResponseBodyPagingInfoNetworkList> getNetworkList() {
            return this.networkList;
        }

        public ListNetworksResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNetworksResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNetworksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
