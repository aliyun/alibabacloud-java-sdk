// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class ImportDatasetDataResponseBody extends TeaModel {
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

    public static ImportDatasetDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDatasetDataResponseBody self = new ImportDatasetDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDatasetDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImportDatasetDataResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ImportDatasetDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportDatasetDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
