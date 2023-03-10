// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskWithMaintainUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateKillInstanceSessionTaskWithMaintainUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskWithMaintainUserResponseBody self = new CreateKillInstanceSessionTaskWithMaintainUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
