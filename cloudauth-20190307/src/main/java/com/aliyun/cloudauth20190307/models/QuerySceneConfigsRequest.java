// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QuerySceneConfigsRequest extends TeaModel {
    /**
     * <p>Scene type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VOLUNTARY</p>
     */
    @NameInMap("type")
    public String type;

    public static QuerySceneConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneConfigsRequest self = new QuerySceneConfigsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySceneConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
