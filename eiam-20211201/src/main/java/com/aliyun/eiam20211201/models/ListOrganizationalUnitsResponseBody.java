// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> organizationalUnits;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsResponseBody self = new ListOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsResponseBody setOrganizationalUnits(java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public ListOrganizationalUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationalUnitsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsResponseBodyOrganizationalUnits extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrganizationalUnitExternalId")
        public String organizationalUnitExternalId;

        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        @NameInMap("OrganizationalUnitSourceId")
        public String organizationalUnitSourceId;

        @NameInMap("OrganizationalUnitSourceType")
        public String organizationalUnitSourceType;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListOrganizationalUnitsResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsResponseBodyOrganizationalUnits self = new ListOrganizationalUnitsResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
