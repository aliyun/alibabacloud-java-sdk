// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @NameInMap("Ipv4IspCityNodes")
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes> ipv4IspCityNodes;

    @NameInMap("DomainIpv4IspCityNodes")
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes> domainIpv4IspCityNodes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainIpv6IspCityNodes")
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes> domainIpv6IspCityNodes;

    @NameInMap("Ipv6IspCityNodes")
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes> ipv6IspCityNodes;

    public static DescribeDnsGtmMonitorAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigResponseBody self = new DescribeDnsGtmMonitorAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv4IspCityNodes(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes> ipv4IspCityNodes) {
        this.ipv4IspCityNodes = ipv4IspCityNodes;
        return this;
    }
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes> getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv4IspCityNodes(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes> domainIpv4IspCityNodes) {
        this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
        return this;
    }
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes> getDomainIpv4IspCityNodes() {
        return this.domainIpv4IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setDomainIpv6IspCityNodes(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes> domainIpv6IspCityNodes) {
        this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
        return this;
    }
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes> getDomainIpv6IspCityNodes() {
        return this.domainIpv6IspCityNodes;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponseBody setIpv6IspCityNodes(java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes> ipv6IspCityNodes) {
        this.ipv6IspCityNodes = ipv6IspCityNodes;
        return this;
    }
    public java.util.List<DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes> getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes extends TeaModel {
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

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv4IspCityNodes setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes extends TeaModel {
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

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv4IspCityNodes setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes extends TeaModel {
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

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyDomainIpv6IspCityNodes setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

    }

    public static class DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes extends TeaModel {
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

        public static DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes self = new DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBodyIpv6IspCityNodes setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

    }

}
