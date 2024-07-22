// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineResponseBody extends TeaModel {
    /**
     * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
     */
    @NameInMap("Headers")
    public ListPipelineResponseBodyHeaders headers;

    /**
     * <p>The response.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the pipeline was created.</p>
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
         * <p>The time when the pipeline was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <strong>example:</strong>
         * <p>2020-08-05T03:10:38.188Z</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <strong>example:</strong>
         * <p>2020-08-05T08:43:31.757Z</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The status of the pipeline. Supported:</p>
         * <ul>
         * <li>NOT_DEPLOYED: The node is not deployed.</li>
         * <li>RUNNING</li>
         * <li>DELETED: Deleted. The console does not display this status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pipeline_test</p>
         */
        @NameInMap("pipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>NOT_DEPLOYED</p>
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
