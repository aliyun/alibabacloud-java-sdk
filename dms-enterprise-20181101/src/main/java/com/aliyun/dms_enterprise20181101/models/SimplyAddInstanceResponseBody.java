// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SimplyAddInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Instance")
    public SimplyAddInstanceResponseBodyInstance instance;

    /**
     * <strong>example:</strong>
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SimplyAddInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SimplyAddInstanceResponseBody self = new SimplyAddInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SimplyAddInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SimplyAddInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SimplyAddInstanceResponseBody setInstance(SimplyAddInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public SimplyAddInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public SimplyAddInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SimplyAddInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SimplyAddInstanceResponseBodyInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>188****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        public static SimplyAddInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            SimplyAddInstanceResponseBodyInstance self = new SimplyAddInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public SimplyAddInstanceResponseBodyInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public SimplyAddInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SimplyAddInstanceResponseBodyInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
