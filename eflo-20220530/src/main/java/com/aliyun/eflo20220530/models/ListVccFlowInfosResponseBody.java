// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccFlowInfosResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public ListVccFlowInfosResponseBodyContent content;

    /**
     * <p>Response</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>BDBCC783-84CA-5733-8EEA-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVccFlowInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccFlowInfosResponseBody self = new ListVccFlowInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVccFlowInfosResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVccFlowInfosResponseBody setContent(ListVccFlowInfosResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVccFlowInfosResponseBodyContent getContent() {
        return this.content;
    }

    public ListVccFlowInfosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVccFlowInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVccFlowInfosResponseBodyContentData extends TeaModel {
        /**
         * <p>The direction.</p>
         * 
         * <strong>example:</strong>
         * <p>OUT</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The metric. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>passBytesRate</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Time</p>
         * 
         * <strong>example:</strong>
         * <p>1689749749000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public Double value;

        /**
         * <p>Lingjun Connection ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w******</p>
         */
        @NameInMap("VccId")
        public String vccId;

        public static ListVccFlowInfosResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVccFlowInfosResponseBodyContentData self = new ListVccFlowInfosResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVccFlowInfosResponseBodyContentData setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListVccFlowInfosResponseBodyContentData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListVccFlowInfosResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccFlowInfosResponseBodyContentData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListVccFlowInfosResponseBodyContentData setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

        public ListVccFlowInfosResponseBodyContentData setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

    }

    public static class ListVccFlowInfosResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun Connection Traffic Information</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVccFlowInfosResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVccFlowInfosResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVccFlowInfosResponseBodyContent self = new ListVccFlowInfosResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVccFlowInfosResponseBodyContent setData(java.util.List<ListVccFlowInfosResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVccFlowInfosResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVccFlowInfosResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
