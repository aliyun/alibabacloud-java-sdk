// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SyncAllEduInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SyncAllEduInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncAllEduInfoResponseBody self = new SyncAllEduInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncAllEduInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncAllEduInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SyncAllEduInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncAllEduInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncAllEduInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
