// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class SearchVerificationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that was returned for the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that was returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The data that was returned for the request. Example: "Model": { "records": \[ { "sendDate":, "channel": "", "serviceSid": "", "to": "", "updatedDate":, "verificationId": "", "status": "" } ], "pageNo": , "totalPage": 1, "pageSize": 20, "totalCount": 1, }</p>
     */
    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    /**
     * <p>The ID of the request. An ID is a unique identifier that Alibaba Cloud generates for a request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchVerificationResponseBody self = new SearchVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchVerificationResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public SearchVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchVerificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
