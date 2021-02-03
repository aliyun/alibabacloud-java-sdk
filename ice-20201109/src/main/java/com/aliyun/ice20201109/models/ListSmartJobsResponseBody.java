// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartJobList")
    public java.util.List<ListSmartJobsResponseBodySmartJobList> smartJobList;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListSmartJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsResponseBody self = new ListSmartJobsResponseBody();
        return TeaModel.build(map, self);
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

    public ListSmartJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSmartJobsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSmartJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListSmartJobsResponseBodySmartJobListInputConfig extends TeaModel {
        @NameInMap("InputFile")
        public String inputFile;

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
        @NameInMap("Bucket")
        public String bucket;

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
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Description")
        public String description;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("EditingConfig")
        public String editingConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("JobState")
        public String jobState;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("InputConfig")
        public ListSmartJobsResponseBodySmartJobListInputConfig inputConfig;

        @NameInMap("OutputConfig")
        public ListSmartJobsResponseBodySmartJobListOutputConfig outputConfig;

        public static ListSmartJobsResponseBodySmartJobList build(java.util.Map<String, ?> map) throws Exception {
            ListSmartJobsResponseBodySmartJobList self = new ListSmartJobsResponseBodySmartJobList();
            return TeaModel.build(map, self);
        }

        public ListSmartJobsResponseBodySmartJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSmartJobsResponseBodySmartJobList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSmartJobsResponseBodySmartJobList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSmartJobsResponseBodySmartJobList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListSmartJobsResponseBodySmartJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListSmartJobsResponseBodySmartJobList setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public ListSmartJobsResponseBodySmartJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ListSmartJobsResponseBodySmartJobList setJobState(String jobState) {
            this.jobState = jobState;
            return this;
        }
        public String getJobState() {
            return this.jobState;
        }

        public ListSmartJobsResponseBodySmartJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSmartJobsResponseBodySmartJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSmartJobsResponseBodySmartJobList setInputConfig(ListSmartJobsResponseBodySmartJobListInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public ListSmartJobsResponseBodySmartJobListInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public ListSmartJobsResponseBodySmartJobList setOutputConfig(ListSmartJobsResponseBodySmartJobListOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public ListSmartJobsResponseBodySmartJobListOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

    }

}
