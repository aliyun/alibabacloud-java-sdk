// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckModifyTableShardingKeyParamResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PreCheckModifyTableShardingKeyParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckModifyTableShardingKeyParamResponseBody self = new PreCheckModifyTableShardingKeyParamResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckModifyTableShardingKeyParamResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public PreCheckModifyTableShardingKeyParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreCheckModifyTableShardingKeyParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
