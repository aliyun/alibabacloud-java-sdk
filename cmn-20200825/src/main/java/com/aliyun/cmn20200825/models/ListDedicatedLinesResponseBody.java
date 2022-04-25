// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DedicatedLines")
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDedicatedLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesResponseBody self = new ListDedicatedLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesResponseBody setDedicatedLines(java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines) {
        this.dedicatedLines = dedicatedLines;
        return this;
    }
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> getDedicatedLines() {
        return this.dedicatedLines;
    }

    public ListDedicatedLinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDedicatedLinesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDedicatedLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDedicatedLinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDedicatedLinesResponseBodyDedicatedLines extends TeaModel {
        // 宽带（Mbps）
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 联系人
        @NameInMap("Contact")
        public String contact;

        // 专线网关
        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        // 物理空间专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 专线IP
        @NameInMap("DedicatedLineIp")
        public String dedicatedLineIp;

        // 专线角色
        @NameInMap("DedicatedLineRole")
        public String dedicatedLineRole;

        // 备注
        @NameInMap("Description")
        public String description;

        // 关联设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 关联设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 关联设备端口
        @NameInMap("DevicePort")
        public String devicePort;

        // 运营商
        @NameInMap("Isp")
        public String isp;

        // 联系电话
        @NameInMap("Phone")
        public String phone;

        // 关联物理空间ID
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        @NameInMap("SpaceName")
        public String spaceName;

        public static ListDedicatedLinesResponseBodyDedicatedLines build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedLinesResponseBodyDedicatedLines self = new ListDedicatedLinesResponseBodyDedicatedLines();
            return TeaModel.build(map, self);
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineIp(String dedicatedLineIp) {
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineRole(String dedicatedLineRole) {
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

}
