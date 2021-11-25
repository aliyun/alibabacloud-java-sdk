// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetsResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sets")
    public java.util.List<ListSetsResponseBodySets> sets;

    public static ListSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSetsResponseBody self = new ListSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSetsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSetsResponseBody setSets(java.util.List<ListSetsResponseBodySets> sets) {
        this.sets = sets;
        return this;
    }
    public java.util.List<ListSetsResponseBodySets> getSets() {
        return this.sets;
    }

    public static class ListSetsResponseBodySets extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SetId")
        public String setId;

        @NameInMap("SetName")
        public String setName;

        @NameInMap("VideoCount")
        public Integer videoCount;

        @NameInMap("VideoLength")
        public Integer videoLength;

        public static ListSetsResponseBodySets build(java.util.Map<String, ?> map) throws Exception {
            ListSetsResponseBodySets self = new ListSetsResponseBodySets();
            return TeaModel.build(map, self);
        }

        public ListSetsResponseBodySets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSetsResponseBodySets setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public ListSetsResponseBodySets setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public ListSetsResponseBodySets setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSetsResponseBodySets setSetId(String setId) {
            this.setId = setId;
            return this;
        }
        public String getSetId() {
            return this.setId;
        }

        public ListSetsResponseBodySets setSetName(String setName) {
            this.setName = setName;
            return this;
        }
        public String getSetName() {
            return this.setName;
        }

        public ListSetsResponseBodySets setVideoCount(Integer videoCount) {
            this.videoCount = videoCount;
            return this;
        }
        public Integer getVideoCount() {
            return this.videoCount;
        }

        public ListSetsResponseBodySets setVideoLength(Integer videoLength) {
            this.videoLength = videoLength;
            return this;
        }
        public Integer getVideoLength() {
            return this.videoLength;
        }

    }

}
