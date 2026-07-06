// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class AccessControlEntry extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Entry")
    public String entry;

    public static AccessControlEntry build(java.util.Map<String, ?> map) throws Exception {
        AccessControlEntry self = new AccessControlEntry();
        return TeaModel.build(map, self);
    }

    public AccessControlEntry setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AccessControlEntry setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

}
