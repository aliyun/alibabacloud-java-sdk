// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileShareLinkResponseBody extends TeaModel {
    /**
     * <p>The operation result. The value success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Data")
    public CdsFileShareLinkModel data;

    /**
     * <p>The error message that is returned. This parameter is not returned if the value of Code is success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCdsFileShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileShareLinkResponseBody self = new CreateCdsFileShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileShareLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCdsFileShareLinkResponseBody setData(CdsFileShareLinkModel data) {
        this.data = data;
        return this;
    }
    public CdsFileShareLinkModel getData() {
        return this.data;
    }

    public CreateCdsFileShareLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCdsFileShareLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCdsFileShareLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
