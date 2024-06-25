// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterCheckEnabledOnDefaultBusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EventCenterCheckEnabledOnDefaultBusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Unknown system error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>382E6272-8E9C-5681-AC96-XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EventCenterCheckEnabledOnDefaultBusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EventCenterCheckEnabledOnDefaultBusResponseBody self = new EventCenterCheckEnabledOnDefaultBusResponseBody();
        return TeaModel.build(map, self);
    }

    public EventCenterCheckEnabledOnDefaultBusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EventCenterCheckEnabledOnDefaultBusResponseBody setData(EventCenterCheckEnabledOnDefaultBusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EventCenterCheckEnabledOnDefaultBusResponseBodyData getData() {
        return this.data;
    }

    public EventCenterCheckEnabledOnDefaultBusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EventCenterCheckEnabledOnDefaultBusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EventCenterCheckEnabledOnDefaultBusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EventCenterCheckEnabledOnDefaultBusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static EventCenterCheckEnabledOnDefaultBusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EventCenterCheckEnabledOnDefaultBusResponseBodyData self = new EventCenterCheckEnabledOnDefaultBusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EventCenterCheckEnabledOnDefaultBusResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
