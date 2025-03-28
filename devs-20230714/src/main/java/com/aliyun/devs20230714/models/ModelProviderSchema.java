// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelProviderSchema extends TeaModel {
    @NameInMap("detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("type")
    public String type;

    public static ModelProviderSchema build(java.util.Map<String, ?> map) throws Exception {
        ModelProviderSchema self = new ModelProviderSchema();
        return TeaModel.build(map, self);
    }

    public ModelProviderSchema setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ModelProviderSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
