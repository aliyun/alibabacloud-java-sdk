// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebFetchResponseBody extends TeaModel {
    /**
     * <p>The content of the web page.</p>
     * 
     * <strong>example:</strong>
     * <p>Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The actual output format. Valid values:</p>
     * <ul>
     * <li><p><strong>markdown</strong>: Markdown format.</p>
     * </li>
     * <li><p><strong>html</strong>: HTML format.</p>
     * </li>
     * <li><p><strong>text</strong>: Plain text format.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("ContentFormat")
    public String contentFormat;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorMessage Code</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorMessage Example</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The title of the web page.</p>
     * 
     * <strong>example:</strong>
     * <p>Spring Boot</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The URL of the web page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx/projects/spring-boot">https://xxxx/projects/spring-boot</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The URL classification result. Valid values:</p>
     * <ul>
     * <li><strong>static_html</strong>: Static HTML page.</li>
     * <li><strong>dynamic_js</strong>: Single-page application (SPA) page that requires JavaScript rendering.</li>
     * <li><strong>audio</strong>: Audio file.</li>
     * <li><strong>video</strong>: Video file.</li>
     * <li><strong>document</strong>: Document file (PDF, Word, PPT, or Excel).</li>
     * <li><strong>unknown</strong>: Unrecognizable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static_html</p>
     */
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
