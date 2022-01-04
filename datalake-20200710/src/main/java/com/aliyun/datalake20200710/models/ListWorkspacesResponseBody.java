// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListWorkspacesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setData(java.util.List<ListWorkspacesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspacesResponseBodyData extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListWorkspacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyData self = new ListWorkspacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListWorkspacesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListWorkspacesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkspacesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkspacesResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
