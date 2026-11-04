// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobListResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other values: error codes. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryStreamPushJobListResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Request parameter error.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55<em><strong>B7-4</strong></em>-4***-8***-D3******F565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryStreamPushJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobListResponseBody self = new QueryStreamPushJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStreamPushJobListResponseBody setData(QueryStreamPushJobListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStreamPushJobListResponseBodyData getData() {
        return this.data;
    }

    public QueryStreamPushJobListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStreamPushJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStreamPushJobListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStreamPushJobListResponseBodyDataJobList extends TeaModel {
        /**
         * <p>The time when the job was created. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1581595942</p>
         */
        @NameInMap("CreateTime")
        public Integer createTime;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>23********</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the stream push job. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: continuous job.</li>
         * <li><strong>2</strong>: triggered job. The job ends after it is interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JobType")
        public Integer jobType;

        /**
         * <p>The current stream push status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: pushing.</li>
         * <li><strong>2</strong>: waiting to push.</li>
         * <li><strong>3</strong>: push ended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PushStatus")
        public Integer pushStatus;

        /**
         * <p>The stream push URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://****</p>
         */
        @NameInMap("PushUrl")
        public String pushUrl;

        /**
         * <p>The stream type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: main stream.</li>
         * <li><strong>1</strong>: sub stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryStreamPushJobListResponseBodyDataJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobListResponseBodyDataJobList self = new QueryStreamPushJobListResponseBodyDataJobList();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobListResponseBodyDataJobList setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setPushStatus(Integer pushStatus) {
            this.pushStatus = pushStatus;
            return this;
        }
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryStreamPushJobListResponseBodyData extends TeaModel {
        /**
         * <p>The job list information.</p>
         */
        @NameInMap("JobList")
        public java.util.List<QueryStreamPushJobListResponseBodyDataJobList> jobList;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryStreamPushJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobListResponseBodyData self = new QueryStreamPushJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobListResponseBodyData setJobList(java.util.List<QueryStreamPushJobListResponseBodyDataJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<QueryStreamPushJobListResponseBodyDataJobList> getJobList() {
            return this.jobList;
        }

        public QueryStreamPushJobListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
