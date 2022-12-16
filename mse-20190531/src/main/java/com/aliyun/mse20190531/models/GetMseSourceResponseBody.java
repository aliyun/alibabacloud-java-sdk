// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseSourceResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data structure.
    @NameInMap("Data")
    public java.util.List<GetMseSourceResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned. Valid values: 
    // 
    // - If the request is successful, a success message is returned. 
    // - If the request fails, an error message is returned, such as the "TaskId not found" message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
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
        // The endpoint of the instance.
        @NameInMap("Address")
        public String address;

        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the service source.
        @NameInMap("Name")
        public String name;

        // The type of the service source.
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
