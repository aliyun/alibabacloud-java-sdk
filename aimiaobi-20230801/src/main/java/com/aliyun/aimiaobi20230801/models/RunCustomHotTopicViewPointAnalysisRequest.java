// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicViewPointAnalysisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>模型反问</p>
     */
    @NameInMap("AskUser")
    public String askUser;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>自定义选题视角的Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>改写后的Query</p>
     */
    @NameInMap("SearchQuery")
    public String searchQuery;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipAskUser")
    public Boolean skipAskUser;

    /**
     * <strong>example:</strong>
     * <p>热点主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <strong>example:</strong>
     * <p>热点主题ID</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    /**
     * <strong>example:</strong>
     * <p>热点主题来源</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <strong>example:</strong>
     * <p>热点主题版本</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    /**
     * <strong>example:</strong>
     * <p>用户反馈</p>
     */
    @NameInMap("UserBack")
    public String userBack;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunCustomHotTopicViewPointAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicViewPointAnalysisRequest self = new RunCustomHotTopicViewPointAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicViewPointAnalysisRequest setAskUser(String askUser) {
        this.askUser = askUser;
        return this;
    }
    public String getAskUser() {
        return this.askUser;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
        return this;
    }
    public String getSearchQuery() {
        return this.searchQuery;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setSkipAskUser(Boolean skipAskUser) {
        this.skipAskUser = skipAskUser;
        return this;
    }
    public Boolean getSkipAskUser() {
        return this.skipAskUser;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setTopicVersion(String topicVersion) {
        this.topicVersion = topicVersion;
        return this;
    }
    public String getTopicVersion() {
        return this.topicVersion;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setUserBack(String userBack) {
        this.userBack = userBack;
        return this;
    }
    public String getUserBack() {
        return this.userBack;
    }

    public RunCustomHotTopicViewPointAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
