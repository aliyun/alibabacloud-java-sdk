// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SegmentImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentImageResponseBody self = new SegmentImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SegmentImageResponseBody setData(SegmentImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentImageResponseBodyData getData() {
        return this.data;
    }

    public SegmentImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentImageResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static SegmentImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentImageResponseBodyData self = new SegmentImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentImageResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
