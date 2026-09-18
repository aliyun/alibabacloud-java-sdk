// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumComputeMetricsByRecordResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<SumComputeMetricsByRecordResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational. The server has received the request and is processing it.</p>
     * </li>
     * <li><p>2xx: Success. The server successfully received, understood, and accepted the request.</p>
     * </li>
     * <li><p>3xx: Redirection. The client must take further action to complete the request.</p>
     * </li>
     * <li><p>4xx: Client-side error. The request contains invalid syntax or parameters and cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server-side error. The server failed to fulfill a valid request.</p>
     * </li>
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
     * <p>0a06dfe517540143853845404e83af</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SumComputeMetricsByRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SumComputeMetricsByRecordResponseBody self = new SumComputeMetricsByRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public SumComputeMetricsByRecordResponseBody setData(java.util.List<SumComputeMetricsByRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SumComputeMetricsByRecordResponseBodyData> getData() {
        return this.data;
    }

    public SumComputeMetricsByRecordResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public SumComputeMetricsByRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords extends TeaModel {
        /**
         * <p>The statistics date. The format is yyyyMMdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20260411</p>
         */
        @NameInMap("dateTime")
        public String dateTime;

        /**
         * <p>This day\&quot;s usage as a percentage of the total usage for the specified period. The value does not include a percent sign (%).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("percentage")
        public Double percentage;

        /**
         * <p>The record count.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("record")
        public String record;

        public static SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords build(java.util.Map<String, ?> map) throws Exception {
            SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords self = new SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords();
            return TeaModel.build(map, self);
        }

        public SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords setPercentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Double getPercentage() {
            return this.percentage;
        }

        public SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

    }

    public static class SumComputeMetricsByRecordResponseBodyData extends TeaModel {
        /**
         * <p>A list of daily usage records.</p>
         */
        @NameInMap("dailyComputeRecords")
        public java.util.List<SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords> dailyComputeRecords;

        /**
         * <p>The usage type. For example: ComputationSql</p>
         * 
         * <strong>example:</strong>
         * <p>ComputationSql</p>
         */
        @NameInMap("type")
        public String type;

        public static SumComputeMetricsByRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SumComputeMetricsByRecordResponseBodyData self = new SumComputeMetricsByRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SumComputeMetricsByRecordResponseBodyData setDailyComputeRecords(java.util.List<SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords> dailyComputeRecords) {
            this.dailyComputeRecords = dailyComputeRecords;
            return this;
        }
        public java.util.List<SumComputeMetricsByRecordResponseBodyDataDailyComputeRecords> getDailyComputeRecords() {
            return this.dailyComputeRecords;
        }

        public SumComputeMetricsByRecordResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
