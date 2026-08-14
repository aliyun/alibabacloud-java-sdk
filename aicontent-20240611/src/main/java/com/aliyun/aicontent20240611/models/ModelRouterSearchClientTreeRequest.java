// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSearchClientTreeRequest extends TeaModel {
    /**
     * <p>The search keyword, which can be a department name, username, or phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Department</p>
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
