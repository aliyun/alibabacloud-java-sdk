// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentFeatureResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, String> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradeEnvironmentFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentFeatureResponseBody self = new UpgradeEnvironmentFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentFeatureResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpgradeEnvironmentFeatureResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public UpgradeEnvironmentFeatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeEnvironmentFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeEnvironmentFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
