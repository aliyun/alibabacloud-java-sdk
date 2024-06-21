// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvServiceMonitorResponseBody extends TeaModel {
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
    public UpdateEnvServiceMonitorResponseBodyData data;

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
     * <p>1A474FF8-7861-4D00-81B5-5BC3DA4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnvServiceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvServiceMonitorResponseBody self = new UpdateEnvServiceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvServiceMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEnvServiceMonitorResponseBody setData(UpdateEnvServiceMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEnvServiceMonitorResponseBodyData getData() {
        return this.data;
    }

    public UpdateEnvServiceMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEnvServiceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateEnvServiceMonitorResponseBodyData extends TeaModel {
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

        public static UpdateEnvServiceMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvServiceMonitorResponseBodyData self = new UpdateEnvServiceMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEnvServiceMonitorResponseBodyData setMatchedMsg(String matchedMsg) {
            this.matchedMsg = matchedMsg;
            return this;
        }
        public String getMatchedMsg() {
            return this.matchedMsg;
        }

        public UpdateEnvServiceMonitorResponseBodyData setMatchedTargetCount(String matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public String getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

    }

}
