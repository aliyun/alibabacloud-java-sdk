// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableHostAvailabilityResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>>  The status code 200 indicates a success.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <br>
     * <p>*   true: successful.</p>
     * <p>*   false: failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DisableHostAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableHostAvailabilityResponseBody self = new DisableHostAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableHostAvailabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableHostAvailabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableHostAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableHostAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
