// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BoundToolApi extends TeaModel {
    @NameInMap("method")
    public String method;

    @NameInMap("path")
    public String path;

    public static BoundToolApi build(java.util.Map<String, ?> map) throws Exception {
        BoundToolApi self = new BoundToolApi();
        return TeaModel.build(map, self);
    }

    public BoundToolApi setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public BoundToolApi setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
