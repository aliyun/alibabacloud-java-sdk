// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvPodMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result, which indicates whether the operation was successful.</p>
     */
    @NameInMap("Data")
    public CreateEnvPodMonitorResponseBodyData data;

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

    public static CreateEnvPodMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvPodMonitorResponseBody self = new CreateEnvPodMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvPodMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnvPodMonitorResponseBody setData(CreateEnvPodMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvPodMonitorResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvPodMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEnvPodMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEnvPodMonitorResponseBodyData extends TeaModel {
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
        public String matchedTargetCount;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the created PodMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-admin-pm1</p>
         */
        @NameInMap("PodMonitorName")
        public String podMonitorName;

        public static CreateEnvPodMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvPodMonitorResponseBodyData self = new CreateEnvPodMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvPodMonitorResponseBodyData setMatchedMsg(String matchedMsg) {
            this.matchedMsg = matchedMsg;
            return this;
        }
        public String getMatchedMsg() {
            return this.matchedMsg;
        }

        public CreateEnvPodMonitorResponseBodyData setMatchedTargetCount(String matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public String getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public CreateEnvPodMonitorResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateEnvPodMonitorResponseBodyData setPodMonitorName(String podMonitorName) {
            this.podMonitorName = podMonitorName;
            return this;
        }
        public String getPodMonitorName() {
            return this.podMonitorName;
        }

    }

}
