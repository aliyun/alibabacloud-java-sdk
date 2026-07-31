// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSemanticJobLogResponseBody extends TeaModel {
    /**
     * <p>The list of log segments returned by the executor. The current POP contract does not expose sqlIndex or offset externally. Log segments are returned based on the default behavior of the operation.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSemanticJobLogResponseBodyData> data;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSemanticJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticJobLogResponseBody self = new GetSemanticJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSemanticJobLogResponseBody setData(java.util.List<GetSemanticJobLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSemanticJobLogResponseBodyData> getData() {
        return this.data;
    }

    public GetSemanticJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSemanticJobLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSemanticJobLogResponseBodyData extends TeaModel {
        /**
         * <p>The raw log text returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic job started</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>Indicates whether the current log segment has been read to the end. A value of true indicates that no more content follows this segment.</p>
         */
        @NameInMap("LogEnd")
        public Boolean logEnd;

        public static GetSemanticJobLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSemanticJobLogResponseBodyData self = new GetSemanticJobLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSemanticJobLogResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetSemanticJobLogResponseBodyData setLogEnd(Boolean logEnd) {
            this.logEnd = logEnd;
            return this;
        }
        public Boolean getLogEnd() {
            return this.logEnd;
        }

    }

}
