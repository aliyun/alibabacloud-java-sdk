// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionRequest extends TeaModel {
    @NameInMap("withDocumentationURL")
    public Boolean withDocumentationURL;

    @NameInMap("withExtendResourceURL")
    public Boolean withExtendResourceURL;

    public static GetProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRequest self = new GetProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRequest setWithDocumentationURL(Boolean withDocumentationURL) {
        this.withDocumentationURL = withDocumentationURL;
        return this;
    }
    public Boolean getWithDocumentationURL() {
        return this.withDocumentationURL;
    }

    public GetProductVersionRequest setWithExtendResourceURL(Boolean withExtendResourceURL) {
        this.withExtendResourceURL = withExtendResourceURL;
        return this;
    }
    public Boolean getWithExtendResourceURL() {
        return this.withExtendResourceURL;
    }

}
