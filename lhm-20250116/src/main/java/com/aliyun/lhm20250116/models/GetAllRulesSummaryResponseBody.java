// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetAllRulesSummaryResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The fault error message encoding.</p>
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
     * <p>not supported.pos 3084, line 96, column 1, token IDENTIFIER settings</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E871A612-DBD2-53D9-B2A0-723EC30B1823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAllRulesSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllRulesSummaryResponseBody self = new GetAllRulesSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllRulesSummaryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAllRulesSummaryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetAllRulesSummaryResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetAllRulesSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllRulesSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
