// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomHotTopicBroadcastJobShrinkRequest extends TeaModel {
    /**
     * <p>The configuration for the news broadcast job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotTopicBroadcastConfig")
    public String hotTopicBroadcastConfigShrink;

    /**
     * <p>The version of the hot topic.</p>
     * 
     * <strong>example:</strong>
     * <p>热点版本</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

    /**
     * <p>The topic filter.</p>
     */
    @NameInMap("Topics")
    public String topicsShrink;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitCustomHotTopicBroadcastJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomHotTopicBroadcastJobShrinkRequest self = new SubmitCustomHotTopicBroadcastJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomHotTopicBroadcastJobShrinkRequest setHotTopicBroadcastConfigShrink(String hotTopicBroadcastConfigShrink) {
        this.hotTopicBroadcastConfigShrink = hotTopicBroadcastConfigShrink;
        return this;
    }
    public String getHotTopicBroadcastConfigShrink() {
        return this.hotTopicBroadcastConfigShrink;
    }

    public SubmitCustomHotTopicBroadcastJobShrinkRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public SubmitCustomHotTopicBroadcastJobShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

    public SubmitCustomHotTopicBroadcastJobShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
