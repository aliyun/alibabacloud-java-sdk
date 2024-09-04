// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCustomerResponseBody extends TeaModel {
    /**
     * <p>Code indicating whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data indicating whether a customer was successfully created. If it\&quot;s &quot;true&quot;, the Message contains CID.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Massage indicating whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     * 
     * <strong>example:</strong>
     * <p>A9B725C7-3DBD-576B-AC91-F6F22AB99A77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call it self was successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerResponseBody self = new CreateCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCustomerResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
