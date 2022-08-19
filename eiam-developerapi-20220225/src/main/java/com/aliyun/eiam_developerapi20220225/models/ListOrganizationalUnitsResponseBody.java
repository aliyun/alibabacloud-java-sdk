// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListOrganizationalUnitsResponseBodyData> data;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsResponseBody self = new ListOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsResponseBody setData(java.util.List<ListOrganizationalUnitsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsResponseBodyData> getData() {
        return this.data;
    }

    public ListOrganizationalUnitsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("organizationalUnitExternalId")
        public String organizationalUnitExternalId;

        @NameInMap("organizationalUnitId")
        public String organizationalUnitId;

        @NameInMap("organizationalUnitName")
        public String organizationalUnitName;

        @NameInMap("organizationalUnitSourceId")
        public String organizationalUnitSourceId;

        @NameInMap("organizationalUnitSourceType")
        public String organizationalUnitSourceType;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("updateTime")
        public Long updateTime;

        public static ListOrganizationalUnitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsResponseBodyData self = new ListOrganizationalUnitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOrganizationalUnitsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOrganizationalUnitsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public ListOrganizationalUnitsResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListOrganizationalUnitsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
