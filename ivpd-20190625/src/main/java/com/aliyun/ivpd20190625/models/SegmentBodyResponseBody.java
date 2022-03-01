// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentBodyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SegmentBodyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyResponseBody self = new SegmentBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentBodyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SegmentBodyResponseBody setData(SegmentBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentBodyResponseBodyData getData() {
        return this.data;
    }

    public SegmentBodyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentBodyResponseBodyData extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static SegmentBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentBodyResponseBodyData self = new SegmentBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentBodyResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
