// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCacheCheckAddParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ApplyNumber")
    public String applyNumber;

    public static GetCacheCheckAddParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCacheCheckAddParamResponseBody self = new GetCacheCheckAddParamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCacheCheckAddParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCacheCheckAddParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCacheCheckAddParamResponseBody setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

}
