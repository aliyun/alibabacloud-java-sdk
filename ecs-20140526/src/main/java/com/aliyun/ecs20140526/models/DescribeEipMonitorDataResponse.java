// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipMonitorDatas")
    @Validation(required = true)
    public DescribeEipMonitorDataResponseEipMonitorDatas eipMonitorDatas;

    public static DescribeEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataResponse self = new DescribeEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData extends TeaModel {
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

        public static DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData self = new DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipMonitorDataResponseEipMonitorDatas extends TeaModel {
        @NameInMap("EipMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeEipMonitorDataResponseEipMonitorDatasEipMonitorData> eipMonitorData;

        public static DescribeEipMonitorDataResponseEipMonitorDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipMonitorDataResponseEipMonitorDatas self = new DescribeEipMonitorDataResponseEipMonitorDatas();
            return TeaModel.build(map, self);
        }

    }

}
