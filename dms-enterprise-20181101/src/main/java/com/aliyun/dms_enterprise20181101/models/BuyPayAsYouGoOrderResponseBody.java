// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BuyPayAsYouGoOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Purchases a pay-as-you-go Data Management (DMS) resource.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>If the purchase is successful, the ID of the purchased instance is returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BuyPayAsYouGoOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuyPayAsYouGoOrderResponseBody self = new BuyPayAsYouGoOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public BuyPayAsYouGoOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BuyPayAsYouGoOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BuyPayAsYouGoOrderResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BuyPayAsYouGoOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuyPayAsYouGoOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
