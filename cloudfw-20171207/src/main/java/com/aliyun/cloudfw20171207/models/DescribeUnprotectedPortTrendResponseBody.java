// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedPortTrendResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeUnprotectedPortTrendResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>E599A84E-CD22-5E42-A2A9-01A254AC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUnprotectedPortTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedPortTrendResponseBody self = new DescribeUnprotectedPortTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedPortTrendResponseBody setDataList(java.util.List<DescribeUnprotectedPortTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeUnprotectedPortTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeUnprotectedPortTrendResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeUnprotectedPortTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUnprotectedPortTrendResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeUnprotectedPortTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnprotectedPortTrendResponseBodyDataList self = new DescribeUnprotectedPortTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeUnprotectedPortTrendResponseBodyDataList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeUnprotectedPortTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
