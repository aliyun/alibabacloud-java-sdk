// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponseBody extends TeaModel {
    // 创建时间，毫秒
    @NameInMap("createTime")
    public Long createTime;

    // 描述
    @NameInMap("description")
    public String description;

    // 实例ID
    @NameInMap("instanceId")
    public String instanceId;

    // 外部ID
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    // 机构ID
    @NameInMap("organizationalUnitId")
    public String organizationalUnitId;

    // 机构名称
    @NameInMap("organizationalUnitName")
    public String organizationalUnitName;

    // 来源ID
    @NameInMap("organizationalUnitSourceId")
    public String organizationalUnitSourceId;

    // 来源类型
    @NameInMap("organizationalUnitSourceType")
    public String organizationalUnitSourceType;

    // 父机构ID
    @NameInMap("parentId")
    public String parentId;

    // 最近一次更新时间，毫秒
    @NameInMap("updateTime")
    public Long updateTime;

    public static GetOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitResponseBody self = new GetOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetOrganizationalUnitResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetOrganizationalUnitResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
        this.organizationalUnitExternalId = organizationalUnitExternalId;
        return this;
    }
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
        this.organizationalUnitSourceId = organizationalUnitSourceId;
        return this;
    }
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
        this.organizationalUnitSourceType = organizationalUnitSourceType;
        return this;
    }
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

    public GetOrganizationalUnitResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetOrganizationalUnitResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
