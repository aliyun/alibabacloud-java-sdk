// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListImagesResponseBodyData data;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setData(ListImagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListImagesResponseBodyData getData() {
        return this.data;
    }

    public static class ListImagesResponseBodyDataImageList extends TeaModel {
        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ExtraData")
        public String extraData;

        public static ListImagesResponseBodyDataImageList build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyDataImageList self = new ListImagesResponseBodyDataImageList();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyDataImageList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListImagesResponseBodyDataImageList setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListImagesResponseBodyDataImageList setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListImagesResponseBodyDataImageList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListImagesResponseBodyDataImageList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

    public static class ListImagesResponseBodyData extends TeaModel {
        @NameInMap("ImageList")
        public java.util.List<ListImagesResponseBodyDataImageList> imageList;

        @NameInMap("Token")
        public String token;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyData self = new ListImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyData setImageList(java.util.List<ListImagesResponseBodyDataImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<ListImagesResponseBodyDataImageList> getImageList() {
            return this.imageList;
        }

        public ListImagesResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListImagesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
