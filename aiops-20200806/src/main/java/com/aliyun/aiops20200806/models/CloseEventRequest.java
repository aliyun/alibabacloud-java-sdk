// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CloseEventRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("CloseDesc")
    public String closeDesc;

    public static CloseEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseEventRequest self = new CloseEventRequest();
        return TeaModel.build(map, self);
    }

    public CloseEventRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CloseEventRequest setCloseDesc(String closeDesc) {
        this.closeDesc = closeDesc;
        return this;
    }
    public String getCloseDesc() {
        return this.closeDesc;
    }

}
