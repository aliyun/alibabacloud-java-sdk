// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditHtmlResourceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("HtmlResourceId")
    public String htmlResourceId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("HtmlUrl")
    public String htmlUrl;

    @NameInMap("htmlContent")
    public String htmlContent;

    @NameInMap("Config")
    public String config;

    public static EditHtmlResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EditHtmlResourceRequest self = new EditHtmlResourceRequest();
        return TeaModel.build(map, self);
    }

    public EditHtmlResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditHtmlResourceRequest setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    public EditHtmlResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public EditHtmlResourceRequest setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public EditHtmlResourceRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public EditHtmlResourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
