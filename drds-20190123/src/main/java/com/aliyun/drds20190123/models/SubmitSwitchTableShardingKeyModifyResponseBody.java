// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSwitchTableShardingKeyModifyResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitSwitchTableShardingKeyModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSwitchTableShardingKeyModifyResponseBody self = new SubmitSwitchTableShardingKeyModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSwitchTableShardingKeyModifyResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SubmitSwitchTableShardingKeyModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSwitchTableShardingKeyModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
