// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ValidateModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BF72A6FB-B07</p>
     */
    @NameInMap("moduleValidationId")
    public String moduleValidationId;

    /**
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Validating</p>
     */
    @NameInMap("status")
    public String status;

    public static ValidateModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateModuleResponseBody self = new ValidateModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateModuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateModuleResponseBody setModuleValidationId(String moduleValidationId) {
        this.moduleValidationId = moduleValidationId;
        return this;
    }
    public String getModuleValidationId() {
        return this.moduleValidationId;
    }

    public ValidateModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateModuleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
