// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLColumn extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>from deserializer</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>col</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("Type")
    public String type;

    public static DLColumn build(java.util.Map<String, ?> map) throws Exception {
        DLColumn self = new DLColumn();
        return TeaModel.build(map, self);
    }

    public DLColumn setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DLColumn setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLColumn setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
