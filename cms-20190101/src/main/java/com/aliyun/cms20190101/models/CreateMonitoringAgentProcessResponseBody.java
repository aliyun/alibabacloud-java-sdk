// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitoringAgentProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMonitoringAgentProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringAgentProcessResponseBody self = new CreateMonitoringAgentProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringAgentProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMonitoringAgentProcessResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateMonitoringAgentProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMonitoringAgentProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMonitoringAgentProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
