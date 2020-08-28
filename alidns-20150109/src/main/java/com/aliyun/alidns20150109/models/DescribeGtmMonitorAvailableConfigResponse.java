// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IspCityNodes")
    @Validation(required = true)
    public DescribeGtmMonitorAvailableConfigResponseIspCityNodes ispCityNodes;

    public static DescribeGtmMonitorAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorAvailableConfigResponse self = new DescribeGtmMonitorAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        @NameInMap("IspCode")
        @Validation(required = true)
        public String ispCode;

        @NameInMap("CityName")
        @Validation(required = true)
        public String cityName;

        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("DefaultSelected")
        @Validation(required = true)
        public Boolean defaultSelected;

        @NameInMap("Mainland")
        @Validation(required = true)
        public Boolean mainland;

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode self = new DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmMonitorAvailableConfigResponseIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode> ispCityNode;

        public static DescribeGtmMonitorAvailableConfigResponseIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorAvailableConfigResponseIspCityNodes self = new DescribeGtmMonitorAvailableConfigResponseIspCityNodes();
            return TeaModel.build(map, self);
        }

    }

}
