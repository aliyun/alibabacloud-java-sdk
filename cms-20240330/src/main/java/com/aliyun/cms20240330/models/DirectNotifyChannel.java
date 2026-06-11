// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DirectNotifyChannel extends TeaModel {
    /**
     * <p>An array of recipient identifiers. The format of each identifier depends on the <code>type</code>. For example, if <code>type</code> is <code>email</code>, the identifiers are email addresses.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

    /**
     * <p>The notification channel type. For example, <code>sms</code> or <code>email</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static DirectNotifyChannel build(java.util.Map<String, ?> map) throws Exception {
        DirectNotifyChannel self = new DirectNotifyChannel();
        return TeaModel.build(map, self);
    }

    public DirectNotifyChannel setIdentifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    public DirectNotifyChannel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
