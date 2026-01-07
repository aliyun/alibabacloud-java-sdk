// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactDeleteResponseBody extends TeaModel {
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
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>36E0A548-4BA3-549B-8855-22E3F5C6D47E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseContactDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactDeleteResponseBody self = new EnterpriseContactDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactDeleteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseContactDeleteResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnterpriseContactDeleteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseContactDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseContactDeleteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
