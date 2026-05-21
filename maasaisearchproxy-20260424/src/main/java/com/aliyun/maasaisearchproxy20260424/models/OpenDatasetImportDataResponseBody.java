// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetImportDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1a0f40dd17774641794394269ec0e9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static OpenDatasetImportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetImportDataResponseBody self = new OpenDatasetImportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDatasetImportDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OpenDatasetImportDataResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public OpenDatasetImportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenDatasetImportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
