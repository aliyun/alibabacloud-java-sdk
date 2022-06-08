// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsResponseBody extends TeaModel {
    // 本次请求所返回的最大记录条数，最后一页前每页记录条数为MaxResults取值。  例如：  正例：10,10,5，反例：10,5,10
    @NameInMap("MaxResults")
    public String maxResults;

    // 用来表示当前调用返回读取到的位置，空代表数据已经读取完毕。
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartJobList")
    public java.util.List<ListSmartJobsResponseBodySmartJobList> smartJobList;

    // 本次请求条件下的数据总量，此参数为可选参数，默认可不返回。
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
        // 文件信息
        @NameInMap("InputFile")
        public String inputFile;

        // 关键词信息
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
        // OSS Bucket
        @NameInMap("Bucket")
        public String bucket;

        // OSS Object
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
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务描述
        @NameInMap("Description")
        public String description;

        // 输入配置
        @NameInMap("EditingConfig")
        public String editingConfig;

        // 任务输入配置
        @NameInMap("InputConfig")
        public ListSmartJobsResponseBodySmartJobListInputConfig inputConfig;

        // 任务Id
        @NameInMap("JobId")
        public String jobId;

        // 任务状态
        @NameInMap("JobState")
        public String jobState;

        // 任务类型
        @NameInMap("JobType")
        public String jobType;

        // 最后修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 任务输出配置
        @NameInMap("OutputConfig")
        public ListSmartJobsResponseBodySmartJobListOutputConfig outputConfig;

        // 任务标题
        @NameInMap("Title")
        public String title;

        // 用户自定义字段
        @NameInMap("UserData")
        public String userData;

        // 用户Id
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
