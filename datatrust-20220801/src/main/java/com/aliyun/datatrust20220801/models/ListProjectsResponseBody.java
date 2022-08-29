// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListProjectsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectsResponseBody setData(ListProjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectsResponseBodyData getData() {
        return this.data;
    }

    public ListProjectsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectsResponseBodyDataContentMembers extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("UserId")
        public String userId;

        public static ListProjectsResponseBodyDataContentMembers build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataContentMembers self = new ListProjectsResponseBodyDataContentMembers();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataContentMembers setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListProjectsResponseBodyDataContentMembers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectsResponseBodyDataContentMembers setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public ListProjectsResponseBodyDataContentMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListProjectsResponseBodyDataContentMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public ListProjectsResponseBodyDataContentMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListProjectsResponseBodyDataContent extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("CsccProjectId")
        public Long csccProjectId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Members")
        public java.util.List<ListProjectsResponseBodyDataContentMembers> members;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProjectModeList")
        public java.util.List<Integer> projectModeList;

        @NameInMap("ProjectStatus")
        public Integer projectStatus;

        @NameInMap("TransportHost")
        public String transportHost;

        @NameInMap("TransportPort")
        public String transportPort;

        public static ListProjectsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyDataContent self = new ListProjectsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyDataContent setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListProjectsResponseBodyDataContent setCsccProjectId(Long csccProjectId) {
            this.csccProjectId = csccProjectId;
            return this;
        }
        public Long getCsccProjectId() {
            return this.csccProjectId;
        }

        public ListProjectsResponseBodyDataContent setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListProjectsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectsResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectsResponseBodyDataContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListProjectsResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectsResponseBodyDataContent setMembers(java.util.List<ListProjectsResponseBodyDataContentMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataContentMembers> getMembers() {
            return this.members;
        }

        public ListProjectsResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyDataContent setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListProjectsResponseBodyDataContent setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListProjectsResponseBodyDataContent setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListProjectsResponseBodyDataContent setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListProjectsResponseBodyDataContent setProjectModeList(java.util.List<Integer> projectModeList) {
            this.projectModeList = projectModeList;
            return this;
        }
        public java.util.List<Integer> getProjectModeList() {
            return this.projectModeList;
        }

        public ListProjectsResponseBodyDataContent setProjectStatus(Integer projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public Integer getProjectStatus() {
            return this.projectStatus;
        }

        public ListProjectsResponseBodyDataContent setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public ListProjectsResponseBodyDataContent setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

    public static class ListProjectsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListProjectsResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyData self = new ListProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyData setContent(java.util.List<ListProjectsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProjectsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
