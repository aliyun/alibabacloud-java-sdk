// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: conversion successful</p>
     * <p>*   false: conversion failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceChargeTypeResponseBody self = new UpdateInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceChargeTypeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
