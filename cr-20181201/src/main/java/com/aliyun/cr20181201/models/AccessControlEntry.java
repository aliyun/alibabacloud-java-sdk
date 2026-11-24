// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class AccessControlEntry extends TeaModel {
    /**
     * <p>The description of the whitelist entry.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The IP address or CIDR block that is allowed to access the public endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1/32</p>
     */
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
