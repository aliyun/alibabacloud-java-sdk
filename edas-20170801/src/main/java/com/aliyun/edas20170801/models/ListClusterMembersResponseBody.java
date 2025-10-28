// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterMembersResponseBody extends TeaModel {
    /**
     * <p>The information about the ECS instances in the cluster.</p>
     */
    @NameInMap("ClusterMemberPage")
    public ListClusterMembersResponseBodyClusterMemberPage clusterMemberPage;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterMembersResponseBody self = new ListClusterMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterMembersResponseBody setClusterMemberPage(ListClusterMembersResponseBodyClusterMemberPage clusterMemberPage) {
        this.clusterMemberPage = clusterMemberPage;
        return this;
    }
    public ListClusterMembersResponseBodyClusterMemberPage getClusterMemberPage() {
        return this.clusterMemberPage;
    }

    public ListClusterMembersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>52984524-6d48-4bbd-85f2-a34b0e5b****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The ID of the ECS instance in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>adb03eeb-3adf-4d7e-afe1-03d1ad45****</p>
         */
        @NameInMap("ClusterMemberId")
        public String clusterMemberId;

        /**
         * <p>The timestamp when the ECS instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1573281038175</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zej4i2jdf3ntwhj****</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <p>The unique ID of the elastic compute unit (ECU). You can run the <code>dmidecode</code> command on the ECS instance to query the ECU ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70ed3f59-b476-49aa-be09-9e6c375d****</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The private IP address for the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The state of the ECS instance. Valid values:</p>
         * <ul>
         * <li>1: The instance is running.</li>
         * <li>0: The instance is being converted.</li>
         * <li>\-1: The instance fails to be converted.</li>
         * <li>\-2: The instance is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The timestamp when the ECS instance was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1573281041113</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember build(java.util.Map<String, ?> map) throws Exception {
            ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember self = new ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember();
            return TeaModel.build(map, self);
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setClusterMemberId(String clusterMemberId) {
            this.clusterMemberId = clusterMemberId;
            return this;
        }
        public String getClusterMemberId() {
            return this.clusterMemberId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListClusterMembersResponseBodyClusterMemberPageClusterMemberList extends TeaModel {
        @NameInMap("ClusterMember")
        public java.util.List<ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember> clusterMember;

        public static ListClusterMembersResponseBodyClusterMemberPageClusterMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterMembersResponseBodyClusterMemberPageClusterMemberList self = new ListClusterMembersResponseBodyClusterMemberPageClusterMemberList();
            return TeaModel.build(map, self);
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberList setClusterMember(java.util.List<ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember> clusterMember) {
            this.clusterMember = clusterMember;
            return this;
        }
        public java.util.List<ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember> getClusterMember() {
            return this.clusterMember;
        }

    }

    public static class ListClusterMembersResponseBodyClusterMemberPage extends TeaModel {
        /**
         * <p>The list of ECS instances in the cluster.</p>
         */
        @NameInMap("ClusterMemberList")
        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberList clusterMemberList;

        /**
         * <p>The page number of the returned page. If this parameter is not returned, the first page is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of ECS instances returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of pages returned when all ECS instances are returned based on the specified PageSize parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListClusterMembersResponseBodyClusterMemberPage build(java.util.Map<String, ?> map) throws Exception {
            ListClusterMembersResponseBodyClusterMemberPage self = new ListClusterMembersResponseBodyClusterMemberPage();
            return TeaModel.build(map, self);
        }

        public ListClusterMembersResponseBodyClusterMemberPage setClusterMemberList(ListClusterMembersResponseBodyClusterMemberPageClusterMemberList clusterMemberList) {
            this.clusterMemberList = clusterMemberList;
            return this;
        }
        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberList getClusterMemberList() {
            return this.clusterMemberList;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
