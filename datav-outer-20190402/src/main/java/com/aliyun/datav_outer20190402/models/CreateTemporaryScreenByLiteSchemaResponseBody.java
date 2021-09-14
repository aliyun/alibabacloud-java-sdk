// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemporaryScreenByLiteSchemaResponseBody extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CssSelector")
    public String cssSelector;

    public static CreateTemporaryScreenByLiteSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemporaryScreenByLiteSchemaResponseBody self = new CreateTemporaryScreenByLiteSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemporaryScreenByLiteSchemaResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateTemporaryScreenByLiteSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTemporaryScreenByLiteSchemaResponseBody setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
        return this;
    }
    public String getCssSelector() {
        return this.cssSelector;
    }

}
