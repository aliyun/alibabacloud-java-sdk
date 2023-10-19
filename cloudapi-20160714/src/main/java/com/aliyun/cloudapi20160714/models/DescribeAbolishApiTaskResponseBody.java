// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAbolishApiTaskResponseBody extends TeaModel {
    /**
     * <p>The result returned.</p>
     */
    @NameInMap("ApiAbolishResults")
    public DescribeAbolishApiTaskResponseBodyApiAbolishResults apiAbolishResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAbolishApiTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbolishApiTaskResponseBody self = new DescribeAbolishApiTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAbolishApiTaskResponseBody setApiAbolishResults(DescribeAbolishApiTaskResponseBodyApiAbolishResults apiAbolishResults) {
        this.apiAbolishResults = apiAbolishResults;
        return this;
    }
    public DescribeAbolishApiTaskResponseBodyApiAbolishResults getApiAbolishResults() {
        return this.apiAbolishResults;
    }

    public DescribeAbolishApiTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult extends TeaModel {
        /**
         * <p>The unpublishing status.</p>
         */
        @NameInMap("AbolishStatus")
        public String abolishStatus;

        /**
         * <p>The name of the API.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The ID of the API.</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the API group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the runtime environment.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <br>
         * <p>*   **RELEASE**</p>
         * <p>*   **TEST**</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult self = new DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult();
            return TeaModel.build(map, self);
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setAbolishStatus(String abolishStatus) {
            this.abolishStatus = abolishStatus;
            return this;
        }
        public String getAbolishStatus() {
            return this.abolishStatus;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeAbolishApiTaskResponseBodyApiAbolishResults extends TeaModel {
        @NameInMap("ApiAbolishResult")
        public java.util.List<DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult> apiAbolishResult;

        public static DescribeAbolishApiTaskResponseBodyApiAbolishResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbolishApiTaskResponseBodyApiAbolishResults self = new DescribeAbolishApiTaskResponseBodyApiAbolishResults();
            return TeaModel.build(map, self);
        }

        public DescribeAbolishApiTaskResponseBodyApiAbolishResults setApiAbolishResult(java.util.List<DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult> apiAbolishResult) {
            this.apiAbolishResult = apiAbolishResult;
            return this;
        }
        public java.util.List<DescribeAbolishApiTaskResponseBodyApiAbolishResultsApiAbolishResult> getApiAbolishResult() {
            return this.apiAbolishResult;
        }

    }

}
