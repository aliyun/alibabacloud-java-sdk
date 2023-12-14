// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventCountByThreatLevelResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeEventCountByThreatLevelResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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

    public static class DescribeEventCountByThreatLevelResponseBodyData extends TeaModel {
        /**
         * <p>The total number of events.</p>
         */
        @NameInMap("EventNum")
        public Long eventNum;

        /**
         * <p>The number of high-risk events.</p>
         */
        @NameInMap("HighLevelEventNum")
        public Long highLevelEventNum;

        /**
         * <p>The number of low-risk events.</p>
         */
        @NameInMap("LowLevelEventNum")
        public Long lowLevelEventNum;

        /**
         * <p>The number of medium-risk events.</p>
         */
        @NameInMap("MediumLevelEventNum")
        public Long mediumLevelEventNum;

        /**
         * <p>The number of unhandled events.</p>
         */
        @NameInMap("UndealEventNum")
        public Long undealEventNum;

        public static DescribeEventCountByThreatLevelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventCountByThreatLevelResponseBodyData self = new DescribeEventCountByThreatLevelResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeEventCountByThreatLevelResponseBodyData setUndealEventNum(Long undealEventNum) {
            this.undealEventNum = undealEventNum;
            return this;
        }
        public Long getUndealEventNum() {
            return this.undealEventNum;
        }

    }

}
