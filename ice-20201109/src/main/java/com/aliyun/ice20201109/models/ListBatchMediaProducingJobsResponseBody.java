// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListBatchMediaProducingJobsResponseBody extends TeaModel {
    /**
     * <p>The queried quick video production jobs.</p>
     */
    @NameInMap("EditingBatchJobList")
    public java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> editingBatchJobList;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBatchMediaProducingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchMediaProducingJobsResponseBody self = new ListBatchMediaProducingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchMediaProducingJobsResponseBody setEditingBatchJobList(java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> editingBatchJobList) {
        this.editingBatchJobList = editingBatchJobList;
        return this;
    }
    public java.util.List<ListBatchMediaProducingJobsResponseBodyEditingBatchJobList> getEditingBatchJobList() {
        return this.editingBatchJobList;
    }

    public ListBatchMediaProducingJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchMediaProducingJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchMediaProducingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBatchMediaProducingJobsResponseBodyEditingBatchJobList extends TeaModel {
        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-09T06:38:09Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-09T06:36:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The editing configurations. For more information, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaConfig&quot;: {
         *       &quot;Volume&quot;: 0
         *   },
         *   &quot;SpeechConfig&quot;: {
         *       &quot;Volume&quot;: 1
         *   },
         *  &quot;BackgroundMusicConfig&quot;: {
         *       &quot;Volume&quot;: 0.3
         *   }
         * }</p>
         */
        @NameInMap("EditingConfig")
        public String editingConfig;

        /**
         * <p>The extended information of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The input configurations.</p>
         */
        @NameInMap("InputConfig")
        public String inputConfig;

        /**
         * <p>The ID of the quick video production job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>7ecbee4c6d9b8474498e</strong></strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Script: script-based editing job that mixes media assets.</li>
         * <li>Smart_Mix: intelligent editing job that mixes media assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Script</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-09T06:37:58Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The output configurations. For more information, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Count&quot;: 20,
         *   &quot;MaxDuration&quot;: 15,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920,
         *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
         * }</p>
         */
        @NameInMap("OutputConfig")
        public String outputConfig;

        /**
         * <p>The job state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Finished</li>
         * <li>Init</li>
         * <li>Failed</li>
         * <li>Processing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/zh/ims/use-cases/to-configure-a-callback-when-a-clip-completes">Configure a callback upon editing completion</a>.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListBatchMediaProducingJobsResponseBodyEditingBatchJobList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchMediaProducingJobsResponseBodyEditingBatchJobList self = new ListBatchMediaProducingJobsResponseBodyEditingBatchJobList();
            return TeaModel.build(map, self);
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchMediaProducingJobsResponseBodyEditingBatchJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
