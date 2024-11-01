// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomHotTopicBroadcastJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotTopicBroadcastConfig")
    public String hotTopicBroadcastConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>热点版本</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

    @NameInMap("Topics")
    public String topicsShrink;

    /**
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
