// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddShortUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShortUrlResponseBody self = new AddShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShortUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddShortUrlResponseBody setData(AddShortUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddShortUrlResponseBodyData getData() {
        return this.data;
    }

    public AddShortUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddShortUrlResponseBodyData extends TeaModel {
        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        public static AddShortUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddShortUrlResponseBodyData self = new AddShortUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddShortUrlResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public AddShortUrlResponseBodyData setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public AddShortUrlResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

    }

}
