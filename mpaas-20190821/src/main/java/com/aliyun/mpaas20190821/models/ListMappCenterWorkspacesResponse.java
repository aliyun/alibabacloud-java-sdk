// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMappCenterWorkspacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ListMappCenterWorkspaceResult")
    @Validation(required = true)
    public ListMappCenterWorkspacesResponseListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

    public static ListMappCenterWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterWorkspacesResponse self = new ListMappCenterWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMappCenterWorkspacesResponseListMappCenterWorkspaceResultMappCenterWorkspaceList extends TeaModel {
        @NameInMap("CompatibleId")
        @Validation(required = true)
        public String compatibleId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Uid")
        @Validation(required = true)
        public Long uid;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("WorkspaceId")
        @Validation(required = true)
        public String workspaceId;

        @NameInMap("Zones")
        @Validation(required = true)
        public String zones;

        public static ListMappCenterWorkspacesResponseListMappCenterWorkspaceResultMappCenterWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterWorkspacesResponseListMappCenterWorkspaceResultMappCenterWorkspaceList self = new ListMappCenterWorkspacesResponseListMappCenterWorkspaceResultMappCenterWorkspaceList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMappCenterWorkspacesResponseListMappCenterWorkspaceResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("MappCenterWorkspaceList")
        @Validation(required = true)
        public java.util.List<ListMappCenterWorkspacesResponseListMappCenterWorkspaceResultMappCenterWorkspaceList> mappCenterWorkspaceList;

        public static ListMappCenterWorkspacesResponseListMappCenterWorkspaceResult build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterWorkspacesResponseListMappCenterWorkspaceResult self = new ListMappCenterWorkspacesResponseListMappCenterWorkspaceResult();
            return TeaModel.build(map, self);
        }

    }

}
