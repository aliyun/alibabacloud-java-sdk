// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LineageTask extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>custom-sql</p>
     */
    @NameInMap("Type")
    public String type;

    public static LineageTask build(java.util.Map<String, ?> map) throws Exception {
        LineageTask self = new LineageTask();
        return TeaModel.build(map, self);
    }

    public LineageTask setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LineageTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LineageTask setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
