// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeploymentRecordResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public GetEnvironmentDeploymentRecordResponseBodyData data;

    public static GetEnvironmentDeploymentRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeploymentRecordResponseBody self = new GetEnvironmentDeploymentRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeploymentRecordResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetEnvironmentDeploymentRecordResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetEnvironmentDeploymentRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEnvironmentDeploymentRecordResponseBody setData(GetEnvironmentDeploymentRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentDeploymentRecordResponseBodyData getData() {
        return this.data;
    }

    public static class GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        @NameInMap("envParams")
        public String envParams;

        public static GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo self = new GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo setEnvParams(String envParams) {
            this.envParams = envParams;
            return this;
        }
        public String getEnvParams() {
            return this.envParams;
        }

    }

    public static class GetEnvironmentDeploymentRecordResponseBodyData extends TeaModel {
        @NameInMap("envDeploymentInfo")
        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo envDeploymentInfo;

        public static GetEnvironmentDeploymentRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentDeploymentRecordResponseBodyData self = new GetEnvironmentDeploymentRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentDeploymentRecordResponseBodyData setEnvDeploymentInfo(GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo envDeploymentInfo) {
            this.envDeploymentInfo = envDeploymentInfo;
            return this;
        }
        public GetEnvironmentDeploymentRecordResponseBodyDataEnvDeploymentInfo getEnvDeploymentInfo() {
            return this.envDeploymentInfo;
        }

    }

}
