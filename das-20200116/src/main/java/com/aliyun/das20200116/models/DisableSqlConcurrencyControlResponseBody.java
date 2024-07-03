// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableSqlConcurrencyControlResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DisableSqlConcurrencyControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlConcurrencyControlResponseBody self = new DisableSqlConcurrencyControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSqlConcurrencyControlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSqlConcurrencyControlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DisableSqlConcurrencyControlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSqlConcurrencyControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSqlConcurrencyControlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
