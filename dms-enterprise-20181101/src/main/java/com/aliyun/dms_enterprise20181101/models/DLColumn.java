// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLColumn extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

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
