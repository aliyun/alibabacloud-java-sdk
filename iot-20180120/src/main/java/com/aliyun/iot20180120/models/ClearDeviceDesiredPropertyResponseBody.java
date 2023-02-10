// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearDeviceDesiredPropertyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClearDeviceDesiredPropertyResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ClearDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearDeviceDesiredPropertyResponseBody self = new ClearDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearDeviceDesiredPropertyResponseBody setData(ClearDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClearDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public ClearDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ClearDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClearDeviceDesiredPropertyResponseBodyData extends TeaModel {
        @NameInMap("Versions")
        public String versions;

        public static ClearDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClearDeviceDesiredPropertyResponseBodyData self = new ClearDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClearDeviceDesiredPropertyResponseBodyData setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

    }

}
