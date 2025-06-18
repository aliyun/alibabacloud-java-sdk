// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncEditTimelineRequest extends TeaModel {
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
    public java.util.List<AsyncEditTimelineRequestTimelines> timelines;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncEditTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncEditTimelineRequest self = new AsyncEditTimelineRequest();
        return TeaModel.build(map, self);
    }

    public AsyncEditTimelineRequest setAutoClips(Boolean autoClips) {
        this.autoClips = autoClips;
        return this;
    }
    public Boolean getAutoClips() {
        return this.autoClips;
    }

    public AsyncEditTimelineRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncEditTimelineRequest setTimelines(java.util.List<AsyncEditTimelineRequestTimelines> timelines) {
        this.timelines = timelines;
        return this;
    }
    public java.util.List<AsyncEditTimelineRequestTimelines> getTimelines() {
        return this.timelines;
    }

    public AsyncEditTimelineRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AsyncEditTimelineRequestTimelinesClips extends TeaModel {
        @NameInMap("ClipId")
        public String clipId;

        @NameInMap("ContentInner")
        public String contentInner;

        @NameInMap("In")
        public Integer in;

        @NameInMap("Out")
        public Integer out;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("VideoName")
        public String videoName;

        public static AsyncEditTimelineRequestTimelinesClips build(java.util.Map<String, ?> map) throws Exception {
            AsyncEditTimelineRequestTimelinesClips self = new AsyncEditTimelineRequestTimelinesClips();
            return TeaModel.build(map, self);
        }

        public AsyncEditTimelineRequestTimelinesClips setClipId(String clipId) {
            this.clipId = clipId;
            return this;
        }
        public String getClipId() {
            return this.clipId;
        }

        public AsyncEditTimelineRequestTimelinesClips setContentInner(String contentInner) {
            this.contentInner = contentInner;
            return this;
        }
        public String getContentInner() {
            return this.contentInner;
        }

        public AsyncEditTimelineRequestTimelinesClips setIn(Integer in) {
            this.in = in;
            return this;
        }
        public Integer getIn() {
            return this.in;
        }

        public AsyncEditTimelineRequestTimelinesClips setOut(Integer out) {
            this.out = out;
            return this;
        }
        public Integer getOut() {
            return this.out;
        }

        public AsyncEditTimelineRequestTimelinesClips setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public AsyncEditTimelineRequestTimelinesClips setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

    }

    public static class AsyncEditTimelineRequestTimelines extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Clips")
        public java.util.List<AsyncEditTimelineRequestTimelinesClips> clips;

        @NameInMap("TimelineId")
        public String timelineId;

        public static AsyncEditTimelineRequestTimelines build(java.util.Map<String, ?> map) throws Exception {
            AsyncEditTimelineRequestTimelines self = new AsyncEditTimelineRequestTimelines();
            return TeaModel.build(map, self);
        }

        public AsyncEditTimelineRequestTimelines setClips(java.util.List<AsyncEditTimelineRequestTimelinesClips> clips) {
            this.clips = clips;
            return this;
        }
        public java.util.List<AsyncEditTimelineRequestTimelinesClips> getClips() {
            return this.clips;
        }

        public AsyncEditTimelineRequestTimelines setTimelineId(String timelineId) {
            this.timelineId = timelineId;
            return this;
        }
        public String getTimelineId() {
            return this.timelineId;
        }

    }

}
