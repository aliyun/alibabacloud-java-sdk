// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("WirelessCloudConnectorGroups")
    public java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups> wirelessCloudConnectorGroups;

    public static ListWirelessCloudConnectorGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorGroupsResponseBody self = new ListWirelessCloudConnectorGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorGroupsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWirelessCloudConnectorGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWirelessCloudConnectorGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWirelessCloudConnectorGroupsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListWirelessCloudConnectorGroupsResponseBody setWirelessCloudConnectorGroups(java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups> wirelessCloudConnectorGroups) {
        this.wirelessCloudConnectorGroups = wirelessCloudConnectorGroups;
        return this;
    }
    public java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups> getWirelessCloudConnectorGroups() {
        return this.wirelessCloudConnectorGroups;
    }

    public static class ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("CardCount")
        public String cardCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataPackageId")
        public String dataPackageId;

        @NameInMap("DataPackageType")
        public String dataPackageType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UseCase")
        public String useCase;

        @NameInMap("WirelessCloudConnectorId")
        public String wirelessCloudConnectorId;

        public static ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors self = new ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setCardCount(String cardCount) {
            this.cardCount = cardCount;
            return this;
        }
        public String getCardCount() {
            return this.cardCount;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setDataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setDataPackageType(String dataPackageType) {
            this.dataPackageType = dataPackageType;
            return this;
        }
        public String getDataPackageType() {
            return this.dataPackageType;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setUseCase(String useCase) {
            this.useCase = useCase;
            return this;
        }
        public String getUseCase() {
            return this.useCase;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

    }

    public static class ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("WirelessCloudConnectorGroupId")
        public String wirelessCloudConnectorGroupId;

        @NameInMap("WirelessCloudConnectors")
        public java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors> wirelessCloudConnectors;

        public static ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups build(java.util.Map<String, ?> map) throws Exception {
            ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups self = new ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups();
            return TeaModel.build(map, self);
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }
        public String getWirelessCloudConnectorGroupId() {
            return this.wirelessCloudConnectorGroupId;
        }

        public ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroups setWirelessCloudConnectors(java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors> wirelessCloudConnectors) {
            this.wirelessCloudConnectors = wirelessCloudConnectors;
            return this;
        }
        public java.util.List<ListWirelessCloudConnectorGroupsResponseBodyWirelessCloudConnectorGroupsWirelessCloudConnectors> getWirelessCloudConnectors() {
            return this.wirelessCloudConnectors;
        }

    }

}
