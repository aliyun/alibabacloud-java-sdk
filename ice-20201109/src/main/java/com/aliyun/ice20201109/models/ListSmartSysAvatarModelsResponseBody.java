// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartSysAvatarModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartSysAvatarModelList")
    public java.util.List<ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList> smartSysAvatarModelList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSmartSysAvatarModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartSysAvatarModelsResponseBody self = new ListSmartSysAvatarModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartSysAvatarModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartSysAvatarModelsResponseBody setSmartSysAvatarModelList(java.util.List<ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList> smartSysAvatarModelList) {
        this.smartSysAvatarModelList = smartSysAvatarModelList;
        return this;
    }
    public java.util.List<ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList> getSmartSysAvatarModelList() {
        return this.smartSysAvatarModelList;
    }

    public ListSmartSysAvatarModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList extends TeaModel {
        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("AvatarName")
        public String avatarName;

        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("OutputMask")
        public Boolean outputMask;

        @NameInMap("VideoUrl")
        public String videoUrl;

        @NameInMap("Width")
        public Integer width;

        public static ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList build(java.util.Map<String, ?> map) throws Exception {
            ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList self = new ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList();
            return TeaModel.build(map, self);
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }
        public String getAvatarName() {
            return this.avatarName;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setOutputMask(Boolean outputMask) {
            this.outputMask = outputMask;
            return this;
        }
        public Boolean getOutputMask() {
            return this.outputMask;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
