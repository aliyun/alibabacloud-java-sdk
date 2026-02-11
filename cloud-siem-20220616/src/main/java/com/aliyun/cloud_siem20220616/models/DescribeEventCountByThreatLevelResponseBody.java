// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventCountByThreatLevelResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeEventCountByThreatLevelResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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

    public static DescribeEventCountByThreatLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventCountByThreatLevelResponseBody self = new DescribeEventCountByThreatLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventCountByThreatLevelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEventCountByThreatLevelResponseBody setData(DescribeEventCountByThreatLevelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEventCountByThreatLevelResponseBodyData getData() {
        return this.data;
    }

    public DescribeEventCountByThreatLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventCountByThreatLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventCountByThreatLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("EventNum")
        public Long eventNum;

        @NameInMap("UndealEventNum")
        public Long undealEventNum;

        public static DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum self = new DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum();
            return TeaModel.build(map, self);
        }

        public DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum setEventNum(Long eventNum) {
            this.eventNum = eventNum;
            return this;
        }
        public Long getEventNum() {
            return this.eventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum setUndealEventNum(Long undealEventNum) {
            this.undealEventNum = undealEventNum;
            return this;
        }
        public Long getUndealEventNum() {
            return this.undealEventNum;
        }

    }

    public static class DescribeEventCountByThreatLevelResponseBodyData extends TeaModel {
        @NameInMap("EventDailyNum")
        public java.util.List<DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum> eventDailyNum;

        /**
         * <p>The total number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EventNum")
        public Long eventNum;

        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HighLevelEventNum")
        public Long highLevelEventNum;

        @NameInMap("InfoLevelEventNum")
        public Long infoLevelEventNum;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("LowLevelEventNum")
        public Long lowLevelEventNum;

        /**
         * <p>The number of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MediumLevelEventNum")
        public Long mediumLevelEventNum;

        @NameInMap("SeriousLevelEventNum")
        public Long seriousLevelEventNum;

        /**
         * <p>The number of unhandled events.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("UndealEventNum")
        public Long undealEventNum;

        public static DescribeEventCountByThreatLevelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventCountByThreatLevelResponseBodyData self = new DescribeEventCountByThreatLevelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEventCountByThreatLevelResponseBodyData setEventDailyNum(java.util.List<DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum> eventDailyNum) {
            this.eventDailyNum = eventDailyNum;
            return this;
        }
        public java.util.List<DescribeEventCountByThreatLevelResponseBodyDataEventDailyNum> getEventDailyNum() {
            return this.eventDailyNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setEventNum(Long eventNum) {
            this.eventNum = eventNum;
            return this;
        }
        public Long getEventNum() {
            return this.eventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setHighLevelEventNum(Long highLevelEventNum) {
            this.highLevelEventNum = highLevelEventNum;
            return this;
        }
        public Long getHighLevelEventNum() {
            return this.highLevelEventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setInfoLevelEventNum(Long infoLevelEventNum) {
            this.infoLevelEventNum = infoLevelEventNum;
            return this;
        }
        public Long getInfoLevelEventNum() {
            return this.infoLevelEventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setLowLevelEventNum(Long lowLevelEventNum) {
            this.lowLevelEventNum = lowLevelEventNum;
            return this;
        }
        public Long getLowLevelEventNum() {
            return this.lowLevelEventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setMediumLevelEventNum(Long mediumLevelEventNum) {
            this.mediumLevelEventNum = mediumLevelEventNum;
            return this;
        }
        public Long getMediumLevelEventNum() {
            return this.mediumLevelEventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setSeriousLevelEventNum(Long seriousLevelEventNum) {
            this.seriousLevelEventNum = seriousLevelEventNum;
            return this;
        }
        public Long getSeriousLevelEventNum() {
            return this.seriousLevelEventNum;
        }

        public DescribeEventCountByThreatLevelResponseBodyData setUndealEventNum(Long undealEventNum) {
            this.undealEventNum = undealEventNum;
            return this;
        }
        public Long getUndealEventNum() {
            return this.undealEventNum;
        }

    }

}
