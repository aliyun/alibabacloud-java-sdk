// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateShortUrlNewResponseBody extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtInvalidTime")
    public String gmtInvalidTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShortUrl")
    public String shortUrl;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    public static CreateShortUrlNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShortUrlNewResponseBody self = new CreateShortUrlNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShortUrlNewResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateShortUrlNewResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public CreateShortUrlNewResponseBody setGmtInvalidTime(String gmtInvalidTime) {
        this.gmtInvalidTime = gmtInvalidTime;
        return this;
    }
    public String getGmtInvalidTime() {
        return this.gmtInvalidTime;
    }

    public CreateShortUrlNewResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateShortUrlNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateShortUrlNewResponseBody setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

    public CreateShortUrlNewResponseBody setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
