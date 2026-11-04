// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li><strong>200</strong>: The call is successful.</li>
     * <li>Other values: An error code. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryStreamPushJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Request parameter error.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
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

    public static QueryStreamPushJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobResponseBody self = new QueryStreamPushJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStreamPushJobResponseBody setData(QueryStreamPushJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStreamPushJobResponseBodyData getData() {
        return this.data;
    }

    public QueryStreamPushJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStreamPushJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStreamPushJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStreamPushJobResponseBodyData extends TeaModel {
        /**
         * <p>The time when the job was created. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1581595942</p>
         */
        @NameInMap("CreateTime")
        public Integer createTime;

        /**
         * <p>The type of the stream push job. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Continuous job.</li>
         * <li><strong>2</strong>: Triggered job, which ends after an interruption.</li>
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
         * <li><strong>1</strong>: Pushing.</li>
         * <li><strong>2</strong>: Waiting to push.</li>
         * <li><strong>3</strong>: Push ended.</li>
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
         * <li><strong>0</strong>: Main stream.</li>
         * <li><strong>1</strong>: Sub stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryStreamPushJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobResponseBodyData self = new QueryStreamPushJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobResponseBodyData setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public QueryStreamPushJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public QueryStreamPushJobResponseBodyData setPushStatus(Integer pushStatus) {
            this.pushStatus = pushStatus;
            return this;
        }
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        public QueryStreamPushJobResponseBodyData setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public QueryStreamPushJobResponseBodyData setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

}
