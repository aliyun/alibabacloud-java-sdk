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

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

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

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSmartSysAvatarModelsResponseBodySmartSysAvatarModelList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
