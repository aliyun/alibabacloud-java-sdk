// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class SwitchVpcRouteToBackUpZoneResponseBody extends TeaModel {
    @NameInMap("AsynToken")
    public String asynToken;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static SwitchVpcRouteToBackUpZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchVpcRouteToBackUpZoneResponseBody self = new SwitchVpcRouteToBackUpZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchVpcRouteToBackUpZoneResponseBody setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

    public SwitchVpcRouteToBackUpZoneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SwitchVpcRouteToBackUpZoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchVpcRouteToBackUpZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchVpcRouteToBackUpZoneResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
