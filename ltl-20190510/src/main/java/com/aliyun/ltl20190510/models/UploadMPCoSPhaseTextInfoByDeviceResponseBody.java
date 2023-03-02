// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadMPCoSPhaseTextInfoByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoByDeviceResponseBody self = new UploadMPCoSPhaseTextInfoByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
