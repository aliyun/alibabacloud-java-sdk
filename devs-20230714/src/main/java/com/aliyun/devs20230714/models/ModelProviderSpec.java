// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelProviderSpec extends TeaModel {
    @NameInMap("authorization")
    public ModelProviderAuthorization authorization;

    @NameInMap("schema")
    public ModelProviderSchema schema;

    public static ModelProviderSpec build(java.util.Map<String, ?> map) throws Exception {
        ModelProviderSpec self = new ModelProviderSpec();
        return TeaModel.build(map, self);
    }

    public ModelProviderSpec setAuthorization(ModelProviderAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
    public ModelProviderAuthorization getAuthorization() {
        return this.authorization;
    }

    public ModelProviderSpec setSchema(ModelProviderSchema schema) {
        this.schema = schema;
        return this;
    }
    public ModelProviderSchema getSchema() {
        return this.schema;
    }

}
