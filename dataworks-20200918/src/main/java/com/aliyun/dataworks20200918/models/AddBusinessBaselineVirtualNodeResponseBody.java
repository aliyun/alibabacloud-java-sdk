// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class AddBusinessBaselineVirtualNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddBusinessBaselineVirtualNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessBaselineVirtualNodeResponseBody self = new AddBusinessBaselineVirtualNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBusinessBaselineVirtualNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddBusinessBaselineVirtualNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
