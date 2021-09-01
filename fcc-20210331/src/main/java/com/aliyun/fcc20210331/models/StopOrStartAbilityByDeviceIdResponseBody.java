// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class StopOrStartAbilityByDeviceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static StopOrStartAbilityByDeviceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopOrStartAbilityByDeviceIdResponseBody self = new StopOrStartAbilityByDeviceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public StopOrStartAbilityByDeviceIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public StopOrStartAbilityByDeviceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopOrStartAbilityByDeviceIdResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StopOrStartAbilityByDeviceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
