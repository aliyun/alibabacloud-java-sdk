// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductRequest extends TeaModel {
    @NameInMap("withIconURL")
    public Boolean withIconURL;

    public static GetProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductRequest self = new GetProductRequest();
        return TeaModel.build(map, self);
    }

    public GetProductRequest setWithIconURL(Boolean withIconURL) {
        this.withIconURL = withIconURL;
        return this;
    }
    public Boolean getWithIconURL() {
        return this.withIconURL;
    }

}
