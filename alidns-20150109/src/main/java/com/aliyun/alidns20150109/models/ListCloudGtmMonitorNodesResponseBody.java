// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmMonitorNodesResponseBody extends TeaModel {
    /**
     * <p>Public IPv4 monitoring node list.</p>
     */
    @NameInMap("Ipv4IspCityNodes")
    public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes ipv4IspCityNodes;

    /**
     * <p>List of public IPv6 monitoring nodes.</p>
     */
    @NameInMap("Ipv6IspCityNodes")
    public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes ipv6IspCityNodes;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCloudGtmMonitorNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmMonitorNodesResponseBody self = new ListCloudGtmMonitorNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmMonitorNodesResponseBody setIpv4IspCityNodes(ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes ipv4IspCityNodes) {
        this.ipv4IspCityNodes = ipv4IspCityNodes;
        return this;
    }
    public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    public ListCloudGtmMonitorNodesResponseBody setIpv6IspCityNodes(ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes ipv6IspCityNodes) {
        this.ipv6IspCityNodes = ipv6IspCityNodes;
        return this;
    }
    public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    public ListCloudGtmMonitorNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps self = new ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode extends TeaModel {
        /**
         * <p>City code.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>City name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>Country code.</p>
         * 
         * <strong>example:</strong>
         * <p>629</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>Country name.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>Monitor node default selection:</p>
         * <ul>
         * <li>true: Selected by default</li>
         * <li>false: Not selected by default</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

        /**
         * <p>Monitor probe group name.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP Nodes</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Monitoring node group type, currently supported:</p>
         * <ul>
         * <li>BGP: BGP node</li>
         * <li>OVERSEAS: International node</li>
         * <li>ISP: Carrier node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>List of node IP addresses.</p>
         */
        @NameInMap("Ips")
        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps ips;

        /**
         * <p>Operator code.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>Operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Unique identifier ID of the probe node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-ewze1bysndy4gf**j8</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode self = new ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setIps(ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNodeIps getIps() {
            return this.ips;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes extends TeaModel {
        @NameInMap("Ipv4IspCityNode")
        public java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode;

        public static ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes self = new ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodes setIpv4IspCityNode(java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode) {
            this.ipv4IspCityNode = ipv4IspCityNode;
            return this;
        }
        public java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv4IspCityNodesIpv4IspCityNode> getIpv4IspCityNode() {
            return this.ipv4IspCityNode;
        }

    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps self = new ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode extends TeaModel {
        /**
         * <p>City code.</p>
         * 
         * <strong>example:</strong>
         * <p>357</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>City name.</p>
         * 
         * <strong>example:</strong>
         * <p>Shanghai</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>Country code.</p>
         * 
         * <strong>example:</strong>
         * <p>629</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>Country name.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>Monitor node default selection:</p>
         * <ul>
         * <li>true: Selected by default</li>
         * <li>false: Not selected by default</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

        /**
         * <p>Monitoring probe group name.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Monitoring node group type, currently supported:</p>
         * <ul>
         * <li>BGP: BGP node</li>
         * <li>OVERSEAS: International node</li>
         * <li>ISP: Carrier node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>List of node IP addresses.</p>
         */
        @NameInMap("Ips")
        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps ips;

        /**
         * <p>Operator code.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>Operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <p>Unique identifier ID of the probe node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-ewze1bysndy4gf**j8</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode self = new ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setIps(ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps ips) {
            this.ips = ips;
            return this;
        }
        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNodeIps getIps() {
            return this.ips;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes extends TeaModel {
        @NameInMap("Ipv6IspCityNode")
        public java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode;

        public static ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes self = new ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodes setIpv6IspCityNode(java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode) {
            this.ipv6IspCityNode = ipv6IspCityNode;
            return this;
        }
        public java.util.List<ListCloudGtmMonitorNodesResponseBodyIpv6IspCityNodesIpv6IspCityNode> getIpv6IspCityNode() {
            return this.ipv6IspCityNode;
        }

    }

}
