// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("BoundAppIdList")
    public java.util.List<String> boundAppIdList;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("ProjectMemo")
    public String projectMemo;

    // project name
    @NameInMap("ProjectName")
    public String projectName;

    // key : districtId
    @NameInMap("ProjectQuotaLimit")
    public CreateProjectRequestProjectQuotaLimit projectQuotaLimit;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setBoundAppIdList(java.util.List<String> boundAppIdList) {
        this.boundAppIdList = boundAppIdList;
        return this;
    }
    public java.util.List<String> getBoundAppIdList() {
        return this.boundAppIdList;
    }

    public CreateProjectRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateProjectRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public CreateProjectRequest setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
        return this;
    }
    public String getProjectMemo() {
        return this.projectMemo;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setProjectQuotaLimit(CreateProjectRequestProjectQuotaLimit projectQuotaLimit) {
        this.projectQuotaLimit = projectQuotaLimit;
        return this;
    }
    public CreateProjectRequestProjectQuotaLimit getProjectQuotaLimit() {
        return this.projectQuotaLimit;
    }

    public static class CreateProjectRequestProjectQuotaLimit extends TeaModel {
        // key - districtId
        @NameInMap("DistrictLimitMap")
        public java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> districtLimitMap;

        // 限制类型 ：目前默认 - ReserveContainer
        @NameInMap("LimitType")
        public String limitType;

        public static CreateProjectRequestProjectQuotaLimit build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestProjectQuotaLimit self = new CreateProjectRequestProjectQuotaLimit();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestProjectQuotaLimit setDistrictLimitMap(java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> districtLimitMap) {
            this.districtLimitMap = districtLimitMap;
            return this;
        }
        public java.util.Map<String, ProjectQuotaLimitDistrictLimitMapValue> getDistrictLimitMap() {
            return this.districtLimitMap;
        }

        public CreateProjectRequestProjectQuotaLimit setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

}
