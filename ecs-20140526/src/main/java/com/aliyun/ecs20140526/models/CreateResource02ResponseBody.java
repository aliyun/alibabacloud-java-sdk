// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateResource02ResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ids")
    public String ids;

    public static CreateResource02ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResource02ResponseBody self = new CreateResource02ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResource02ResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateResource02ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResource02ResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
