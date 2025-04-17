// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>100600017</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Owner not allowed to delete</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5BFFEE3-6025-443F-8A03-02D619B5C4B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersResponseBody self = new DeleteMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
