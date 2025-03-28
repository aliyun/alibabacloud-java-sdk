// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetSchema extends TeaModel {
    @NameInMap("detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("type")
    public String type;

    public static ToolsetSchema build(java.util.Map<String, ?> map) throws Exception {
        ToolsetSchema self = new ToolsetSchema();
        return TeaModel.build(map, self);
    }

    public ToolsetSchema setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public ToolsetSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
