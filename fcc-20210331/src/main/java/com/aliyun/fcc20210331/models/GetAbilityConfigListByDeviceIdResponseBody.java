// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAbilityConfigListByDeviceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<String> data;

    public static GetAbilityConfigListByDeviceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAbilityConfigListByDeviceIdResponseBody self = new GetAbilityConfigListByDeviceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAbilityConfigListByDeviceIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAbilityConfigListByDeviceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAbilityConfigListByDeviceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAbilityConfigListByDeviceIdResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
