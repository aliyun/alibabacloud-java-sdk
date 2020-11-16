// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ControlHtmlResourceRequest extends TeaModel {
    @NameInMap("HtmlResourceId")
    public String htmlResourceId;

    @NameInMap("htmlUrl")
    public String htmlUrl;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("Operate")
    @Validation(required = true)
    public String operate;

    public static ControlHtmlResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ControlHtmlResourceRequest self = new ControlHtmlResourceRequest();
        return TeaModel.build(map, self);
    }

    public ControlHtmlResourceRequest setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    public ControlHtmlResourceRequest setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public ControlHtmlResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ControlHtmlResourceRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

}
