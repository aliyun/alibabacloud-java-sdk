// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateBackendTaskResponseBody extends TeaModel {
    @NameInMap("ApiUpdateBackendResults")
    public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults apiUpdateBackendResults;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpdateBackendTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateBackendTaskResponseBody self = new DescribeUpdateBackendTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateBackendTaskResponseBody setApiUpdateBackendResults(DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults apiUpdateBackendResults) {
        this.apiUpdateBackendResults = apiUpdateBackendResults;
        return this;
    }
    public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults getApiUpdateBackendResults() {
        return this.apiUpdateBackendResults;
    }

    public DescribeUpdateBackendTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult extends TeaModel {
        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiUid")
        public String apiUid;

        @NameInMap("BackendId")
        public String backendId;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("UpdateStatus")
        public String updateStatus;

        public static DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult self = new DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult();
            return TeaModel.build(map, self);
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public String getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults extends TeaModel {
        @NameInMap("ApiUpdateBackendResult")
        public java.util.List<DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult> apiUpdateBackendResult;

        public static DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults self = new DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults();
            return TeaModel.build(map, self);
        }

        public DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResults setApiUpdateBackendResult(java.util.List<DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult> apiUpdateBackendResult) {
            this.apiUpdateBackendResult = apiUpdateBackendResult;
            return this;
        }
        public java.util.List<DescribeUpdateBackendTaskResponseBodyApiUpdateBackendResultsApiUpdateBackendResult> getApiUpdateBackendResult() {
            return this.apiUpdateBackendResult;
        }

    }

}
