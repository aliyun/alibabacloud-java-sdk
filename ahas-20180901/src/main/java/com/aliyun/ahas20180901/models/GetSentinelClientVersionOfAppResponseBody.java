// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelClientVersionOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSentinelClientVersionOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSentinelClientVersionOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelClientVersionOfAppResponseBody self = new GetSentinelClientVersionOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSentinelClientVersionOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSentinelClientVersionOfAppResponseBody setData(GetSentinelClientVersionOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSentinelClientVersionOfAppResponseBodyData getData() {
        return this.data;
    }

    public GetSentinelClientVersionOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSentinelClientVersionOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSentinelClientVersionOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSentinelClientVersionOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("MachineCount")
        public Integer machineCount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VersionMap")
        public java.util.Map<String, ?> versionMap;

        public static GetSentinelClientVersionOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSentinelClientVersionOfAppResponseBodyData self = new GetSentinelClientVersionOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSentinelClientVersionOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSentinelClientVersionOfAppResponseBodyData setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public GetSentinelClientVersionOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSentinelClientVersionOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSentinelClientVersionOfAppResponseBodyData setVersionMap(java.util.Map<String, ?> versionMap) {
            this.versionMap = versionMap;
            return this;
        }
        public java.util.Map<String, ?> getVersionMap() {
            return this.versionMap;
        }

    }

}
