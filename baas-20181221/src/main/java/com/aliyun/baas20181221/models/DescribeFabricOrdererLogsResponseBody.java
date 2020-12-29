// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrdererLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public String result;

    public static DescribeFabricOrdererLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrdererLogsResponseBody self = new DescribeFabricOrdererLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrdererLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrdererLogsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrdererLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrdererLogsResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
