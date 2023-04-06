// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetRootOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnit")
    public GetRootOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRootOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRootOrganizationalUnitResponseBody self = new GetRootOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRootOrganizationalUnitResponseBody setOrganizationalUnit(GetRootOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }
    public GetRootOrganizationalUnitResponseBodyOrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    public GetRootOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRootOrganizationalUnitResponseBodyOrganizationalUnit extends TeaModel {
        /**
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>实例ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>组织ID</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>组织名称</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>最近一次更新时间</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetRootOrganizationalUnitResponseBodyOrganizationalUnit build(java.util.Map<String, ?> map) throws Exception {
            GetRootOrganizationalUnitResponseBodyOrganizationalUnit self = new GetRootOrganizationalUnitResponseBodyOrganizationalUnit();
            return TeaModel.build(map, self);
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetRootOrganizationalUnitResponseBodyOrganizationalUnit setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
