// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityResponseBody extends TeaModel {
    /**
     * <p>The alert threshold. Valid values of N: 1 to 21.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyHostAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAvailabilityResponseBody self = new ModifyHostAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHostAvailabilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyHostAvailabilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyHostAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHostAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
