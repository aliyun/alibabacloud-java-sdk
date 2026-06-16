// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebFetchResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("ContentFormat")
    public String contentFormat;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    @NameInMap("UrlType")
    public String urlType;

    public static WebFetchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebFetchResponseBody self = new WebFetchResponseBody();
        return TeaModel.build(map, self);
    }

    public WebFetchResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public WebFetchResponseBody setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }

    public WebFetchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WebFetchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WebFetchResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WebFetchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebFetchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public WebFetchResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public WebFetchResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public WebFetchResponseBody setUrlType(String urlType) {
        this.urlType = urlType;
        return this;
    }
    public String getUrlType() {
        return this.urlType;
    }

}
