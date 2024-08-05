// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployApiTaskResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("DeployedResults")
    public DescribeDeployApiTaskResponseBodyDeployedResults deployedResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CA4B3261-F14A-5E33-8608-F75A1DF27AD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeployApiTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployApiTaskResponseBody self = new DescribeDeployApiTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployApiTaskResponseBody setDeployedResults(DescribeDeployApiTaskResponseBodyDeployedResults deployedResults) {
        this.deployedResults = deployedResults;
        return this;
    }
    public DescribeDeployApiTaskResponseBodyDeployedResults getDeployedResults() {
        return this.deployedResults;
    }

    public DescribeDeployApiTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>0433c1cd84724923b7a4f9ca1cfc249c</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <p>The deployment status of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>OVER</p>
         */
        @NameInMap("DeployedStatus")
        public String deployedStatus;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success. Request Success.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>e8da6f6346184da9a30d0dc1888b1f3b</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The runtime environment of the API. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong></li>
         * <li><strong>TEST</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult self = new DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult();
            return TeaModel.build(map, self);
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
            return this;
        }
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeDeployApiTaskResponseBodyDeployedResults extends TeaModel {
        @NameInMap("DeployedResult")
        public java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> deployedResult;

        public static DescribeDeployApiTaskResponseBodyDeployedResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployApiTaskResponseBodyDeployedResults self = new DescribeDeployApiTaskResponseBodyDeployedResults();
            return TeaModel.build(map, self);
        }

        public DescribeDeployApiTaskResponseBodyDeployedResults setDeployedResult(java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> deployedResult) {
            this.deployedResult = deployedResult;
            return this;
        }
        public java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> getDeployedResult() {
            return this.deployedResult;
        }

    }

}
