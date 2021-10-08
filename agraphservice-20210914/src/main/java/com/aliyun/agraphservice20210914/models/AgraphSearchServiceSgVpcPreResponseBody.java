// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class AgraphSearchServiceSgVpcPreResponseBody extends TeaModel {
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

    public static AgraphSearchServiceSgVpcPreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgraphSearchServiceSgVpcPreResponseBody self = new AgraphSearchServiceSgVpcPreResponseBody();
        return TeaModel.build(map, self);
    }

    public AgraphSearchServiceSgVpcPreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgraphSearchServiceSgVpcPreResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AgraphSearchServiceSgVpcPreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AgraphSearchServiceSgVpcPreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
