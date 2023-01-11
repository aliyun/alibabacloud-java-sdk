// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetKubernetesSourceResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetKubernetesSourceResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>The ID of the ACK cluster.</p>
         */
        @NameInMap("Cluster")
        public String cluster;

        /**
         * <p>The name of the ACK cluster.</p>
         */
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
