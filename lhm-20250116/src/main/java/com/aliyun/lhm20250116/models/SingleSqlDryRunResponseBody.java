// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SingleSqlDryRunResponseBody extends TeaModel {
    /**
     * <p>The business data returned by the operation (in string format). The specific content varies by operation.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>not supported.pos 14327, line 452, column 10, token IDENTIFIER dialect_type</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CFD7C81E-1A53-5C7C-846D-381BC1C4385F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SingleSqlDryRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleSqlDryRunResponseBody self = new SingleSqlDryRunResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleSqlDryRunResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SingleSqlDryRunResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SingleSqlDryRunResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SingleSqlDryRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SingleSqlDryRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
