// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipMonitorDatas")
    @Validation(required = true)
    public DescribeNewProjectEipMonitorDataResponseEipMonitorDatas eipMonitorDatas;

    public static DescribeNewProjectEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataResponse self = new DescribeNewProjectEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewProjectEipMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNewProjectEipMonitorDataResponse setEipMonitorDatas(DescribeNewProjectEipMonitorDataResponseEipMonitorDatas eipMonitorDatas) {
        this.eipMonitorDatas = eipMonitorDatas;
        return this;
    }
    public DescribeNewProjectEipMonitorDataResponseEipMonitorDatas getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    public static class DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData extends TeaModel {
        @NameInMap("EipRX")
        @Validation(required = true)
        public Integer eipRX;

        @NameInMap("EipTX")
        @Validation(required = true)
        public Integer eipTX;

        @NameInMap("EipFlow")
        @Validation(required = true)
        public Integer eipFlow;

        @NameInMap("EipBandwidth")
        @Validation(required = true)
        public Integer eipBandwidth;

        @NameInMap("EipPackets")
        @Validation(required = true)
        public Integer eipPackets;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData self = new DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipRX(Integer eipRX) {
            this.eipRX = eipRX;
            return this;
        }
        public Integer getEipRX() {
            return this.eipRX;
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipTX(Integer eipTX) {
            this.eipTX = eipTX;
            return this;
        }
        public Integer getEipTX() {
            return this.eipTX;
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipFlow(Integer eipFlow) {
            this.eipFlow = eipFlow;
            return this;
        }
        public Integer getEipFlow() {
            return this.eipFlow;
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setEipPackets(Integer eipPackets) {
            this.eipPackets = eipPackets;
            return this;
        }
        public Integer getEipPackets() {
            return this.eipPackets;
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeNewProjectEipMonitorDataResponseEipMonitorDatas extends TeaModel {
        @NameInMap("EipMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData;

        public static DescribeNewProjectEipMonitorDataResponseEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewProjectEipMonitorDataResponseEipMonitorDatas self = new DescribeNewProjectEipMonitorDataResponseEipMonitorDatas();
            return TeaModel.build(map, self);
        }

        public DescribeNewProjectEipMonitorDataResponseEipMonitorDatas setEipMonitorData(java.util.List<DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData) {
            this.eipMonitorData = eipMonitorData;
            return this;
        }
        public java.util.List<DescribeNewProjectEipMonitorDataResponseEipMonitorDatasEipMonitorData> getEipMonitorData() {
            return this.eipMonitorData;
        }

    }

}
