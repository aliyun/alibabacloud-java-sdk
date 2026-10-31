// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateScheduleMonitorResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring creation result.</p>
     */
    @NameInMap("Data")
    public CreateScheduleMonitorResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateScheduleMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleMonitorResponseBody self = new CreateScheduleMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScheduleMonitorResponseBody setData(CreateScheduleMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateScheduleMonitorResponseBodyData getData() {
        return this.data;
    }

    public CreateScheduleMonitorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateScheduleMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScheduleMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateScheduleMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the created monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>6912345678901234</p>
         */
        @NameInMap("MonitoredItemId")
        public Long monitoredItemId;

        public static CreateScheduleMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleMonitorResponseBodyData self = new CreateScheduleMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateScheduleMonitorResponseBodyData setMonitoredItemId(Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

    }

}
