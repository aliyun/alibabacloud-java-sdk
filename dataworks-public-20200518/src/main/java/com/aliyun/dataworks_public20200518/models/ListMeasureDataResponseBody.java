// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMeasureDataResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>100001001</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The user is not in tenant.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The measurement results.</p>
     */
    @NameInMap("MeasureDatas")
    public java.util.List<ListMeasureDataResponseBodyMeasureDatas> measureDatas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMeasureDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMeasureDataResponseBody self = new ListMeasureDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMeasureDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMeasureDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMeasureDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMeasureDataResponseBody setMeasureDatas(java.util.List<ListMeasureDataResponseBodyMeasureDatas> measureDatas) {
        this.measureDatas = measureDatas;
        return this;
    }
    public java.util.List<ListMeasureDataResponseBodyMeasureDatas> getMeasureDatas() {
        return this.measureDatas;
    }

    public ListMeasureDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMeasureDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMeasureDataResponseBodyMeasureDatas extends TeaModel {
        /**
         * <p>The measurement component.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The item that is measured.</p>
         * 
         * <strong>example:</strong>
         * <p>DideAlarmPhone</p>
         */
        @NameInMap("DomainCode")
        public String domainCode;

        /**
         * <p>The end timestamp of the measurement period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start timestamp of the measurement period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717344000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The total quantity used within the measurement period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static ListMeasureDataResponseBodyMeasureDatas build(java.util.Map<String, ?> map) throws Exception {
            ListMeasureDataResponseBodyMeasureDatas self = new ListMeasureDataResponseBodyMeasureDatas();
            return TeaModel.build(map, self);
        }

        public ListMeasureDataResponseBodyMeasureDatas setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public ListMeasureDataResponseBodyMeasureDatas setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public ListMeasureDataResponseBodyMeasureDatas setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListMeasureDataResponseBodyMeasureDatas setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListMeasureDataResponseBodyMeasureDatas setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

}
