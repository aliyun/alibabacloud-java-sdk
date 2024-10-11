// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class InitComputingResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MAX_COMPUTE</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>MAX_COMPUTE</p>
     */
    @NameInMap("type")
    public String type;

    public static InitComputingResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitComputingResourceRequest self = new InitComputingResourceRequest();
        return TeaModel.build(map, self);
    }

    public InitComputingResourceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public InitComputingResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
