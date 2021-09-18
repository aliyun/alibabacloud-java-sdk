// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SearchSgVpcGraphServiceResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public String data;

    // code
    @NameInMap("Code")
    public Integer code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // requestid
    @NameInMap("RequestId")
    public String requestId;

    public static SearchSgVpcGraphServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSgVpcGraphServiceResponseBody self = new SearchSgVpcGraphServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSgVpcGraphServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchSgVpcGraphServiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SearchSgVpcGraphServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchSgVpcGraphServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchSgVpcGraphServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
