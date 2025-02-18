// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListTunnelQuotaTimerResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public java.util.List<ListTunnelQuotaTimerResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0b716671885050924814e3623</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListTunnelQuotaTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelQuotaTimerResponseBody self = new ListTunnelQuotaTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTunnelQuotaTimerResponseBody setData(java.util.List<ListTunnelQuotaTimerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTunnelQuotaTimerResponseBodyData> getData() {
        return this.data;
    }

    public ListTunnelQuotaTimerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTunnelQuotaTimerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListTunnelQuotaTimerResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListTunnelQuotaTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter extends TeaModel {
        /**
         * <p>The number of elastically reserved slots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("elasticReservedSlotNum")
        public Long elasticReservedSlotNum;

        /**
         * <p>The number of reserved slots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("slotNum")
        public Long slotNum;

        public static ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter self = new ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter();
            return TeaModel.build(map, self);
        }

        public ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter setElasticReservedSlotNum(Long elasticReservedSlotNum) {
            this.elasticReservedSlotNum = elasticReservedSlotNum;
            return this;
        }
        public Long getElasticReservedSlotNum() {
            return this.elasticReservedSlotNum;
        }

        public ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter setSlotNum(Long slotNum) {
            this.slotNum = slotNum;
            return this;
        }
        public Long getSlotNum() {
            return this.slotNum;
        }

    }

    public static class ListTunnelQuotaTimerResponseBodyData extends TeaModel {
        /**
         * <p>The start time of the time-specific configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>The end time of the time-specific configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The time zone property for the time-specific configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The parameters for the time-specific configuration.</p>
         */
        @NameInMap("tunnelQuotaParameter")
        public ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter tunnelQuotaParameter;

        public static ListTunnelQuotaTimerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTunnelQuotaTimerResponseBodyData self = new ListTunnelQuotaTimerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTunnelQuotaTimerResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListTunnelQuotaTimerResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTunnelQuotaTimerResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListTunnelQuotaTimerResponseBodyData setTunnelQuotaParameter(ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter tunnelQuotaParameter) {
            this.tunnelQuotaParameter = tunnelQuotaParameter;
            return this;
        }
        public ListTunnelQuotaTimerResponseBodyDataTunnelQuotaParameter getTunnelQuotaParameter() {
            return this.tunnelQuotaParameter;
        }

    }

}
