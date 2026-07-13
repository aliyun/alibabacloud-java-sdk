// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerBootstrapOptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWorkerBootstrapOptionsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkerBootstrapOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerBootstrapOptionsResponseBody self = new GetWorkerBootstrapOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkerBootstrapOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkerBootstrapOptionsResponseBody setData(GetWorkerBootstrapOptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkerBootstrapOptionsResponseBodyData getData() {
        return this.data;
    }

    public GetWorkerBootstrapOptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkerBootstrapOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkerBootstrapOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkerBootstrapOptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions extends TeaModel {
        @NameInMap("Available")
        public Boolean available;

        @NameInMap("NetworkType")
        public String networkType;

        public static GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions self = new GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions();
            return TeaModel.build(map, self);
        }

        public GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class GetWorkerBootstrapOptionsResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkOptions")
        public java.util.List<GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions> networkOptions;

        public static GetWorkerBootstrapOptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerBootstrapOptionsResponseBodyData self = new GetWorkerBootstrapOptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkerBootstrapOptionsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkerBootstrapOptionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerBootstrapOptionsResponseBodyData setNetworkOptions(java.util.List<GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions> networkOptions) {
            this.networkOptions = networkOptions;
            return this;
        }
        public java.util.List<GetWorkerBootstrapOptionsResponseBodyDataNetworkOptions> getNetworkOptions() {
            return this.networkOptions;
        }

    }

}
