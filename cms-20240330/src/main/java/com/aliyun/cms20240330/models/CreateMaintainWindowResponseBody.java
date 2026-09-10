// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMaintainWindowResponseBody extends TeaModel {
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaintainWindowResponseBody self = new CreateMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public CreateMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
