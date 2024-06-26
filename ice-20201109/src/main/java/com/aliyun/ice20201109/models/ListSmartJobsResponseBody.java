// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>CBB6BC61D08</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartJobList")
    public java.util.List<ListSmartJobsResponseBodySmartJobList> smartJobList;

    /**
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListSmartJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsResponseBody self = new ListSmartJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartJobsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSmartJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSmartJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartJobsResponseBody setSmartJobList(java.util.List<ListSmartJobsResponseBodySmartJobList> smartJobList) {
        this.smartJobList = smartJobList;
        return this;
    }
    public java.util.List<ListSmartJobsResponseBodySmartJobList> getSmartJobList() {
        return this.smartJobList;
    }

    public ListSmartJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListSmartJobsResponseBodySmartJobListInputConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
         */
        @NameInMap("InputFile")
        public String inputFile;

        /**
         * <strong>example:</strong>
         * <p>测试关键词</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        public static ListSmartJobsResponseBodySmartJobListInputConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSmartJobsResponseBodySmartJobListInputConfig self = new ListSmartJobsResponseBodySmartJobListInputConfig();
            return TeaModel.build(map, self);
        }

        public ListSmartJobsResponseBodySmartJobListInputConfig setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

        public ListSmartJobsResponseBodySmartJobListInputConfig setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

    }

    public static class ListSmartJobsResponseBodySmartJobListOutputConfig extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>OSS Object</p>
         * 
         * <strong>example:</strong>
         * <p>test-object</p>
         */
        @NameInMap("Object")
        public String object;

        public static ListSmartJobsResponseBodySmartJobListOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSmartJobsResponseBodySmartJobListOutputConfig self = new ListSmartJobsResponseBodySmartJobListOutputConfig();
            return TeaModel.build(map, self);
        }

        public ListSmartJobsResponseBodySmartJobListOutputConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListSmartJobsResponseBodySmartJobListOutputConfig setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListSmartJobsResponseBodySmartJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>测试描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;AudioConfig&quot;:{},&quot;InputConfig&quot;:&quot;&quot;}</p>
         */
        @NameInMap("EditingConfig")
        public String editingConfig;

        @NameInMap("InputConfig")
        public ListSmartJobsResponseBodySmartJobListInputConfig inputConfig;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("JobState")
        public String jobState;

        /**
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OutputConfig")
        public ListSmartJobsResponseBodySmartJobListOutputConfig outputConfig;

        /**
         * <strong>example:</strong>
         * <p>测试标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>{&quot;user&quot;:&quot;data&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <strong>example:</strong>
         * <p>1084506228******</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListSmartJobsResponseBodySmartJobList build(java.util.Map<String, ?> map) throws Exception {
            ListSmartJobsResponseBodySmartJobList self = new ListSmartJobsResponseBodySmartJobList();
            return TeaModel.build(map, self);
        }

        public ListSmartJobsResponseBodySmartJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSmartJobsResponseBodySmartJobList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSmartJobsResponseBodySmartJobList setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public ListSmartJobsResponseBodySmartJobList setInputConfig(ListSmartJobsResponseBodySmartJobListInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public ListSmartJobsResponseBodySmartJobListInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public ListSmartJobsResponseBodySmartJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSmartJobsResponseBodySmartJobList setJobState(String jobState) {
            this.jobState = jobState;
            return this;
        }
        public String getJobState() {
            return this.jobState;
        }

        public ListSmartJobsResponseBodySmartJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListSmartJobsResponseBodySmartJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSmartJobsResponseBodySmartJobList setOutputConfig(ListSmartJobsResponseBodySmartJobListOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public ListSmartJobsResponseBodySmartJobListOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        public ListSmartJobsResponseBodySmartJobList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSmartJobsResponseBodySmartJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ListSmartJobsResponseBodySmartJobList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
