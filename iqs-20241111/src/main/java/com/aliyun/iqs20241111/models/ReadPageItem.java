// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageItem extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("html")
    public String html;

    @NameInMap("markdown")
    public String markdown;

    @NameInMap("rawHtml")
    public String rawHtml;

    @NameInMap("screenshot")
    public String screenshot;

    @NameInMap("statusCode")
    public Integer statusCode;

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
