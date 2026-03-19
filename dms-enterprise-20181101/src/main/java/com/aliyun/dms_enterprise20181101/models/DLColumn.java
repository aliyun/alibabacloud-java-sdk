// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLColumn extends TeaModel {
    /**
     * <p>The comment of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>from deserializer</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>col</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The data type of the column, including array, bigint, binary, boolean, char, date, decimal, double, float, int, interval, map, set, smallint, string, struct, timestamp, tinyint, union, varchar.</p>
     * 
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
