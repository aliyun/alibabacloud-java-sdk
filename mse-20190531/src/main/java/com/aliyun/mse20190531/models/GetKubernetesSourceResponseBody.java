// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetKubernetesSourceResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetKubernetesSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesSourceResponseBody self = new GetKubernetesSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKubernetesSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetKubernetesSourceResponseBody setData(java.util.List<GetKubernetesSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetKubernetesSourceResponseBodyData> getData() {
        return this.data;
    }

    public GetKubernetesSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKubernetesSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKubernetesSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKubernetesSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKubernetesSourceResponseBodyData extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Name")
        public String name;

        public static GetKubernetesSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKubernetesSourceResponseBodyData self = new GetKubernetesSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKubernetesSourceResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetKubernetesSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
