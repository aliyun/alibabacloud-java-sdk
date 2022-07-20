// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public GetProjectResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectResponseBody setData(GetProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectResponseBodyData getData() {
        return this.data;
    }

    public GetProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectResponseBodyDataProjectQuotaLimit extends TeaModel {
        // key - districtId
        @NameInMap("DistrictLimitMap")
        public java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> districtLimitMap;

        // 限制类型 ：目前默认 - ReserveContainer
        @NameInMap("LimitType")
        public String limitType;

        public static GetProjectResponseBodyDataProjectQuotaLimit build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataProjectQuotaLimit self = new GetProjectResponseBodyDataProjectQuotaLimit();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataProjectQuotaLimit setDistrictLimitMap(java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> districtLimitMap) {
            this.districtLimitMap = districtLimitMap;
            return this;
        }
        public java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> getDistrictLimitMap() {
            return this.districtLimitMap;
        }

        public GetProjectResponseBodyDataProjectQuotaLimit setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class GetProjectResponseBodyData extends TeaModel {
        // 项目关联的应用数量
        @NameInMap("BoundAppNums")
        public Long boundAppNums;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectMemo")
        public String projectMemo;

        @NameInMap("ProjectName")
        public String projectName;

        // key : districtId
        @NameInMap("ProjectQuotaLimit")
        public GetProjectResponseBodyDataProjectQuotaLimit projectQuotaLimit;

        public static GetProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyData self = new GetProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyData setBoundAppNums(Long boundAppNums) {
            this.boundAppNums = boundAppNums;
            return this;
        }
        public Long getBoundAppNums() {
            return this.boundAppNums;
        }

        public GetProjectResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetProjectResponseBodyData setProjectMemo(String projectMemo) {
            this.projectMemo = projectMemo;
            return this;
        }
        public String getProjectMemo() {
            return this.projectMemo;
        }

        public GetProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectResponseBodyData setProjectQuotaLimit(GetProjectResponseBodyDataProjectQuotaLimit projectQuotaLimit) {
            this.projectQuotaLimit = projectQuotaLimit;
            return this;
        }
        public GetProjectResponseBodyDataProjectQuotaLimit getProjectQuotaLimit() {
            return this.projectQuotaLimit;
        }

    }

}
