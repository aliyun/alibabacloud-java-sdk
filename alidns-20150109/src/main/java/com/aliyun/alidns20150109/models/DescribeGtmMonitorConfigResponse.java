// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    @Validation(required = true)
    public Long updateTimestamp;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("EvaluationCount")
    @Validation(required = true)
    public Integer evaluationCount;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    public String monitorExtendInfo;

    @NameInMap("IspCityNodes")
    @Validation(required = true)
    public DescribeGtmMonitorConfigResponseIspCityNodes ispCityNodes;

    public static DescribeGtmMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigResponse self = new DescribeGtmMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CountryName")
        @Validation(required = true)
        public String countryName;

        @NameInMap("CountryCode")
        @Validation(required = true)
        public String countryCode;

        @NameInMap("CityName")
        @Validation(required = true)
        public String cityName;

        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("IspCode")
        @Validation(required = true)
        public String ispCode;

        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        public static DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode self = new DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmMonitorConfigResponseIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode> ispCityNode;

        public static DescribeGtmMonitorConfigResponseIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseIspCityNodes self = new DescribeGtmMonitorConfigResponseIspCityNodes();
            return TeaModel.build(map, self);
        }

    }

}
