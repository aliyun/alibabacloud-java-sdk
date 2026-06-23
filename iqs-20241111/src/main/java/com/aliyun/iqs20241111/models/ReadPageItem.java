// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageItem extends TeaModel {
    /**
     * <p>The error related to the target URL.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The readable HTML of the target URL.</p>
     * 
     * <strong>example:</strong>
     * <html>\\n<head><title>Example Domain</title></head>\\n<body><div>\\n<h1>Example Domain</h1>\\n<p>This domain is for use in documentation examples without needing permission. Avoid use in operations.</p>\\n<p><a href=\\"https://iana.org/domains/example\\">Learn more</a></p>\\n</div></body>\\n</html>
     */
    @NameInMap("html")
    public String html;

    /**
     * <p>The Markdown content of the target URL.</p>
     * 
     * <strong>example:</strong>
     * <h1>Example Domain\nThis domain is for use in documentation examples without needing permission. Avoid use in operations.\n<a href="https://iana.org/domains/example">Learn more</a>\n</h1>
     */
    @NameInMap("markdown")
    public String markdown;

    /**
     * <p>The raw HTML of the target URL.</p>
     * 
     * <strong>example:</strong>
     * <!doctype html><html lang=\\"en\\"><head><title>Example Domain</title><meta name=\\"viewport\\" content=\\"width=device-width, initial-scale=1\\"><style>body{background:#eee;width:60vw;margin:15vh auto;font-family:system-ui,sans-serif}h1{font-size:1.5em}div{opacity:0.8}a:link,a:visited{color:#348}</style><body><div><h1>Example Domain</h1><p>This domain is for use in documentation examples without needing permission. Avoid use in operations.<p><a href=\\"https://iana.org/domains/example\\">Learn more</a></div></body></html>\\n
     */
    @NameInMap("rawHtml")
    public String rawHtml;

    @NameInMap("screenshot")
    public String screenshot;

    /**
     * <ol>
     * <li><p>If the request to the target site succeeds, the HTTP status code of the target URL is returned.</p>
     * </li>
     * <li><p>If the request to the target site fails, a custom error code is returned:</p>
     * <p> 2.1 4030: The target site has security restrictions, such as robots.txt or security policies.</p>
     * <p> 2.2 4080: The request timed out.</p>
     * <p> 2.3 4290: The rate limiting policy of the site was triggered.</p>
     * <p> 2.4 5010: An unknown exception occurred.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("statusCode")
    public Integer statusCode;

    /**
     * <p>The text content of the target URL.</p>
     * 
     * <strong>example:</strong>
     * <h1>Example Domain\nThis domain is for use in documentation examples without needing permission. Avoid use in operations.\nLearn more\n</h1>
     */
    @NameInMap("text")
    public String text;

    public static ReadPageItem build(java.util.Map<String, ?> map) throws Exception {
        ReadPageItem self = new ReadPageItem();
        return TeaModel.build(map, self);
    }

    public ReadPageItem setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReadPageItem setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public ReadPageItem setMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }
    public String getMarkdown() {
        return this.markdown;
    }

    public ReadPageItem setRawHtml(String rawHtml) {
        this.rawHtml = rawHtml;
        return this;
    }
    public String getRawHtml() {
        return this.rawHtml;
    }

    public ReadPageItem setScreenshot(String screenshot) {
        this.screenshot = screenshot;
        return this;
    }
    public String getScreenshot() {
        return this.screenshot;
    }

    public ReadPageItem setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadPageItem setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
