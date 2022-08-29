// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetProjectDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailResponseBody self = new GetProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetProjectDetailResponseBody setData(GetProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public GetProjectDetailResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectDetailResponseBodyDataMembers extends TeaModel {
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

        public static GetProjectDetailResponseBodyDataMembers build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseBodyDataMembers self = new GetProjectDetailResponseBodyDataMembers();
            return TeaModel.build(map, self);
        }

        public GetProjectDetailResponseBodyDataMembers setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetProjectDetailResponseBodyDataMembers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectDetailResponseBodyDataMembers setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetProjectDetailResponseBodyDataMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetProjectDetailResponseBodyDataMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public GetProjectDetailResponseBodyDataMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetProjectDetailResponseBodyData extends TeaModel {
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
        public java.util.List<GetProjectDetailResponseBodyDataMembers> members;

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

        public static GetProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseBodyData self = new GetProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectDetailResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetProjectDetailResponseBodyData setCsccProjectId(Long csccProjectId) {
            this.csccProjectId = csccProjectId;
            return this;
        }
        public Long getCsccProjectId() {
            return this.csccProjectId;
        }

        public GetProjectDetailResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetProjectDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectDetailResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetProjectDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProjectDetailResponseBodyData setMembers(java.util.List<GetProjectDetailResponseBodyDataMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<GetProjectDetailResponseBodyDataMembers> getMembers() {
            return this.members;
        }

        public GetProjectDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectDetailResponseBodyData setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetProjectDetailResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetProjectDetailResponseBodyData setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetProjectDetailResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetProjectDetailResponseBodyData setProjectModeList(java.util.List<Integer> projectModeList) {
            this.projectModeList = projectModeList;
            return this;
        }
        public java.util.List<Integer> getProjectModeList() {
            return this.projectModeList;
        }

        public GetProjectDetailResponseBodyData setProjectStatus(Integer projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public Integer getProjectStatus() {
            return this.projectStatus;
        }

        public GetProjectDetailResponseBodyData setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public GetProjectDetailResponseBodyData setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

}
