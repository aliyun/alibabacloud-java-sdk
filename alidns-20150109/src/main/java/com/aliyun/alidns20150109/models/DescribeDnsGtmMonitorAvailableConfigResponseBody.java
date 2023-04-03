// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigResponseBody extends TeaModel {
    /**
     * <p>The monitored nodes that can be used to perform health checks on address pools that contain public domain names that are resolved to IPv4 addresses.</p>
     */
    @NameInMap("DomainIpv4IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes domainIpv4IspCityNodes;

    /**
     * <p>The monitored nodes that can be used to perform health checks on address pools that contain public domain names that are resolved to IPv6 addresses.</p>
     */
    @NameInMap("DomainIpv6IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes domainIpv6IspCityNodes;

    /**
     * <p>The monitored nodes that can be used to perform health checks on address pools that contain public IPv4 addresses.</p>
     */
    @NameInMap("Ipv4IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes ipv4IspCityNodes;

    /**
     * <p>The monitored nodes that can be used to perform health checks on address pools that contain public IPv6 addresses.</p>
     */
    @NameInMap("Ipv6IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes ipv6IspCityNodes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDnsGtmMonitorAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigResponseBody self = new DescribeDnsGtmMonitorAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes domainIpv4IspCityNodes) {
        this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes getDomainIpv4IspCityNodes() {
        return this.domainIpv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes domainIpv6IspCityNodes) {
        this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes getDomainIpv6IspCityNodes() {
        return this.domainIpv6IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes ipv4IspCityNodes) {
        this.ipv4IspCityNodes = ipv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes ipv6IspCityNodes) {
        this.ipv6IspCityNodes = ipv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode extends TeaModel {
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
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group to which the monitored node belongs. Valid values:</p>
         * <br>
         * <p>*   BGP: BGP nodes</p>
         * <p>*   OVERSEAS: nodes outside the Chinese mainland</p>
         * <p>*   ISP: ISP nodes</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Ips")
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps ips;

        /**
         * <p>The code of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setIps(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNodeIps getIps() {
            return this.ips;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv4IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode> domainIpv4IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setDomainIpv4IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode> domainIpv4IspCityNode) {
            this.domainIpv4IspCityNode = domainIpv4IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode> getDomainIpv4IspCityNode() {
            return this.domainIpv4IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps extends TeaModel {
        @NameInMap("ip")
        public java.util.List<String> ip;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode extends TeaModel {
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
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group to which the monitored node belongs. Valid values:</p>
         * <br>
         * <p>*   BGP: BGP nodes</p>
         * <p>*   OVERSEAS: nodes outside the Chinese mainland</p>
         * <p>*   ISP: ISP nodes</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Ips")
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps ips;

        /**
         * <p>The code of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setIps(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNodeIps getIps() {
            return this.ips;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv6IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode> domainIpv6IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setDomainIpv6IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode> domainIpv6IspCityNode) {
            this.domainIpv6IspCityNode = domainIpv6IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode> getDomainIpv6IspCityNode() {
            return this.domainIpv6IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode extends TeaModel {
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
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group to which the monitored node belongs. Valid values:</p>
         * <br>
         * <p>*   BGP: Border Gateway Protocol (BGP) nodes</p>
         * <p>*   OVERSEAS: nodes outside the Chinese mainland</p>
         * <p>*   ISP: ISP nodes</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Ips")
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps ips;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setIps(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps getIps() {
            return this.ips;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes extends TeaModel {
        @NameInMap("Ipv4IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setIpv4IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode) {
            this.ipv4IspCityNode = ipv4IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode> getIpv4IspCityNode() {
            return this.ipv4IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode extends TeaModel {
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
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group to which the monitored node belongs. Valid values:</p>
         * <br>
         * <p>*   BGP: BGP nodes</p>
         * <p>*   OVERSEAS: nodes outside the Chinese mainland</p>
         * <p>*   ISP: ISP nodes</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Ips")
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps ips;

        /**
         * <p>The code of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setIps(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps getIps() {
            return this.ips;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes extends TeaModel {
        @NameInMap("Ipv6IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setIpv6IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode) {
            this.ipv6IspCityNode = ipv6IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode> getIpv6IspCityNode() {
            return this.ipv6IspCityNode;
        }

    }

}
