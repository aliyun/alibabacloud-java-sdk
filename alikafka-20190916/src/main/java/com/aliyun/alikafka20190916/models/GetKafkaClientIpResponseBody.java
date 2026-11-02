// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetKafkaClientIpResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetKafkaClientIpResponseBodyData data;

    /**
     * <p>The message returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E57A8862-DF68-4055-8E55-B80CB4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKafkaClientIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKafkaClientIpResponseBody self = new GetKafkaClientIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKafkaClientIpResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetKafkaClientIpResponseBody setData(GetKafkaClientIpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKafkaClientIpResponseBodyData getData() {
        return this.data;
    }

    public GetKafkaClientIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKafkaClientIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKafkaClientIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKafkaClientIpResponseBodyDataDataDataDataData extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Num")
        public Long num;

        public static GetKafkaClientIpResponseBodyDataDataDataDataData build(java.util.Map<String, ?> map) throws Exception {
            GetKafkaClientIpResponseBodyDataDataDataDataData self = new GetKafkaClientIpResponseBodyDataDataDataDataData();
            return TeaModel.build(map, self);
        }

        public GetKafkaClientIpResponseBodyDataDataDataDataData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetKafkaClientIpResponseBodyDataDataDataDataData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class GetKafkaClientIpResponseBodyDataDataDataData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<GetKafkaClientIpResponseBodyDataDataDataDataData> data;

        public static GetKafkaClientIpResponseBodyDataDataDataData build(java.util.Map<String, ?> map) throws Exception {
            GetKafkaClientIpResponseBodyDataDataDataData self = new GetKafkaClientIpResponseBodyDataDataDataData();
            return TeaModel.build(map, self);
        }

        public GetKafkaClientIpResponseBodyDataDataDataData setData(java.util.List<GetKafkaClientIpResponseBodyDataDataDataDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetKafkaClientIpResponseBodyDataDataDataDataData> getData() {
            return this.data;
        }

    }

    public static class GetKafkaClientIpResponseBodyDataDataData extends TeaModel {
        @NameInMap("Data")
        public GetKafkaClientIpResponseBodyDataDataDataData data;

        @NameInMap("Name")
        public String name;

        public static GetKafkaClientIpResponseBodyDataDataData build(java.util.Map<String, ?> map) throws Exception {
            GetKafkaClientIpResponseBodyDataDataData self = new GetKafkaClientIpResponseBodyDataDataData();
            return TeaModel.build(map, self);
        }

        public GetKafkaClientIpResponseBodyDataDataData setData(GetKafkaClientIpResponseBodyDataDataDataData data) {
            this.data = data;
            return this;
        }
        public GetKafkaClientIpResponseBodyDataDataDataData getData() {
            return this.data;
        }

        public GetKafkaClientIpResponseBodyDataDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetKafkaClientIpResponseBodyDataData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<GetKafkaClientIpResponseBodyDataDataData> data;

        public static GetKafkaClientIpResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            GetKafkaClientIpResponseBodyDataData self = new GetKafkaClientIpResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public GetKafkaClientIpResponseBodyDataData setData(java.util.List<GetKafkaClientIpResponseBodyDataDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetKafkaClientIpResponseBodyDataDataData> getData() {
            return this.data;
        }

    }

    public static class GetKafkaClientIpResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the minor version is not the latest version. A value of true indicates that the minor version is not the latest.</p>
         * <blockquote>
         * <p>If the minor version of your server is not the latest, the sampled logs may not be accurate enough, which ultimately leads to inaccurate collected IP information. Therefore, upgrade the minor version of your server as soon as possible.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Alert")
        public Boolean alert;

        @NameInMap("Data")
        public GetKafkaClientIpResponseBodyDataData data;

        /**
         * <p>The end time of the query result. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1716343502000</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The time range for querying client IP addresses.</p>
         * <blockquote>
         * <p>The time range is 1 hour. If the specified start time and end time span more than 1 hour, only the data within 1 hour is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SearchTimeRange")
        public Integer searchTimeRange;

        /**
         * <p>The start time of the query result. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1716343501000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        /**
         * <p>The maximum time range for querying client IP addresses, in days. The current limit is 7 days. If the interval between the start time and the end time exceeds 7 days, only the data within 7 days is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TimeLimitDay")
        public Integer timeLimitDay;

        public static GetKafkaClientIpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKafkaClientIpResponseBodyData self = new GetKafkaClientIpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKafkaClientIpResponseBodyData setAlert(Boolean alert) {
            this.alert = alert;
            return this;
        }
        public Boolean getAlert() {
            return this.alert;
        }

        public GetKafkaClientIpResponseBodyData setData(GetKafkaClientIpResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public GetKafkaClientIpResponseBodyDataData getData() {
            return this.data;
        }

        public GetKafkaClientIpResponseBodyData setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public GetKafkaClientIpResponseBodyData setSearchTimeRange(Integer searchTimeRange) {
            this.searchTimeRange = searchTimeRange;
            return this;
        }
        public Integer getSearchTimeRange() {
            return this.searchTimeRange;
        }

        public GetKafkaClientIpResponseBodyData setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public GetKafkaClientIpResponseBodyData setTimeLimitDay(Integer timeLimitDay) {
            this.timeLimitDay = timeLimitDay;
            return this;
        }
        public Integer getTimeLimitDay() {
            return this.timeLimitDay;
        }

    }

}
