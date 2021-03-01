// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterMembersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterMemberPage")
    public ListClusterMembersResponseBodyClusterMemberPage clusterMemberPage;

    @NameInMap("Code")
    public Integer code;

    public static ListClusterMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterMembersResponseBody self = new ListClusterMembersResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ClusterMemberId")
        public String clusterMemberId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember build(java.util.Map<String, ?> map) throws Exception {
            ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember self = new ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember();
            return TeaModel.build(map, self);
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

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setClusterMemberId(String clusterMemberId) {
            this.clusterMemberId = clusterMemberId;
            return this;
        }
        public String getClusterMemberId() {
            return this.clusterMemberId;
        }

        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberListClusterMember setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ClusterMemberList")
        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberList clusterMemberList;

        public static ListClusterMembersResponseBodyClusterMemberPage build(java.util.Map<String, ?> map) throws Exception {
            ListClusterMembersResponseBodyClusterMemberPage self = new ListClusterMembersResponseBodyClusterMemberPage();
            return TeaModel.build(map, self);
        }

        public ListClusterMembersResponseBodyClusterMemberPage setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterMembersResponseBodyClusterMemberPage setClusterMemberList(ListClusterMembersResponseBodyClusterMemberPageClusterMemberList clusterMemberList) {
            this.clusterMemberList = clusterMemberList;
            return this;
        }
        public ListClusterMembersResponseBodyClusterMemberPageClusterMemberList getClusterMemberList() {
            return this.clusterMemberList;
        }

    }

}
