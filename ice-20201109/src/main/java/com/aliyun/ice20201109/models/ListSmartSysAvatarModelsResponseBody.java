// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartSysAvatarModelsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried digital humans.</p>
     */
    @NameInMap("SmartSysAvatarModelList")
    public java.util.List<ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList> smartSysAvatarModelList;

    /**
     * <p>The total number of system digital human images returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
        /**
         * <p>The ID of the digital human. The ID is required to submit a separate digital human rendering job or use the digital human image in an intelligent timeline.</p>
         * 
         * <strong>example:</strong>
         * <p>yunqiao</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        /**
         * <p>The name of the digital human.</p>
         */
        @NameInMap("AvatarName")
        public String avatarName;

        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The sample thumbnail URL of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ice-pub-media.myalicdn.com/smart/avatarModel/coverDemo/yunqiao.mp4">http://ice-pub-media.myalicdn.com/smart/avatarModel/coverDemo/yunqiao.mp4</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The video height.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Indicates whether portrait mask rendering is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutputMask")
        public Boolean outputMask;

        /**
         * <p>The sample video URL of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ice-pub-media.myalicdn.com/smart/avatarModel/videoDemo/yunqiao.mp4">http://ice-pub-media.myalicdn.com/smart/avatarModel/videoDemo/yunqiao.mp4</a></p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        /**
         * <p>The video width.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
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
