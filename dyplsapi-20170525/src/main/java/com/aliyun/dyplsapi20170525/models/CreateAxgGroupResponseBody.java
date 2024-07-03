// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateAxgGroupResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of number group G. The value of this parameter is required when the <a href="https://help.aliyun.com/document_detail/110249.html">BindAxg</a> operation is called to add an AXG binding.</p>
     * 
     * <strong>example:</strong>
     * <p>2000000000001</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>635C0FDA-9EBC-43D7-B368-9F583C08A126</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAxgGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAxgGroupResponseBody self = new CreateAxgGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAxgGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAxgGroupResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateAxgGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAxgGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
