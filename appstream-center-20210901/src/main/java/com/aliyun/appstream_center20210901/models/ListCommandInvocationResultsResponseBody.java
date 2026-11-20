// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListCommandInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>The list of command execution results. Each element corresponds to an execution record on a persistent session. If no records meet the conditions, an empty array is returned.</p>
     */
    @NameInMap("CommandInvocationResultModel")
    public java.util.List<ListCommandInvocationResultsResponseBodyCommandInvocationResultModel> commandInvocationResultModel;

    /**
     * <p>This field is not returned in the current version. Use PageNumber, PageSize, and TotalCount for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This field is not returned in the current version. Use PageNumber, PageSize, and TotalCount for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kDw2Ml****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number of the query results. In the current version, this field always returns 0 and does not echo echo request parameter PageNumber. Refer to echo request parameter for the actual value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of query results on each page. In the current version, this field always returns 0 and does not echo echo request parameter PageSize. Refer to echo request parameter for the actual value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results. If no records meet the conditions, 0 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCommandInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommandInvocationResultsResponseBody self = new ListCommandInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommandInvocationResultsResponseBody setCommandInvocationResultModel(java.util.List<ListCommandInvocationResultsResponseBodyCommandInvocationResultModel> commandInvocationResultModel) {
        this.commandInvocationResultModel = commandInvocationResultModel;
        return this;
    }
    public java.util.List<ListCommandInvocationResultsResponseBodyCommandInvocationResultModel> getCommandInvocationResultModel() {
        return this.commandInvocationResultModel;
    }

    public ListCommandInvocationResultsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCommandInvocationResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCommandInvocationResultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommandInvocationResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommandInvocationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommandInvocationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCommandInvocationResultsResponseBodyCommandInvocationResultModel extends TeaModel {
        /**
         * <p>The ID of the delivery group to which the persistent session that executed the command belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bxls9m9arax6****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The instance ID of the application that executed the command.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-azn3kmwruh1vl****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <p>The ID of the persistent session that executed the command.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3mw2fg4j****</p>
         */
        @NameInMap("AppInstancePersistentId")
        public String appInstancePersistentId;

        /**
         * <p>The time when the command finished executing. The time is displayed in UTC and follows the RFC 3339 standard in the yyyy-MM-ddTHH:mm:ssZ format. If the command has not finished executing, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-10T08:49:30Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The command execution ID, which is the same as the InvocationId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0bxls9m9ara****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        /**
         * <p>The execution status of the command on the persistent session, such as Pending (waiting for execution), Running (executing), Success (executed successfully), and Timeout (execution timed out).</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The output content generated by the command execution in raw text. If the command has not finished or has no output, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>hello world</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the command started to execute. The time is displayed in UTC and follows the RFC 3339 standard in the yyyy-MM-ddTHH:mm:ssZ format. If the command has not started to execute, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-10T08:49:24Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListCommandInvocationResultsResponseBodyCommandInvocationResultModel build(java.util.Map<String, ?> map) throws Exception {
            ListCommandInvocationResultsResponseBodyCommandInvocationResultModel self = new ListCommandInvocationResultsResponseBodyCommandInvocationResultModel();
            return TeaModel.build(map, self);
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setAppInstancePersistentId(String appInstancePersistentId) {
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }
        public String getAppInstancePersistentId() {
            return this.appInstancePersistentId;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListCommandInvocationResultsResponseBodyCommandInvocationResultModel setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
