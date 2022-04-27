// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    // 数组，返回示例目录。
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

        // 创建时间
        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        // 资源名称
        @NameInMap("Status")
        public String status;

        @NameInMap("UseCase")
        public String useCase;

        // 资源一级ID
        @NameInMap("WirelessCloudConnectorId")
        public String wirelessCloudConnectorId;

        public static ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors self = new ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors();
            return TeaModel.build(map, self);
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

        public ListWirelessCloudConnectorsResponseBodyWirelessCloudConnectors setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

    }

}
