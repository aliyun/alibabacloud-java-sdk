// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryAvailableNumbersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <strong>example:</strong>
     * <p>PARTNER.CONFIG.NOT.FOUND</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAvailableNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableNumbersResponseBody self = new QueryAvailableNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvailableNumbersResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public QueryAvailableNumbersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAvailableNumbersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryAvailableNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvailableNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
