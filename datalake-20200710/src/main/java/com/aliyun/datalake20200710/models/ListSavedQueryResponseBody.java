// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListSavedQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSavedQueryResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueryResponseBody self = new ListSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSavedQueryResponseBody setData(java.util.List<ListSavedQueryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSavedQueryResponseBodyData> getData() {
        return this.data;
    }

    public ListSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSavedQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSavedQueryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSavedQueryResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListSavedQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSavedQueryResponseBodyData self = new ListSavedQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSavedQueryResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSavedQueryResponseBodyData setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        public ListSavedQueryResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSavedQueryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSavedQueryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSavedQueryResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSavedQueryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSavedQueryResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListSavedQueryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSavedQueryResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public ListSavedQueryResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
