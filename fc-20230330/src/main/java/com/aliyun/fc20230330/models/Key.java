// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Key extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>serverless_</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <strong>example:</strong>
     * <p>.zip</p>
     */
    @NameInMap("suffix")
    public String suffix;

    public static Key build(java.util.Map<String, ?> map) throws Exception {
        Key self = new Key();
        return TeaModel.build(map, self);
    }

    public Key setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public Key setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

}
