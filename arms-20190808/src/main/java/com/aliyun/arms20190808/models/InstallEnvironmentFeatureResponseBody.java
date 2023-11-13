// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallEnvironmentFeatureResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>ReleaseId after installation.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Prompt message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>api was successful:</p>
     * <br>
     * <p>- true: success.</p>
     * <p>- false: fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InstallEnvironmentFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallEnvironmentFeatureResponseBody self = new InstallEnvironmentFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallEnvironmentFeatureResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstallEnvironmentFeatureResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InstallEnvironmentFeatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallEnvironmentFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallEnvironmentFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
