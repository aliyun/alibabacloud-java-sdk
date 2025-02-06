// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16105</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>can not find this group</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4AA433C4-FCCC-4664-A4E0-342872A9E11C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponseBody self = new DeleteGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
