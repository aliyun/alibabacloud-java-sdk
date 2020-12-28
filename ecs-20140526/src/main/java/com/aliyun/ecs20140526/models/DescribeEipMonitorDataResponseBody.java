// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EipMonitorDatas")
    public java.util.List<DescribeEipMonitorDataResponseBodyEipMonitorDatas> eipMonitorDatas;

    public static DescribeEipMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataResponseBody self = new DescribeEipMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipMonitorDataResponseBody setEipMonitorDatas(java.util.List<DescribeEipMonitorDataResponseBodyEipMonitorDatas> eipMonitorDatas) {
        this.eipMonitorDatas = eipMonitorDatas;
        return this;
    }
    public java.util.List<DescribeEipMonitorDataResponseBodyEipMonitorDatas> getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    public static class DescribeEipMonitorDataResponseBodyEipMonitorDatas extends TeaModel {
        @NameInMap("EipTX")
        public Integer eipTX;

        @NameInMap("EipPackets")
        public Integer eipPackets;

        @NameInMap("EipBandwidth")
        public Integer eipBandwidth;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("EipFlow")
        public Integer eipFlow;

        @NameInMap("EipRX")
        public Integer eipRX;

        public static DescribeEipMonitorDataResponseBodyEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipMonitorDataResponseBodyEipMonitorDatas self = new DescribeEipMonitorDataResponseBodyEipMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setEipTX(Integer eipTX) {
            this.eipTX = eipTX;
            return this;
        }
        public Integer getEipTX() {
            return this.eipTX;
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setEipPackets(Integer eipPackets) {
            this.eipPackets = eipPackets;
            return this;
        }
        public Integer getEipPackets() {
            return this.eipPackets;
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setEipFlow(Integer eipFlow) {
            this.eipFlow = eipFlow;
            return this;
        }
        public Integer getEipFlow() {
            return this.eipFlow;
        }

        public DescribeEipMonitorDataResponseBodyEipMonitorDatas setEipRX(Integer eipRX) {
            this.eipRX = eipRX;
            return this;
        }
        public Integer getEipRX() {
            return this.eipRX;
        }

    }

}
