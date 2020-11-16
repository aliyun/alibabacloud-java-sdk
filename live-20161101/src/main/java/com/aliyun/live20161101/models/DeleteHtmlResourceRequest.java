// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteHtmlResourceRequest extends TeaModel {
    @NameInMap("HtmlResourceId")
    public String htmlResourceId;

    @NameInMap("htmlUrl")
    public String htmlUrl;

    @NameInMap("CasterId")
    public String casterId;

    public static DeleteHtmlResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHtmlResourceRequest self = new DeleteHtmlResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHtmlResourceRequest setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    public DeleteHtmlResourceRequest setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public DeleteHtmlResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
