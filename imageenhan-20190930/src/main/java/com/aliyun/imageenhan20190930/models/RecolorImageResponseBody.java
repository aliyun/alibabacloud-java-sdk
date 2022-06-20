// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecolorImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecolorImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageResponseBody self = new RecolorImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecolorImageResponseBody setData(RecolorImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecolorImageResponseBodyData getData() {
        return this.data;
    }

    public RecolorImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecolorImageResponseBodyData extends TeaModel {
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        public static RecolorImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecolorImageResponseBodyData self = new RecolorImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecolorImageResponseBodyData setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

    }

}
