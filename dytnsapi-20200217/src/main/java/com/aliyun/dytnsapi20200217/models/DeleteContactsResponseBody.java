// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DeleteContactsResponseBody extends TeaModel {
    /**
     * <p>The response code. <code>OK</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the operation succeeded. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The response message.</p>
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
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsResponseBody self = new DeleteContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteContactsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
