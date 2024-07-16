// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("WirelessCloudConnectors")
    public java.util.List<ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors> wirelessCloudConnectors;

    public static ListWirelessCloudConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorsResponseBody self = new ListWirelessCloudConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWirelessCloudConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWirelessCloudConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWirelessCloudConnectorsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListWirelessCloudConnectorsResponseBody setWirelessCloudConnectors(java.util.List<ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors> wirelessCloudConnectors) {
        this.wirelessCloudConnectors = wirelessCloudConnectors;
        return this;
    }
    public java.util.List<ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors> getWirelessCloudConnectors() {
        return this.wirelessCloudConnectors;
    }

    public static class ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Business</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("CardCount")
        public String cardCount;

        /**
         * <strong>example:</strong>
         * <p>2022-3-15 22:20:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>dp-xxxx</p>
         */
        @NameInMap("DataPackageId")
        public String dataPackageId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DataPackageType")
        public String dataPackageType;

        /**
         * <strong>example:</strong>
         * <p>cc5g-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>CC5G</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UseCase")
        public String useCase;

        /**
         * <strong>example:</strong>
         * <p>cc5gg-****</p>
         */
        @NameInMap("WirelessCloudConnectorGroupId")
        public String wirelessCloudConnectorGroupId;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>cc5g-xxxx</p>
         */
        @NameInMap("WirelessCloudConnectorId")
        public String wirelessCloudConnectorId;

        public static ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors self = new ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setCardCount(String cardCount) {
            this.cardCount = cardCount;
            return this;
        }
        public String getCardCount() {
            return this.cardCount;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setDataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setDataPackageType(String dataPackageType) {
            this.dataPackageType = dataPackageType;
            return this;
        }
        public String getDataPackageType() {
            return this.dataPackageType;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setUseCase(String useCase) {
            this.useCase = useCase;
            return this;
        }
        public String getUseCase() {
            return this.useCase;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }
        public String getWirelessCloudConnectorGroupId() {
            return this.wirelessCloudConnectorGroupId;
        }

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

    }

}
