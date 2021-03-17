// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecolorHDImageResponseBodyData data;

    public static RecolorHDImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageResponseBody self = new RecolorHDImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecolorHDImageResponseBody setData(RecolorHDImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecolorHDImageResponseBodyData getData() {
        return this.data;
    }

    public static class RecolorHDImageResponseBodyData extends TeaModel {
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        public static RecolorHDImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageResponseBodyData self = new RecolorHDImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecolorHDImageResponseBodyData setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

    }

}
