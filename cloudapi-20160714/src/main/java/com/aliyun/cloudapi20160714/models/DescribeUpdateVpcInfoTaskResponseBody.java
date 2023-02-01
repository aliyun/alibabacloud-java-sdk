// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateVpcInfoTaskResponseBody extends TeaModel {
    /**
     * <p>The result of the task.</p>
     */
    @NameInMap("ApiUpdateVpcInfoResults")
    public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults apiUpdateVpcInfoResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpdateVpcInfoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateVpcInfoTaskResponseBody self = new DescribeUpdateVpcInfoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateVpcInfoTaskResponseBody setApiUpdateVpcInfoResults(DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults apiUpdateVpcInfoResults) {
        this.apiUpdateVpcInfoResults = apiUpdateVpcInfoResults;
        return this;
    }
    public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults getApiUpdateVpcInfoResults() {
        return this.apiUpdateVpcInfoResults;
    }

    public DescribeUpdateVpcInfoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult extends TeaModel {
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
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The environment to which the API is published.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The update status.</p>
         */
        @NameInMap("UpdateStatus")
        public String updateStatus;

        public static DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult self = new DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult();
            return TeaModel.build(map, self);
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults extends TeaModel {
        @NameInMap("ApiUpdateVpcInfoResult")
        public java.util.List<DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult> apiUpdateVpcInfoResult;

        public static DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults self = new DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults();
            return TeaModel.build(map, self);
        }

        public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults setApiUpdateVpcInfoResult(java.util.List<DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult> apiUpdateVpcInfoResult) {
            this.apiUpdateVpcInfoResult = apiUpdateVpcInfoResult;
            return this;
        }
        public java.util.List<DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResultsApiUpdateVpcInfoResult> getApiUpdateVpcInfoResult() {
            return this.apiUpdateVpcInfoResult;
        }

    }

}
