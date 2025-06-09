// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetHotTopicBroadcastResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotTopicBroadcastResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotTopicBroadcastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotTopicBroadcastResponseBody self = new GetHotTopicBroadcastResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotTopicBroadcastResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotTopicBroadcastResponseBody setData(GetHotTopicBroadcastResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotTopicBroadcastResponseBodyData getData() {
        return this.data;
    }

    public GetHotTopicBroadcastResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHotTopicBroadcastResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotTopicBroadcastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotTopicBroadcastResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotTopicBroadcastResponseBodyDataDataImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/a.png">http://www.example.com/a.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetHotTopicBroadcastResponseBodyDataDataImages build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataDataImages self = new GetHotTopicBroadcastResponseBodyDataDataImages();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataDataImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataDataNewsComments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>评论内容</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>评论用户名</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetHotTopicBroadcastResponseBodyDataDataNewsComments build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataDataNewsComments self = new GetHotTopicBroadcastResponseBodyDataDataNewsComments();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataDataNewsComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNewsComments setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataDataNews extends TeaModel {
        @NameInMap("AnalysisCategory")
        public String analysisCategory;

        /**
         * <strong>example:</strong>
         * <p>聚合后热点名称</p>
         */
        @NameInMap("AnalysisTopic")
        public String analysisTopic;

        @NameInMap("Author")
        public String author;

        @NameInMap("Category")
        public java.util.List<String> category;

        @NameInMap("Comments")
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataNewsComments> comments;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-06-13 08:45:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>2024111110</p>
         */
        @NameInMap("Dt")
        public String dt;

        /**
         * <strong>example:</strong>
         * <p>原始热点名称</p>
         */
        @NameInMap("HotTopic")
        public String hotTopic;

        @NameInMap("ImgList")
        public java.util.List<String> imgList;

        /**
         * <p>logo</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/a.png">https://www.example.com/a.png</a></p>
         */
        @NameInMap("Logo")
        public String logo;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 12:12:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/a.png">http://www.example.com/a.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>主键ID</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>网站</p>
         */
        @NameInMap("Website")
        public String website;

        public static GetHotTopicBroadcastResponseBodyDataDataNews build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataDataNews self = new GetHotTopicBroadcastResponseBodyDataDataNews();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setAnalysisCategory(String analysisCategory) {
            this.analysisCategory = analysisCategory;
            return this;
        }
        public String getAnalysisCategory() {
            return this.analysisCategory;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setAnalysisTopic(String analysisTopic) {
            this.analysisTopic = analysisTopic;
            return this;
        }
        public String getAnalysisTopic() {
            return this.analysisTopic;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setCategory(java.util.List<String> category) {
            this.category = category;
            return this;
        }
        public java.util.List<String> getCategory() {
            return this.category;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setComments(java.util.List<GetHotTopicBroadcastResponseBodyDataDataNewsComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataNewsComments> getComments() {
            return this.comments;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setDt(String dt) {
            this.dt = dt;
            return this;
        }
        public String getDt() {
            return this.dt;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setHotTopic(String hotTopic) {
            this.hotTopic = hotTopic;
            return this;
        }
        public String getHotTopic() {
            return this.hotTopic;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setImgList(java.util.List<String> imgList) {
            this.imgList = imgList;
            return this;
        }
        public java.util.List<String> getImgList() {
            return this.imgList;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetHotTopicBroadcastResponseBodyDataDataNews setWebsite(String website) {
            this.website = website;
            return this;
        }
        public String getWebsite() {
            return this.website;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataDataSummarySummaries extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetHotTopicBroadcastResponseBodyDataDataSummarySummaries build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataDataSummarySummaries self = new GetHotTopicBroadcastResponseBodyDataDataSummarySummaries();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataDataSummarySummaries setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetHotTopicBroadcastResponseBodyDataDataSummarySummaries setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataDataSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("InputToken")
        public Integer inputToken;

        /**
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("OutputToken")
        public Integer outputToken;

        @NameInMap("Summaries")
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataSummarySummaries> summaries;

        public static GetHotTopicBroadcastResponseBodyDataDataSummary build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataDataSummary self = new GetHotTopicBroadcastResponseBodyDataDataSummary();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataDataSummary setInputToken(Integer inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Integer getInputToken() {
            return this.inputToken;
        }

        public GetHotTopicBroadcastResponseBodyDataDataSummary setOutputToken(Integer outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Integer getOutputToken() {
            return this.outputToken;
        }

        public GetHotTopicBroadcastResponseBodyDataDataSummary setSummaries(java.util.List<GetHotTopicBroadcastResponseBodyDataDataSummarySummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataSummarySummaries> getSummaries() {
            return this.summaries;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>热点话题分类</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>34.7905341705522</p>
         */
        @NameInMap("CustomHotValue")
        public Double customHotValue;

        /**
         * <strong>example:</strong>
         * <p>自定义热点话题文本摘要</p>
         */
        @NameInMap("CustomTextSummary")
        public String customTextSummary;

        /**
         * <strong>example:</strong>
         * <p>热点话题名称</p>
         */
        @NameInMap("HotTopic")
        public String hotTopic;

        /**
         * <strong>example:</strong>
         * <p>热点话题摘要版本</p>
         */
        @NameInMap("HotTopicVersion")
        public String hotTopicVersion;

        /**
         * <strong>example:</strong>
         * <p>1.4120480606282884</p>
         */
        @NameInMap("HotValue")
        public Double hotValue;

        /**
         * <strong>example:</strong>
         * <p>热点话题ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Images")
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataImages> images;

        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("InputToken")
        public Integer inputToken;

        @NameInMap("Locations")
        public java.util.List<String> locations;

        @NameInMap("News")
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataNews> news;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("OutputToken")
        public Integer outputToken;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Summary")
        public GetHotTopicBroadcastResponseBodyDataDataSummary summary;

        /**
         * <strong>example:</strong>
         * <p>热点话题文本摘要</p>
         */
        @NameInMap("TextSummary")
        public String textSummary;

        @NameInMap("Url")
        public String url;

        public static GetHotTopicBroadcastResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataData self = new GetHotTopicBroadcastResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetHotTopicBroadcastResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHotTopicBroadcastResponseBodyDataData setCustomHotValue(Double customHotValue) {
            this.customHotValue = customHotValue;
            return this;
        }
        public Double getCustomHotValue() {
            return this.customHotValue;
        }

        public GetHotTopicBroadcastResponseBodyDataData setCustomTextSummary(String customTextSummary) {
            this.customTextSummary = customTextSummary;
            return this;
        }
        public String getCustomTextSummary() {
            return this.customTextSummary;
        }

        public GetHotTopicBroadcastResponseBodyDataData setHotTopic(String hotTopic) {
            this.hotTopic = hotTopic;
            return this;
        }
        public String getHotTopic() {
            return this.hotTopic;
        }

        public GetHotTopicBroadcastResponseBodyDataData setHotTopicVersion(String hotTopicVersion) {
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        public GetHotTopicBroadcastResponseBodyDataData setHotValue(Double hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Double getHotValue() {
            return this.hotValue;
        }

        public GetHotTopicBroadcastResponseBodyDataData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotTopicBroadcastResponseBodyDataData setImages(java.util.List<GetHotTopicBroadcastResponseBodyDataDataImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataImages> getImages() {
            return this.images;
        }

        public GetHotTopicBroadcastResponseBodyDataData setInputToken(Integer inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Integer getInputToken() {
            return this.inputToken;
        }

        public GetHotTopicBroadcastResponseBodyDataData setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        public GetHotTopicBroadcastResponseBodyDataData setNews(java.util.List<GetHotTopicBroadcastResponseBodyDataDataNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastResponseBodyDataDataNews> getNews() {
            return this.news;
        }

        public GetHotTopicBroadcastResponseBodyDataData setOutputToken(Integer outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Integer getOutputToken() {
            return this.outputToken;
        }

        public GetHotTopicBroadcastResponseBodyDataData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetHotTopicBroadcastResponseBodyDataData setSummary(GetHotTopicBroadcastResponseBodyDataDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public GetHotTopicBroadcastResponseBodyDataDataSummary getSummary() {
            return this.summary;
        }

        public GetHotTopicBroadcastResponseBodyDataData setTextSummary(String textSummary) {
            this.textSummary = textSummary;
            return this;
        }
        public String getTextSummary() {
            return this.textSummary;
        }

        public GetHotTopicBroadcastResponseBodyDataData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyDataTotalTokenInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HotTopicCount")
        public Integer hotTopicCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WordCount")
        public Integer wordCount;

        public static GetHotTopicBroadcastResponseBodyDataTotalTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyDataTotalTokenInfo self = new GetHotTopicBroadcastResponseBodyDataTotalTokenInfo();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo setHotTopicCount(Integer hotTopicCount) {
            this.hotTopicCount = hotTopicCount;
            return this;
        }
        public Integer getHotTopicCount() {
            return this.hotTopicCount;
        }

        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo setWordCount(Integer wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Integer getWordCount() {
            return this.wordCount;
        }

    }

    public static class GetHotTopicBroadcastResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<GetHotTopicBroadcastResponseBodyDataData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalTokenInfo")
        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo totalTokenInfo;

        public static GetHotTopicBroadcastResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastResponseBodyData self = new GetHotTopicBroadcastResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastResponseBodyData setData(java.util.List<GetHotTopicBroadcastResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastResponseBodyDataData> getData() {
            return this.data;
        }

        public GetHotTopicBroadcastResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetHotTopicBroadcastResponseBodyData setTotalTokenInfo(GetHotTopicBroadcastResponseBodyDataTotalTokenInfo totalTokenInfo) {
            this.totalTokenInfo = totalTokenInfo;
            return this;
        }
        public GetHotTopicBroadcastResponseBodyDataTotalTokenInfo getTotalTokenInfo() {
            return this.totalTokenInfo;
        }

    }

}
