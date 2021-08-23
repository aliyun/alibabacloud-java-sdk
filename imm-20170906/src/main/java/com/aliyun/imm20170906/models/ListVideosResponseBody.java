// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("Videos")
    public java.util.List<ListVideosResponseBodyVideos> videos;

    public static ListVideosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideosResponseBody self = new ListVideosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideosResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListVideosResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListVideosResponseBody setVideos(java.util.List<ListVideosResponseBodyVideos> videos) {
        this.videos = videos;
        return this;
    }
    public java.util.List<ListVideosResponseBodyVideos> getVideos() {
        return this.videos;
    }

    public static class ListVideosResponseBodyVideosVideoTags extends TeaModel {
        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        public static ListVideosResponseBodyVideosVideoTags build(java.util.Map<String, ?> map) throws Exception {
            ListVideosResponseBodyVideosVideoTags self = new ListVideosResponseBodyVideosVideoTags();
            return TeaModel.build(map, self);
        }

        public ListVideosResponseBodyVideosVideoTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public ListVideosResponseBodyVideosVideoTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public ListVideosResponseBodyVideosVideoTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListVideosResponseBodyVideosVideoTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

    }

    public static class ListVideosResponseBodyVideos extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("VideoTagsFailReason")
        public String videoTagsFailReason;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("VideoDuration")
        public Float videoDuration;

        @NameInMap("ProcessModifyTime")
        public String processModifyTime;

        @NameInMap("VideoFrames")
        public Integer videoFrames;

        @NameInMap("VideoTagsStatus")
        public String videoTagsStatus;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("VideoWidth")
        public Integer videoWidth;

        @NameInMap("VideoHeight")
        public Integer videoHeight;

        @NameInMap("VideoFormat")
        public String videoFormat;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("VideoUri")
        public String videoUri;

        @NameInMap("VideoTagsModifyTime")
        public String videoTagsModifyTime;

        @NameInMap("ProcessFailReason")
        public String processFailReason;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("ProcessStatus")
        public String processStatus;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("VideoTags")
        public java.util.List<ListVideosResponseBodyVideosVideoTags> videoTags;

        public static ListVideosResponseBodyVideos build(java.util.Map<String, ?> map) throws Exception {
            ListVideosResponseBodyVideos self = new ListVideosResponseBodyVideos();
            return TeaModel.build(map, self);
        }

        public ListVideosResponseBodyVideos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVideosResponseBodyVideos setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListVideosResponseBodyVideos setVideoTagsFailReason(String videoTagsFailReason) {
            this.videoTagsFailReason = videoTagsFailReason;
            return this;
        }
        public String getVideoTagsFailReason() {
            return this.videoTagsFailReason;
        }

        public ListVideosResponseBodyVideos setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListVideosResponseBodyVideos setVideoDuration(Float videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Float getVideoDuration() {
            return this.videoDuration;
        }

        public ListVideosResponseBodyVideos setProcessModifyTime(String processModifyTime) {
            this.processModifyTime = processModifyTime;
            return this;
        }
        public String getProcessModifyTime() {
            return this.processModifyTime;
        }

        public ListVideosResponseBodyVideos setVideoFrames(Integer videoFrames) {
            this.videoFrames = videoFrames;
            return this;
        }
        public Integer getVideoFrames() {
            return this.videoFrames;
        }

        public ListVideosResponseBodyVideos setVideoTagsStatus(String videoTagsStatus) {
            this.videoTagsStatus = videoTagsStatus;
            return this;
        }
        public String getVideoTagsStatus() {
            return this.videoTagsStatus;
        }

        public ListVideosResponseBodyVideos setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListVideosResponseBodyVideos setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public ListVideosResponseBodyVideos setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListVideosResponseBodyVideos setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListVideosResponseBodyVideos setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public ListVideosResponseBodyVideos setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public ListVideosResponseBodyVideos setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public ListVideosResponseBodyVideos setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public ListVideosResponseBodyVideos setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListVideosResponseBodyVideos setVideoUri(String videoUri) {
            this.videoUri = videoUri;
            return this;
        }
        public String getVideoUri() {
            return this.videoUri;
        }

        public ListVideosResponseBodyVideos setVideoTagsModifyTime(String videoTagsModifyTime) {
            this.videoTagsModifyTime = videoTagsModifyTime;
            return this;
        }
        public String getVideoTagsModifyTime() {
            return this.videoTagsModifyTime;
        }

        public ListVideosResponseBodyVideos setProcessFailReason(String processFailReason) {
            this.processFailReason = processFailReason;
            return this;
        }
        public String getProcessFailReason() {
            return this.processFailReason;
        }

        public ListVideosResponseBodyVideos setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListVideosResponseBodyVideos setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public ListVideosResponseBodyVideos setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListVideosResponseBodyVideos setVideoTags(java.util.List<ListVideosResponseBodyVideosVideoTags> videoTags) {
            this.videoTags = videoTags;
            return this;
        }
        public java.util.List<ListVideosResponseBodyVideosVideoTags> getVideoTags() {
            return this.videoTags;
        }

    }

}
