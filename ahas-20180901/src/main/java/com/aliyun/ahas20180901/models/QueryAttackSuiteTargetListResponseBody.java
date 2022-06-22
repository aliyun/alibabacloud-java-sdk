// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteTargetListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAttackSuiteTargetListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackSuiteTargetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteTargetListResponseBody self = new QueryAttackSuiteTargetListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteTargetListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackSuiteTargetListResponseBody setData(java.util.List<QueryAttackSuiteTargetListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackSuiteTargetListResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackSuiteTargetListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackSuiteTargetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackSuiteTargetListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackSuiteTargetListResponseBodyData extends TeaModel {
        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("deviceIp")
        public String deviceIp;

        @NameInMap("deviceName")
        public String deviceName;

        public static QueryAttackSuiteTargetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackSuiteTargetListResponseBodyData self = new QueryAttackSuiteTargetListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackSuiteTargetListResponseBodyData setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryAttackSuiteTargetListResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryAttackSuiteTargetListResponseBodyData setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public QueryAttackSuiteTargetListResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
