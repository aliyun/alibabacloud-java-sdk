// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceMeta extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-service</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>fc3</p>
     */
    @NameInMap("type")
    public String type;

    public static ServiceMeta build(java.util.Map<String, ?> map) throws Exception {
        ServiceMeta self = new ServiceMeta();
        return TeaModel.build(map, self);
    }

    public ServiceMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceMeta setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
