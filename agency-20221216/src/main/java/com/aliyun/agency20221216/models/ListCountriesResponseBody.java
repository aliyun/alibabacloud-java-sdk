// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCountriesResponseBody extends TeaModel {
    /**
     * <p>Error Code</p>
     * <p>* 200: OK</p>
     * <p>* 1109: System error</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of Region Code</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>Message information</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCountriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCountriesResponseBody self = new ListCountriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCountriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCountriesResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListCountriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCountriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCountriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
