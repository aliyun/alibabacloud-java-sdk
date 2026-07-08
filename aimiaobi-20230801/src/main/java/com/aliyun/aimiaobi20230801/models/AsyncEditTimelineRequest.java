// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncEditTimelineRequest extends TeaModel {
    /**
     * <p>Enable automatic clip adjustment</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoClips")
    public Boolean autoClips;

    /**
     * <p>Unique identifier of the task</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Array structure of video editing timelines</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timelines")
    public java.util.List<AsyncEditTimelineRequestTimelines> timelines;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">Model Studio workspace ID</a></p>
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
        /**
         * <p>Clip ID</p>
         * 
         * <strong>example:</strong>
         * <p>123jjdax
         * 新增可为空</p>
         */
        @NameInMap("ClipId")
        public String clipId;

        /**
         * <p>Segmented voice-over script</p>
         * 
         * <strong>example:</strong>
         * <p>口播文案分段
         * 不可为空</p>
         */
        @NameInMap("ContentInner")
        public String contentInner;

        /**
         * <p>Start time, in seconds. Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0
         * 不可为空</p>
         */
        @NameInMap("In")
        public Integer in;

        /**
         * <p>Clip start time, in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>0.45</p>
         */
        @NameInMap("InEx")
        public Float inEx;

        /**
         * <p>End time, in seconds. Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>5
         * 不可为空</p>
         */
        @NameInMap("Out")
        public Integer out;

        /**
         * <p>Clip end time, in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>3.66</p>
         */
        @NameInMap("OutEx")
        public Float outEx;

        /**
         * <p>Video ID</p>
         * 
         * <strong>example:</strong>
         * <p>7036227ae3ab71efbb4a6733a68f0102
         * 不可为空</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>Video name</p>
         * 
         * <strong>example:</strong>
         * <p>123.mp4
         * 不可为空</p>
         */
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

        public AsyncEditTimelineRequestTimelinesClips setInEx(Float inEx) {
            this.inEx = inEx;
            return this;
        }
        public Float getInEx() {
            return this.inEx;
        }

        public AsyncEditTimelineRequestTimelinesClips setOut(Integer out) {
            this.out = out;
            return this;
        }
        public Integer getOut() {
            return this.out;
        }

        public AsyncEditTimelineRequestTimelinesClips setOutEx(Float outEx) {
            this.outEx = outEx;
            return this;
        }
        public Float getOutEx() {
            return this.outEx;
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
         * <p>Array of video clips</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Clips")
        public java.util.List<AsyncEditTimelineRequestTimelinesClips> clips;

        /**
         * <p>Timeline ID</p>
         * 
         * <strong>example:</strong>
         * <p>sdfjhks
         * 新增可为空</p>
         */
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
