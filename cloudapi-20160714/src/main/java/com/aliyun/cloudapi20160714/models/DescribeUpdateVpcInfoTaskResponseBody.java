// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateVpcInfoTaskResponseBody extends TeaModel {
    @NameInMap("ApiUpdateVpcInfoResults")
    public DescribeUpdateVpcInfoTaskResponseBodyApiUpdateVpcInfoResults apiUpdateVpcInfoResults;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
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
         * <strong>example:</strong>
         * <p>api_test2</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>86364e7c166c47ba819b3f8f95ac0913</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <strong>example:</strong>
         * <p>Success. Request Success.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>e8da6f6346184da9a30d0dc1888b1f3b</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>fe952b95072747e2a8dfd336bcff8d7f</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <strong>example:</strong>
         * <p>success</p>
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
