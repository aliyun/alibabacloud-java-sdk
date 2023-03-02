// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody extends TeaModel {
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

    public static BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody self = new BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
