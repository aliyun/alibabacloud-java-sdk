// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseSourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetMseSourceResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned, such as the "TaskId not found" message.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMseSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMseSourceResponseBody self = new GetMseSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMseSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetMseSourceResponseBody setData(java.util.List<GetMseSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMseSourceResponseBodyData> getData() {
        return this.data;
    }

    public GetMseSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMseSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMseSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMseSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMseSourceResponseBodyData extends TeaModel {
        /**
         * <p>The type.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>code</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMseSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMseSourceResponseBodyData self = new GetMseSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMseSourceResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetMseSourceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMseSourceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMseSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMseSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
