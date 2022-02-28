// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class GenerateInstallScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstallScript")
    public String installScript;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateInstallScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateInstallScriptResponseBody self = new GenerateInstallScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateInstallScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateInstallScriptResponseBody setInstallScript(String installScript) {
        this.installScript = installScript;
        return this;
    }
    public String getInstallScript() {
        return this.installScript;
    }

    public GenerateInstallScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateInstallScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateInstallScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
