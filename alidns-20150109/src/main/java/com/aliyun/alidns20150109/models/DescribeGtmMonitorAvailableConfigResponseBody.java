// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigResponseBody extends TeaModel {
    /**
     * <p>The monitored nodes.</p>
     */
    @NameInMap("IspCityNodes")
    public DescribeGtmMonitorAvailableConfigResponseBodyIspCityNodes ispCityNodes;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The code of the city where the monitored node is deployed.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The display name of the city where the monitored node is deployed.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>Indicates whether the monitored node is selected for the health check by default.</p>
         */
        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

        /**
         * <p>The name of the group to which the monitored node belongs.</p>
         * <br>
         * <p>Valid values: Overseas Nodes, BGP Nodes, and ISP Nodes.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group to which the monitored node belongs.</p>
         * <br>
         * <p>Valid values: BGP, OVERSEAS, and ISP.</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
         * <br>
         * <p>*   If the value of the GroupType parameter is BGP or OVERSEAS, the value of IspCode is 465 by default.</p>
         * <p>*   If the value of the GroupType parameter is not BGP or OVERSEAS, valid values of IspCode are 232, 132, and 5. and is used together with CityCode.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Indicates whether the monitored node is deployed in the Chinese mainland.</p>
         */
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
