// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateOTAFirmwareResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAFirmwareResponseBody self = new CreateOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAFirmwareResponseBody setData(CreateOTAFirmwareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOTAFirmwareResponseBodyData getData() {
        return this.data;
    }

    public CreateOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOTAFirmwareResponseBodyData extends TeaModel {
        @NameInMap("FirmwareId")
        public String firmwareId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateOTAFirmwareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAFirmwareResponseBodyData self = new CreateOTAFirmwareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOTAFirmwareResponseBodyData setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public CreateOTAFirmwareResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
