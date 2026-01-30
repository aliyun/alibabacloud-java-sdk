// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ProcessApprovalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>23309219-4A34-589D-A3E0-9B2A3BFFD24F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ProcessApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProcessApprovalResponseBody self = new ProcessApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public ProcessApprovalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProcessApprovalResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ProcessApprovalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProcessApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
