// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecolorImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecolorImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecolorImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageResponseBody self = new RecolorImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecolorImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecolorImageResponseBody setData(RecolorImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecolorImageResponseBodyData getData() {
        return this.data;
    }

    public RecolorImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
