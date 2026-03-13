// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Key extends TeaModel {
    /**
     * <p>The prefix that is used to filter the event-related resources. Only events related to the resources whose names are prefixed with the specified value of Prefix are traced. For example, if you set Prefix to serverless_, only events related to the resources that are prefixed with serverless_ can trigger the function.</p>
     * 
     * <strong>example:</strong>
     * <p>serverless_</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The suffix that is used to filter the event-related resources. Only events related to the resources whose names are suffixed with the specified value of Suffix are traced. For example, if you set Suffix to .zip, only events related to the resources that are suffixed with .zip can trigger the function.</p>
     * 
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
