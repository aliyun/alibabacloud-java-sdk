// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvPodMonitorResponseBody extends TeaModel {
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
    public UpdateEnvPodMonitorResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnvPodMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvPodMonitorResponseBody self = new UpdateEnvPodMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvPodMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEnvPodMonitorResponseBody setData(UpdateEnvPodMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEnvPodMonitorResponseBodyData getData() {
        return this.data;
    }

    public UpdateEnvPodMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEnvPodMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateEnvPodMonitorResponseBodyData extends TeaModel {
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

        public static UpdateEnvPodMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvPodMonitorResponseBodyData self = new UpdateEnvPodMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEnvPodMonitorResponseBodyData setMatchedMsg(String matchedMsg) {
            this.matchedMsg = matchedMsg;
            return this;
        }
        public String getMatchedMsg() {
            return this.matchedMsg;
        }

        public UpdateEnvPodMonitorResponseBodyData setMatchedTargetCount(String matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public String getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

    }

}
