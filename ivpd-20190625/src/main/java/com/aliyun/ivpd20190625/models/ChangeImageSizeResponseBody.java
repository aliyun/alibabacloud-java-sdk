// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChangeImageSizeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeImageSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponseBody self = new ChangeImageSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeImageSizeResponseBody setData(ChangeImageSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeImageSizeResponseBodyData getData() {
        return this.data;
    }

    public ChangeImageSizeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeImageSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeImageSizeResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static ChangeImageSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseBodyData self = new ChangeImageSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeImageSizeResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
