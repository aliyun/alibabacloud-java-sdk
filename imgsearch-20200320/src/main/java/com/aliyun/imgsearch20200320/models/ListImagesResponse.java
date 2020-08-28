// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListImagesResponseData data;

    public static ListImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponse self = new ListImagesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListImagesResponseDataImageList extends TeaModel {
        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        @NameInMap("ExtraData")
        @Validation(required = true)
        public String extraData;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public Long updatedAt;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public Long createdAt;

        public static ListImagesResponseDataImageList build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseDataImageList self = new ListImagesResponseDataImageList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListImagesResponseData extends TeaModel {
        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ImageList")
        @Validation(required = true)
        public java.util.List<ListImagesResponseDataImageList> imageList;

        public static ListImagesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseData self = new ListImagesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
