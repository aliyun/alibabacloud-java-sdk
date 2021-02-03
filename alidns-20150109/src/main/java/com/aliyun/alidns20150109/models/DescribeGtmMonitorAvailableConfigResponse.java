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

    public DescribeGtmMonitorAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmMonitorAvailableConfigResponse setIspCityNodes(DescribeGtmMonitorAvailableConfigResponseIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeGtmMonitorAvailableConfigResponseIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
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

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setMainland(Boolean mainland) {
            this.mainland = mainland;
            return this;
        }
        public Boolean getMainland() {
            return this.mainland;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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

        public DescribeGtmMonitorAvailableConfigResponseIspCityNodes setIspCityNode(java.util.List<DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeGtmMonitorAvailableConfigResponseIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
