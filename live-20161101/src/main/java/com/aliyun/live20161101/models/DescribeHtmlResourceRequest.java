// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHtmlResourceRequest extends TeaModel {
    @NameInMap("HtmlResourceId")
    public String htmlResourceId;

    @NameInMap("htmlUrl")
    public String htmlUrl;

    @NameInMap("CasterId")
    public String casterId;

    public static DescribeHtmlResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHtmlResourceRequest self = new DescribeHtmlResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHtmlResourceRequest setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    public DescribeHtmlResourceRequest setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public DescribeHtmlResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
