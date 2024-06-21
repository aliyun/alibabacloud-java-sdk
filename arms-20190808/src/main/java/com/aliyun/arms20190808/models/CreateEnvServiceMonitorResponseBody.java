// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvServiceMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public CreateEnvServiceMonitorResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnvServiceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvServiceMonitorResponseBody self = new CreateEnvServiceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvServiceMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnvServiceMonitorResponseBody setData(CreateEnvServiceMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvServiceMonitorResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvServiceMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEnvServiceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEnvServiceMonitorResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether targets are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>Match successful.</p>
         */
        @NameInMap("MatchedMsg")
        public String matchedMsg;

        /**
         * <p>The number of matched targets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchedTargetCount")
        public Integer matchedTargetCount;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the created ServiceMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-admin1</p>
         */
        @NameInMap("ServiceMonitorName")
        public String serviceMonitorName;

        public static CreateEnvServiceMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvServiceMonitorResponseBodyData self = new CreateEnvServiceMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvServiceMonitorResponseBodyData setMatchedMsg(String matchedMsg) {
            this.matchedMsg = matchedMsg;
            return this;
        }
        public String getMatchedMsg() {
            return this.matchedMsg;
        }

        public CreateEnvServiceMonitorResponseBodyData setMatchedTargetCount(Integer matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public Integer getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public CreateEnvServiceMonitorResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateEnvServiceMonitorResponseBodyData setServiceMonitorName(String serviceMonitorName) {
            this.serviceMonitorName = serviceMonitorName;
            return this;
        }
        public String getServiceMonitorName() {
            return this.serviceMonitorName;
        }

    }

}
