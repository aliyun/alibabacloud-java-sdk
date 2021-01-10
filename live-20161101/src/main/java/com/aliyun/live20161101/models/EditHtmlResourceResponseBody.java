// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditHtmlResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HtmlResourceId")
    public String htmlResourceId;

    public static EditHtmlResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditHtmlResourceResponseBody self = new EditHtmlResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EditHtmlResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditHtmlResourceResponseBody setHtmlResourceId(String htmlResourceId) {
        this.htmlResourceId = htmlResourceId;
        return this;
    }
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

}
