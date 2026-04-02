// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DirectNotifyChannel extends TeaModel {
    /**
     * <p>通知对象标识列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

    /**
     * <p>通知渠道类型</p>
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
