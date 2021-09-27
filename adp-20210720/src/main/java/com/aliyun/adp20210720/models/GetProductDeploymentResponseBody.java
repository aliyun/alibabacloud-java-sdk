// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductDeploymentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public GetProductDeploymentResponseBodyData data;

    public static GetProductDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductDeploymentResponseBody self = new GetProductDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductDeploymentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductDeploymentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetProductDeploymentResponseBody setData(GetProductDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductDeploymentResponseBodyData getData() {
        return this.data;
    }

    public static class GetProductDeploymentResponseBodyData extends TeaModel {
        @NameInMap("envUID")
        public String envUID;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public String uid;

        @NameInMap("envParams")
        public String envParams;

        public static GetProductDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductDeploymentResponseBodyData self = new GetProductDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductDeploymentResponseBodyData setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public GetProductDeploymentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProductDeploymentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductDeploymentResponseBodyData setEnvParams(String envParams) {
            this.envParams = envParams;
            return this;
        }
        public String getEnvParams() {
            return this.envParams;
        }

    }

}
