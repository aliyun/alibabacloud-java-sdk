// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMonitorGroupByResourceGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupByResourceGroupIdResponseBody self = new CreateMonitorGroupByResourceGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupByResourceGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMonitorGroupByResourceGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMonitorGroupByResourceGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMonitorGroupByResourceGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
