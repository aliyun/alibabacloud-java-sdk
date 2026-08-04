// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSearchClientTreeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>研发部</p>
     */
    @NameInMap("keyword")
    public String keyword;

    public static ModelRouterSearchClientTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSearchClientTreeRequest self = new ModelRouterSearchClientTreeRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterSearchClientTreeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
