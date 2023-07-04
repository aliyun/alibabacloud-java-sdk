// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmartShortUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<CreateSmartShortUrlResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSmartShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartShortUrlResponseBody self = new CreateSmartShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmartShortUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmartShortUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSmartShortUrlResponseBody setModel(java.util.List<CreateSmartShortUrlResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<CreateSmartShortUrlResponseBodyModel> getModel() {
        return this.model;
    }

    public CreateSmartShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSmartShortUrlResponseBodyModel extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ShortName")
        public String shortName;

        @NameInMap("ShortUrl")
        public String shortUrl;

        public static CreateSmartShortUrlResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateSmartShortUrlResponseBodyModel self = new CreateSmartShortUrlResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateSmartShortUrlResponseBodyModel setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateSmartShortUrlResponseBodyModel setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public CreateSmartShortUrlResponseBodyModel setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateSmartShortUrlResponseBodyModel setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public CreateSmartShortUrlResponseBodyModel setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

    }

}
