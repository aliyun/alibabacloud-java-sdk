// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileResponseBody extends TeaModel {
    /**
     * <p>The execution result of the operation. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Specifies whether data is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>false: Data fails to be returned.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <p>: Data is returned.</p>
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned error message. This parameter is not returned if the value of Code is <code>success</code>.</p>
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
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileResponseBody self = new ModifyCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCdsFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyCdsFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCdsFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
