// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditHtmlResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HtmlResourceId")
    @Validation(required = true)
    public String htmlResourceId;

    public static EditHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EditHtmlResourceResponse self = new EditHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public EditHtmlResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditHtmlResourceResponse setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

}
