// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv4IspCityNodes")
    @Validation(required = true)
    public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes ipv4IspCityNodes;

    @NameInMap("Ipv6IspCityNodes")
    @Validation(required = true)
    public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes ipv6IspCityNodes;

    @NameInMap("DomainIpv4IspCityNodes")
    @Validation(required = true)
    public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes domainIpv4IspCityNodes;

    @NameInMap("DomainIpv6IspCityNodes")
    @Validation(required = true)
    public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes domainIpv6IspCityNodes;

    public static DescribeDnsGtmMonitorAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigResponse self = new DescribeDnsGtmMonitorAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes ipv4IspCityNodes) {
        this.ipv4IspCityNodes = ipv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes ipv6IspCityNodes) {
        this.ipv6IspCityNodes = ipv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setDomainIpv4IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes domainIpv4IspCityNodes) {
        this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes getDomainIpv4IspCityNodes() {
        return this.domainIpv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setDomainIpv6IspCityNodes(DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes domainIpv6IspCityNodes) {
        this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes getDomainIpv6IspCityNodes() {
        return this.domainIpv6IspCityNodes;
    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode extends TeaModel {
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

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes extends TeaModel {
        @NameInMap("Ipv4IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodes setIpv4IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode> ipv4IspCityNode) {
            this.ipv4IspCityNode = ipv4IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv4IspCityNodesIpv4IspCityNode> getIpv4IspCityNode() {
            return this.ipv4IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode extends TeaModel {
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

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes extends TeaModel {
        @NameInMap("Ipv6IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodes setIpv6IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode> ipv6IspCityNode) {
            this.ipv6IspCityNode = ipv6IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseIpv6IspCityNodesIpv6IspCityNode> getIpv6IspCityNode() {
            return this.ipv6IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode extends TeaModel {
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

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv4IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode> domainIpv4IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodes setDomainIpv4IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode> domainIpv4IspCityNode) {
            this.domainIpv4IspCityNode = domainIpv4IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv4IspCityNodesDomainIpv4IspCityNode> getDomainIpv4IspCityNode() {
            return this.domainIpv4IspCityNode;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode extends TeaModel {
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

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode self = new DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv6IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode> domainIpv6IspCityNode;

        public static DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodes setDomainIpv6IspCityNode(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode> domainIpv6IspCityNode) {
            this.domainIpv6IspCityNode = domainIpv6IspCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseDomainIpv6IspCityNodesDomainIpv6IspCityNode> getDomainIpv6IspCityNode() {
            return this.domainIpv6IspCityNode;
        }

    }

}
