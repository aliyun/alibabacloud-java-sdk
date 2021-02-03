// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @NameInMap("Ipv4IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes ipv4IspCityNodes;

    @NameInMap("DomainIpv4IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes domainIpv4IspCityNodes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainIpv6IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes domainIpv6IspCityNodes;

    @NameInMap("Ipv6IspCityNodes")
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes ipv6IspCityNodes;

    public static DescribeDnsGtmMonitorAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigResponseBody self = new DescribeDnsGtmMonitorAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes ipv4IspCityNodes) {
        this.ipv4IspCityNodes = ipv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes domainIpv4IspCityNodes) {
        this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes getDomainIpv4IspCityNodes() {
        return this.domainIpv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes domainIpv6IspCityNodes) {
        this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes getDomainIpv6IspCityNodes() {
        return this.domainIpv6IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes ipv6IspCityNodes) {
        this.ipv6IspCityNodes = ipv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

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

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodesIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
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

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

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

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodesDomainIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
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

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

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

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodesDomainIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
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

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

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

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodesIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
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
