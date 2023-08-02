// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDoCheckQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnValue")
    public Boolean returnValue;

    public static StartDoCheckQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDoCheckQualityResponseBody self = new StartDoCheckQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDoCheckQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDoCheckQualityResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public StartDoCheckQualityResponseBody setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public Boolean getReturnValue() {
        return this.returnValue;
    }

}
