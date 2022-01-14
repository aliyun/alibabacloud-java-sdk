// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterWorkspacesResponseBody extends TeaModel {
    @NameInMap("ListMappCenterWorkspaceResult")
    public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMappCenterWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterWorkspacesResponseBody self = new ListMappCenterWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMappCenterWorkspacesResponseBody setListMappCenterWorkspaceResult(ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult listMappCenterWorkspaceResult) {
        this.listMappCenterWorkspaceResult = listMappCenterWorkspaceResult;
        return this;
    }
    public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult getListMappCenterWorkspaceResult() {
        return this.listMappCenterWorkspaceResult;
    }

    public ListMappCenterWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMappCenterWorkspacesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMappCenterWorkspacesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList extends TeaModel {
        @NameInMap("CompatibleId")
        public String compatibleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Zones")
        public String zones;

        public static ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList self = new ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList();
            return TeaModel.build(map, self);
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setCompatibleId(String compatibleId) {
            this.compatibleId = compatibleId;
            return this;
        }
        public String getCompatibleId() {
            return this.compatibleId;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList setZones(String zones) {
            this.zones = zones;
            return this;
        }
        public String getZones() {
            return this.zones;
        }

    }

    public static class ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult extends TeaModel {
        @NameInMap("MappCenterWorkspaceList")
        public java.util.List<ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList> mappCenterWorkspaceList;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("UserId")
        public String userId;

        public static ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult self = new ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult();
            return TeaModel.build(map, self);
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult setMappCenterWorkspaceList(java.util.List<ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList> mappCenterWorkspaceList) {
            this.mappCenterWorkspaceList = mappCenterWorkspaceList;
            return this;
        }
        public java.util.List<ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResultMappCenterWorkspaceList> getMappCenterWorkspaceList() {
            return this.mappCenterWorkspaceList;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMappCenterWorkspacesResponseBodyListMappCenterWorkspaceResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
