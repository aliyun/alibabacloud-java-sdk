// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LineageEntity extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-table:123456::test_project::test_tbl</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("Name")
    public String name;

    public static LineageEntity build(java.util.Map<String, ?> map) throws Exception {
        LineageEntity self = new LineageEntity();
        return TeaModel.build(map, self);
    }

    public LineageEntity setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LineageEntity setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LineageEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
