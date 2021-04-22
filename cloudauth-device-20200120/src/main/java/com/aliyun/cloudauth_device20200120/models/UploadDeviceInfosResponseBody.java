// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class UploadDeviceInfosResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public Boolean resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static UploadDeviceInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceInfosResponseBody self = new UploadDeviceInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDeviceInfosResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public UploadDeviceInfosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDeviceInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDeviceInfosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
