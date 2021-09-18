// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServicePreResponseBody extends TeaModel {
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

    public static SgVpcSearchServicePreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServicePreResponseBody self = new SgVpcSearchServicePreResponseBody();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServicePreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SgVpcSearchServicePreResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SgVpcSearchServicePreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SgVpcSearchServicePreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
