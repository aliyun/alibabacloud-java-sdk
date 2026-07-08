// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UpdateContactsResponseBody extends TeaModel {
    /**
     * <p>The request status code. The value <code>OK</code> indicates a successful request. For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the operation was successful. A value of <strong>true</strong> indicates success, and a value of <strong>false</strong> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The description of the status code.</p>
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
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactsResponseBody self = new UpdateContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContactsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
