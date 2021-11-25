// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetVideoResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("FileSize")
    public Integer fileSize;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ProcessFailReason")
    public String processFailReason;

    @NameInMap("ProcessModifyTime")
    public String processModifyTime;

    @NameInMap("ProcessStatus")
    public String processStatus;

    @NameInMap("RemarksA")
    public String remarksA;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SourcePosition")
    public String sourcePosition;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceUri")
    public String sourceUri;

    @NameInMap("VideoDuration")
    public Float videoDuration;

    @NameInMap("VideoFacesFailReason")
    public String videoFacesFailReason;

    @NameInMap("VideoFacesModifyTime")
    public String videoFacesModifyTime;

    @NameInMap("VideoFacesStatus")
    public String videoFacesStatus;

    @NameInMap("VideoFormat")
    public String videoFormat;

    @NameInMap("VideoFrameTagsFailReason")
    public String videoFrameTagsFailReason;

    @NameInMap("VideoFrameTagsModifyTime")
    public String videoFrameTagsModifyTime;

    @NameInMap("VideoFrameTagsStatus")
    public String videoFrameTagsStatus;

    @NameInMap("VideoFrames")
    public Integer videoFrames;

    @NameInMap("VideoHeight")
    public Integer videoHeight;

    @NameInMap("VideoInfo")
    public String videoInfo;

    @NameInMap("VideoOCRFailReason")
    public String videoOCRFailReason;

    @NameInMap("VideoOCRModifyTime")
    public String videoOCRModifyTime;

    @NameInMap("VideoOCRStatus")
    public String videoOCRStatus;

    @NameInMap("VideoSTTFailReason")
    public String videoSTTFailReason;

    @NameInMap("VideoSTTModifyTime")
    public String videoSTTModifyTime;

    @NameInMap("VideoSTTStatus")
    public String videoSTTStatus;

    @NameInMap("VideoTags")
    public java.util.List<GetVideoResponseBodyVideoTags> videoTags;

    @NameInMap("VideoTagsFailReason")
    public String videoTagsFailReason;

    @NameInMap("VideoTagsModifyTime")
    public String videoTagsModifyTime;

    @NameInMap("VideoTagsStatus")
    public String videoTagsStatus;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("VideoWidth")
    public Integer videoWidth;

    public static GetVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoResponseBody self = new GetVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVideoResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public GetVideoResponseBody setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Integer getFileSize() {
        return this.fileSize;
    }

    public GetVideoResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetVideoResponseBody setProcessFailReason(String processFailReason) {
        this.processFailReason = processFailReason;
        return this;
    }
    public String getProcessFailReason() {
        return this.processFailReason;
    }

    public GetVideoResponseBody setProcessModifyTime(String processModifyTime) {
        this.processModifyTime = processModifyTime;
        return this;
    }
    public String getProcessModifyTime() {
        return this.processModifyTime;
    }

    public GetVideoResponseBody setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public GetVideoResponseBody setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public GetVideoResponseBody setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public GetVideoResponseBody setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public GetVideoResponseBody setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public GetVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public GetVideoResponseBody setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
        return this;
    }
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    public GetVideoResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetVideoResponseBody setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public GetVideoResponseBody setVideoDuration(Float videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Float getVideoDuration() {
        return this.videoDuration;
    }

    public GetVideoResponseBody setVideoFacesFailReason(String videoFacesFailReason) {
        this.videoFacesFailReason = videoFacesFailReason;
        return this;
    }
    public String getVideoFacesFailReason() {
        return this.videoFacesFailReason;
    }

    public GetVideoResponseBody setVideoFacesModifyTime(String videoFacesModifyTime) {
        this.videoFacesModifyTime = videoFacesModifyTime;
        return this;
    }
    public String getVideoFacesModifyTime() {
        return this.videoFacesModifyTime;
    }

    public GetVideoResponseBody setVideoFacesStatus(String videoFacesStatus) {
        this.videoFacesStatus = videoFacesStatus;
        return this;
    }
    public String getVideoFacesStatus() {
        return this.videoFacesStatus;
    }

    public GetVideoResponseBody setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }
    public String getVideoFormat() {
        return this.videoFormat;
    }

    public GetVideoResponseBody setVideoFrameTagsFailReason(String videoFrameTagsFailReason) {
        this.videoFrameTagsFailReason = videoFrameTagsFailReason;
        return this;
    }
    public String getVideoFrameTagsFailReason() {
        return this.videoFrameTagsFailReason;
    }

    public GetVideoResponseBody setVideoFrameTagsModifyTime(String videoFrameTagsModifyTime) {
        this.videoFrameTagsModifyTime = videoFrameTagsModifyTime;
        return this;
    }
    public String getVideoFrameTagsModifyTime() {
        return this.videoFrameTagsModifyTime;
    }

    public GetVideoResponseBody setVideoFrameTagsStatus(String videoFrameTagsStatus) {
        this.videoFrameTagsStatus = videoFrameTagsStatus;
        return this;
    }
    public String getVideoFrameTagsStatus() {
        return this.videoFrameTagsStatus;
    }

    public GetVideoResponseBody setVideoFrames(Integer videoFrames) {
        this.videoFrames = videoFrames;
        return this;
    }
    public Integer getVideoFrames() {
        return this.videoFrames;
    }

    public GetVideoResponseBody setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Integer getVideoHeight() {
        return this.videoHeight;
    }

    public GetVideoResponseBody setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public String getVideoInfo() {
        return this.videoInfo;
    }

    public GetVideoResponseBody setVideoOCRFailReason(String videoOCRFailReason) {
        this.videoOCRFailReason = videoOCRFailReason;
        return this;
    }
    public String getVideoOCRFailReason() {
        return this.videoOCRFailReason;
    }

    public GetVideoResponseBody setVideoOCRModifyTime(String videoOCRModifyTime) {
        this.videoOCRModifyTime = videoOCRModifyTime;
        return this;
    }
    public String getVideoOCRModifyTime() {
        return this.videoOCRModifyTime;
    }

    public GetVideoResponseBody setVideoOCRStatus(String videoOCRStatus) {
        this.videoOCRStatus = videoOCRStatus;
        return this;
    }
    public String getVideoOCRStatus() {
        return this.videoOCRStatus;
    }

    public GetVideoResponseBody setVideoSTTFailReason(String videoSTTFailReason) {
        this.videoSTTFailReason = videoSTTFailReason;
        return this;
    }
    public String getVideoSTTFailReason() {
        return this.videoSTTFailReason;
    }

    public GetVideoResponseBody setVideoSTTModifyTime(String videoSTTModifyTime) {
        this.videoSTTModifyTime = videoSTTModifyTime;
        return this;
    }
    public String getVideoSTTModifyTime() {
        return this.videoSTTModifyTime;
    }

    public GetVideoResponseBody setVideoSTTStatus(String videoSTTStatus) {
        this.videoSTTStatus = videoSTTStatus;
        return this;
    }
    public String getVideoSTTStatus() {
        return this.videoSTTStatus;
    }

    public GetVideoResponseBody setVideoTags(java.util.List<GetVideoResponseBodyVideoTags> videoTags) {
        this.videoTags = videoTags;
        return this;
    }
    public java.util.List<GetVideoResponseBodyVideoTags> getVideoTags() {
        return this.videoTags;
    }

    public GetVideoResponseBody setVideoTagsFailReason(String videoTagsFailReason) {
        this.videoTagsFailReason = videoTagsFailReason;
        return this;
    }
    public String getVideoTagsFailReason() {
        return this.videoTagsFailReason;
    }

    public GetVideoResponseBody setVideoTagsModifyTime(String videoTagsModifyTime) {
        this.videoTagsModifyTime = videoTagsModifyTime;
        return this;
    }
    public String getVideoTagsModifyTime() {
        return this.videoTagsModifyTime;
    }

    public GetVideoResponseBody setVideoTagsStatus(String videoTagsStatus) {
        this.videoTagsStatus = videoTagsStatus;
        return this;
    }
    public String getVideoTagsStatus() {
        return this.videoTagsStatus;
    }

    public GetVideoResponseBody setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public GetVideoResponseBody setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Integer getVideoWidth() {
        return this.videoWidth;
    }

    public static class GetVideoResponseBodyVideoTags extends TeaModel {
        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("TagName")
        public String tagName;

        public static GetVideoResponseBodyVideoTags build(java.util.Map<String, ?> map) throws Exception {
            GetVideoResponseBodyVideoTags self = new GetVideoResponseBodyVideoTags();
            return TeaModel.build(map, self);
        }

        public GetVideoResponseBodyVideoTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public GetVideoResponseBodyVideoTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public GetVideoResponseBodyVideoTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public GetVideoResponseBodyVideoTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
