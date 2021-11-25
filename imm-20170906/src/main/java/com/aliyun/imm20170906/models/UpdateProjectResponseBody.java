// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateProjectResponseBody extends TeaModel {
    @NameInMap("CU")
    public Integer CU;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Project")
    public String project;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("Type")
    public String type;

    public static UpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponseBody self = new UpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponseBody setCU(Integer CU) {
        this.CU = CU;
        return this;
    }
    public Integer getCU() {
        return this.CU;
    }

    public UpdateProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UpdateProjectResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public UpdateProjectResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateProjectResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectResponseBody setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public UpdateProjectResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
