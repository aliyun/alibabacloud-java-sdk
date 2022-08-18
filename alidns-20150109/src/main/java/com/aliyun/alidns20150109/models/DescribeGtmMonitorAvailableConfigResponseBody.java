// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @NameInMap("IspCityNodes")
    public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes ispCityNodes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGtmMonitorAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorAvailableConfigResponseBody self = new DescribeGtmMonitorAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorAvailableConfigResponseBody setIspCityNodes(DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeGtmMonitorAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("Mainland")
        public Boolean mainland;

        public static DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode self = new DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode setMainland(Boolean mainland) {
            this.mainland = mainland;
            return this;
        }
        public Boolean getMainland() {
            return this.mainland;
        }

    }

    public static class DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes self = new DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
