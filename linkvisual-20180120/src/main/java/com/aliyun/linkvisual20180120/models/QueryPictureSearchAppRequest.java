// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    public static QueryPictureSearchAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppRequest self = new QueryPictureSearchAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryPictureSearchAppRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

}
