// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckModifyTableShardingKeyParamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    public static PreCheckModifyTableShardingKeyParamResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckModifyTableShardingKeyParamResponse self = new PreCheckModifyTableShardingKeyParamResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckModifyTableShardingKeyParamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreCheckModifyTableShardingKeyParamResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PreCheckModifyTableShardingKeyParamResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
