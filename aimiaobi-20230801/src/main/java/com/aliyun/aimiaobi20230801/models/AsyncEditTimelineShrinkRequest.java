// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncEditTimelineShrinkRequest extends TeaModel {
    @NameInMap("AutoClips")
    public Boolean autoClips;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timelines")
    public String timelinesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncEditTimelineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncEditTimelineShrinkRequest self = new AsyncEditTimelineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsyncEditTimelineShrinkRequest setAutoClips(Boolean autoClips) {
        this.autoClips = autoClips;
        return this;
    }
    public Boolean getAutoClips() {
        return this.autoClips;
    }

    public AsyncEditTimelineShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncEditTimelineShrinkRequest setTimelinesShrink(String timelinesShrink) {
        this.timelinesShrink = timelinesShrink;
        return this;
    }
    public String getTimelinesShrink() {
        return this.timelinesShrink;
    }

    public AsyncEditTimelineShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
