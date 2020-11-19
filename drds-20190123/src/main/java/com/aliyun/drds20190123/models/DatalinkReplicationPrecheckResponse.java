// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DatalinkReplicationPrecheckResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    public static DatalinkReplicationPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        DatalinkReplicationPrecheckResponse self = new DatalinkReplicationPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public DatalinkReplicationPrecheckResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatalinkReplicationPrecheckResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DatalinkReplicationPrecheckResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
