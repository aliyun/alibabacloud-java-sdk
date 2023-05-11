// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The OTA update package information that is returned if the call is successful. For more information, see the "**Data**" section of this topic.</p>
     */
    @NameInMap("Data")
    public CreateOTAFirmwareResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful. The value indicates that the OTA update package was created.</p>
     * <p>*   **false**: The call failed. The value indicates that the system failed to create the OTA update package.</p>
     */
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
        /**
         * <p>The ID of the OTA update package. The ID is a unique identifier issued by IoT Platform to the OTA update package.</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The time when the OTA update package was created. The time is displayed in UTC.</p>
         */
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
