// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetStackResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the method stack.</p>
     */
    @NameInMap("StackInfo")
    public java.util.List<GetStackResponseBodyStackInfo> stackInfo;

    public static GetStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponseBody self = new GetStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResponseBody setStackInfo(java.util.List<GetStackResponseBodyStackInfo> stackInfo) {
        this.stackInfo = stackInfo;
        return this;
    }
    public java.util.List<GetStackResponseBodyStackInfo> getStackInfo() {
        return this.stackInfo;
    }

    public static class GetStackResponseBodyStackInfoExtInfo extends TeaModel {
        /**
         * <p>The content of the custom parameter.</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The type of the custom parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStackResponseBodyStackInfoExtInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyStackInfoExtInfo self = new GetStackResponseBodyStackInfoExtInfo();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyStackInfoExtInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetStackResponseBodyStackInfoExtInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStackResponseBodyStackInfo extends TeaModel {
        /**
         * <p>The name of the operation.</p>
         */
        @NameInMap("Api")
        public String api;

        /**
         * <p>The duration. Unit: milliseconds.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Exception")
        public String exception;

        /**
         * <p>The information about the array object.</p>
         */
        @NameInMap("ExtInfo")
        public GetStackResponseBodyStackInfoExtInfo extInfo;

        /**
         * <p>The number of rows in the method stack information.</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The ID of the RPC mode.</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The start time of the call method.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetStackResponseBodyStackInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyStackInfo self = new GetStackResponseBodyStackInfo();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyStackInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public GetStackResponseBodyStackInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetStackResponseBodyStackInfo setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public GetStackResponseBodyStackInfo setExtInfo(GetStackResponseBodyStackInfoExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public GetStackResponseBodyStackInfoExtInfo getExtInfo() {
            return this.extInfo;
        }

        public GetStackResponseBodyStackInfo setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public GetStackResponseBodyStackInfo setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetStackResponseBodyStackInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetStackResponseBodyStackInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
