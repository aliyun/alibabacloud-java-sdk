// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateOTAFirmwareResponseData data;

    public static CreateOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAFirmwareResponse self = new CreateOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAFirmwareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAFirmwareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOTAFirmwareResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAFirmwareResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAFirmwareResponse setData(CreateOTAFirmwareResponseData data) {
        this.data = data;
        return this;
    }
    public CreateOTAFirmwareResponseData getData() {
        return this.data;
    }

    public static class CreateOTAFirmwareResponseData extends TeaModel {
        @NameInMap("FirmwareId")
        @Validation(required = true)
        public String firmwareId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        public static CreateOTAFirmwareResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAFirmwareResponseData self = new CreateOTAFirmwareResponseData();
            return TeaModel.build(map, self);
        }

        public CreateOTAFirmwareResponseData setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public CreateOTAFirmwareResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
