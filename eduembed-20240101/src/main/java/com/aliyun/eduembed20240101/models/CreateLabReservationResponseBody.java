// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabReservationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LabReservation")
    public CreateLabReservationResponseBodyLabReservation labReservation;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9ADC729B-...</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateLabReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabReservationResponseBody self = new CreateLabReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabReservationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLabReservationResponseBody setLabReservation(CreateLabReservationResponseBodyLabReservation labReservation) {
        this.labReservation = labReservation;
        return this;
    }
    public CreateLabReservationResponseBodyLabReservation getLabReservation() {
        return this.labReservation;
    }

    public CreateLabReservationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLabReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLabReservationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLabReservationResponseBodyLabReservation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10dbb36c-7047-41c7-92ee-bd24bcf45dca</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateLabReservationResponseBodyLabReservation build(java.util.Map<String, ?> map) throws Exception {
            CreateLabReservationResponseBodyLabReservation self = new CreateLabReservationResponseBodyLabReservation();
            return TeaModel.build(map, self);
        }

        public CreateLabReservationResponseBodyLabReservation setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
