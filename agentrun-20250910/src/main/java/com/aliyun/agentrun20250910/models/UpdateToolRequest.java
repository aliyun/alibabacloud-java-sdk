// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateToolRequest extends TeaModel {
    /**
     * <p>更新工具的请求参数，只需提供需要修改的字段</p>
     */
    @NameInMap("body")
    public UpdateToolInputV2 body;

    public static UpdateToolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateToolRequest self = new UpdateToolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateToolRequest setBody(UpdateToolInputV2 body) {
        this.body = body;
        return this;
    }
    public UpdateToolInputV2 getBody() {
        return this.body;
    }

}
