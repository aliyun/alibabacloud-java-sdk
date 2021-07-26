// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 数组，返回示例目录。
    @NameInMap("Ip")
    public java.util.List<ListIpResponseBodyIp> ip;

    public static ListIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpResponseBody self = new ListIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpResponseBody setIp(java.util.List<ListIpResponseBodyIp> ip) {
        this.ip = ip;
        return this;
    }
    public java.util.List<ListIpResponseBodyIp> getIp() {
        return this.ip;
    }

    public static class ListIpResponseBodyIpZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static ListIpResponseBodyIpZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            ListIpResponseBodyIpZoneLayer self = new ListIpResponseBodyIpZoneLayer();
            return TeaModel.build(map, self);
        }

        public ListIpResponseBodyIpZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIpResponseBodyIpZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpResponseBodyIp extends TeaModel {
        // 设备端口名称
        @NameInMap("Port")
        public String port;

        // 设备MAC
        @NameInMap("DeviceMac")
        public String deviceMac;

        // IP地址
        @NameInMap("IpAddress")
        public String ipAddress;

        // 资源一级ID
        @NameInMap("IpId")
        public String ipId;

        // 状态 using available lock
        @NameInMap("Status")
        public String status;

        // 地址段
        @NameInMap("ParentIpBlock")
        public String parentIpBlock;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<ListIpResponseBodyIpZoneLayer> zoneLayer;

        // 业务类型名称
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        // 业务类型UID
        @NameInMap("BusinessTypeId")
        public String businessTypeId;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        public static ListIpResponseBodyIp build(java.util.Map<String, ?> map) throws Exception {
            ListIpResponseBodyIp self = new ListIpResponseBodyIp();
            return TeaModel.build(map, self);
        }

        public ListIpResponseBodyIp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListIpResponseBodyIp setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public ListIpResponseBodyIp setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListIpResponseBodyIp setIpId(String ipId) {
            this.ipId = ipId;
            return this;
        }
        public String getIpId() {
            return this.ipId;
        }

        public ListIpResponseBodyIp setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpResponseBodyIp setParentIpBlock(String parentIpBlock) {
            this.parentIpBlock = parentIpBlock;
            return this;
        }
        public String getParentIpBlock() {
            return this.parentIpBlock;
        }

        public ListIpResponseBodyIp setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpResponseBodyIp setZoneLayer(java.util.List<ListIpResponseBodyIpZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<ListIpResponseBodyIpZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public ListIpResponseBodyIp setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public ListIpResponseBodyIp setBusinessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }
        public String getBusinessTypeId() {
            return this.businessTypeId;
        }

        public ListIpResponseBodyIp setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
