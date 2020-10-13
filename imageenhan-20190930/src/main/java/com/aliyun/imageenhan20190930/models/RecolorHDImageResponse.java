// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecolorHDImageResponseData data;

    public static RecolorHDImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageResponse self = new RecolorHDImageResponse();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecolorHDImageResponse setData(RecolorHDImageResponseData data) {
        this.data = data;
        return this;
    }
    public RecolorHDImageResponseData getData() {
        return this.data;
    }

    public static class RecolorHDImageResponseData extends TeaModel {
        @NameInMap("ImageList")
        @Validation(required = true)
        public java.util.List<String> imageList;

        public static RecolorHDImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageResponseData self = new RecolorHDImageResponseData();
            return TeaModel.build(map, self);
        }

        public RecolorHDImageResponseData setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

    }

}
