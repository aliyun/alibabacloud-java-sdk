// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public UpdateDatasetResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetResponseBody self = new UpdateDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDatasetResponseBody setData(UpdateDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDatasetResponseBodyData getData() {
        return this.data;
    }

    public UpdateDatasetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDatasetResponseBodyDataNewsArticleResultsData extends TeaModel {
        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The publishing time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 15:12:14</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>央视网</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The article summary.</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The article URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static UpdateDatasetResponseBodyDataNewsArticleResultsData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetResponseBodyDataNewsArticleResultsData self = new UpdateDatasetResponseBodyDataNewsArticleResultsData();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResultsData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateDatasetResponseBodyDataNewsArticleResults extends TeaModel {
        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>NoData</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        /**
         * <p>The list of articles.</p>
         */
        @NameInMap("Data")
        public java.util.List<UpdateDatasetResponseBodyDataNewsArticleResultsData> data;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static UpdateDatasetResponseBodyDataNewsArticleResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetResponseBodyDataNewsArticleResults self = new UpdateDatasetResponseBodyDataNewsArticleResults();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setData(java.util.List<UpdateDatasetResponseBodyDataNewsArticleResultsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<UpdateDatasetResponseBodyDataNewsArticleResultsData> getData() {
            return this.data;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public UpdateDatasetResponseBodyDataNewsArticleResults setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class UpdateDatasetResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 21:46:24</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The display name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetDescription")
        public String datasetDescription;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasetId")
        public Long datasetId;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The dataset type.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSemanticSearch</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>The list of articles.</p>
         */
        @NameInMap("NewsArticleResults")
        public java.util.List<UpdateDatasetResponseBodyDataNewsArticleResults> newsArticleResults;

        /**
         * <p>Indicates whether search is enabled for the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SearchDatasetEnable")
        public Integer searchDatasetEnable;

        public static UpdateDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetResponseBodyData self = new UpdateDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDatasetResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public UpdateDatasetResponseBodyData setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        public UpdateDatasetResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public UpdateDatasetResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public UpdateDatasetResponseBodyData setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public UpdateDatasetResponseBodyData setNewsArticleResults(java.util.List<UpdateDatasetResponseBodyDataNewsArticleResults> newsArticleResults) {
            this.newsArticleResults = newsArticleResults;
            return this;
        }
        public java.util.List<UpdateDatasetResponseBodyDataNewsArticleResults> getNewsArticleResults() {
            return this.newsArticleResults;
        }

        public UpdateDatasetResponseBodyData setSearchDatasetEnable(Integer searchDatasetEnable) {
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

    }

}
