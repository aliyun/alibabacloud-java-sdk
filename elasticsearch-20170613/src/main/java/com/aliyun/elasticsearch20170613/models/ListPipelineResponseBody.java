// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineResponseBody extends TeaModel {
    /**
     * <p>The header of the response.</p>
     */
    @NameInMap("Headers")
    public ListPipelineResponseBodyHeaders headers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListPipelineResponseBodyResult> result;

    public static ListPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineResponseBody self = new ListPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineResponseBody setHeaders(ListPipelineResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListPipelineResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineResponseBody setResult(java.util.List<ListPipelineResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPipelineResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListPipelineResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListPipelineResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineResponseBodyHeaders self = new ListPipelineResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListPipelineResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListPipelineResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the pipeline was created.</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the pipeline was updated.</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
         */
        @NameInMap("pipelineId")
        public String pipelineId;

        /**
         * <p>The status of the pipeline. Supported:</p>
         * <br>
         * <p>*   NOT_DEPLOYED: The node is not deployed.</p>
         * <p>*   RUNNING</p>
         * <p>*   DELETED: Deleted. The console does not display this status.</p>
         */
        @NameInMap("pipelineStatus")
        public String pipelineStatus;

        public static ListPipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineResponseBodyResult self = new ListPipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPipelineResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListPipelineResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListPipelineResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineResponseBodyResult setPipelineStatus(String pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

    }

}
