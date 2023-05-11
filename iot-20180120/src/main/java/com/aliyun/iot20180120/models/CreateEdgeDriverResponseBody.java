// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverResponseBody extends TeaModel {
    /**
     * <p>The error code. Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the driver created.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true indicates that the call was successful. false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEdgeDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeDriverResponseBody self = new CreateEdgeDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEdgeDriverResponseBody setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public CreateEdgeDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateEdgeDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEdgeDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
