// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class WeathermonitorResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // rt
    @NameInMap("Rt")
    public Long rt;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static WeathermonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WeathermonitorResponseBody self = new WeathermonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public WeathermonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WeathermonitorResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public WeathermonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WeathermonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WeathermonitorResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public WeathermonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
