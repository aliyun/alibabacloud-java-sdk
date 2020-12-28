// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EipMonitorDatas")
    public java.util.List<DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas> eipMonitorDatas;

    public static DescribeNewProjectEipMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataResponseBody self = new DescribeNewProjectEipMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNewProjectEipMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNewProjectEipMonitorDataResponseBody setEipMonitorDatas(java.util.List<DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas> eipMonitorDatas) {
        this.eipMonitorDatas = eipMonitorDatas;
        return this;
    }
    public java.util.List<DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas> getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    public static class DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas extends TeaModel {
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

        public static DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas self = new DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setEipTX(Integer eipTX) {
            this.eipTX = eipTX;
            return this;
        }
        public Integer getEipTX() {
            return this.eipTX;
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setEipPackets(Integer eipPackets) {
            this.eipPackets = eipPackets;
            return this;
        }
        public Integer getEipPackets() {
            return this.eipPackets;
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setEipFlow(Integer eipFlow) {
            this.eipFlow = eipFlow;
            return this;
        }
        public Integer getEipFlow() {
            return this.eipFlow;
        }

        public DescribeNewProjectEipMonitorDataResponseBodyEipMonitorDatas setEipRX(Integer eipRX) {
            this.eipRX = eipRX;
            return this;
        }
        public Integer getEipRX() {
            return this.eipRX;
        }

    }

}
