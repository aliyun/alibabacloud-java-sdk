// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyProjectRequest extends TeaModel {
    @NameInMap("BoundAppIdList")
    public java.util.List<String> boundAppIdList;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // project Id
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectMemo")
    public String projectMemo;

    // project name
    @NameInMap("ProjectName")
    public String projectName;

    // key : districtId
    @NameInMap("ProjectQuotaLimit")
    public ModifyProjectRequestProjectQuotaLimit projectQuotaLimit;

    public static ModifyProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectRequest self = new ModifyProjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectRequest setBoundAppIdList(java.util.List<String> boundAppIdList) {
        this.boundAppIdList = boundAppIdList;
        return this;
    }
    public java.util.List<String> getBoundAppIdList() {
        return this.boundAppIdList;
    }

    public ModifyProjectRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ModifyProjectRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ModifyProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyProjectRequest setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
        return this;
    }
    public String getProjectMemo() {
        return this.projectMemo;
    }

    public ModifyProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyProjectRequest setProjectQuotaLimit(ModifyProjectRequestProjectQuotaLimit projectQuotaLimit) {
        this.projectQuotaLimit = projectQuotaLimit;
        return this;
    }
    public ModifyProjectRequestProjectQuotaLimit getProjectQuotaLimit() {
        return this.projectQuotaLimit;
    }

    public static class ModifyProjectRequestProjectQuotaLimit extends TeaModel {
        // key - districtId
        @NameInMap("DistrictLimitMap")
        public java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> districtLimitMap;

        // 限制类型 ：目前默认 - ReserveContainer
        @NameInMap("LimitType")
        public String limitType;

        public static ModifyProjectRequestProjectQuotaLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyProjectRequestProjectQuotaLimit self = new ModifyProjectRequestProjectQuotaLimit();
            return TeaModel.build(map, self);
        }

        public ModifyProjectRequestProjectQuotaLimit setDistrictLimitMap(java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> districtLimitMap) {
            this.districtLimitMap = districtLimitMap;
            return this;
        }
        public java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> getDistrictLimitMap() {
            return this.districtLimitMap;
        }

        public ModifyProjectRequestProjectQuotaLimit setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

}
