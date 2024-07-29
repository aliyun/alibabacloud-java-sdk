// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailOverResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>7441</p>
     */
    @NameInMap("Data")
    public Integer data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9656C816-1E9A-58D2-86D5-710678D61AF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AppFailOverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppFailOverResponseBody self = new AppFailOverResponseBody();
        return TeaModel.build(map, self);
    }

    public AppFailOverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppFailOverResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public AppFailOverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppFailOverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
