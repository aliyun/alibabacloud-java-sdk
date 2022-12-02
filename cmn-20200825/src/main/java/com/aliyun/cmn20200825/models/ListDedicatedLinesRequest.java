// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("DedicatedLineGateway")
    public String dedicatedLineGateway;

    @NameInMap("DedicatedLineIp")
    public String dedicatedLineIp;

    @NameInMap("DedicatedLineRole")
    public String dedicatedLineRole;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DevicePort")
    public String devicePort;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("IspFormId")
    public String ispFormId;

    @NameInMap("IspId")
    public String ispId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OnlineDate")
    public String onlineDate;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("SpaceName")
    public String spaceName;

    public static ListDedicatedLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesRequest self = new ListDedicatedLinesRequest();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ListDedicatedLinesRequest setDedicatedLineGateway(String dedicatedLineGateway) {
        this.dedicatedLineGateway = dedicatedLineGateway;
        return this;
    }
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    public ListDedicatedLinesRequest setDedicatedLineIp(String dedicatedLineIp) {
        this.dedicatedLineIp = dedicatedLineIp;
        return this;
    }
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    public ListDedicatedLinesRequest setDedicatedLineRole(String dedicatedLineRole) {
        this.dedicatedLineRole = dedicatedLineRole;
        return this;
    }
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    public ListDedicatedLinesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListDedicatedLinesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListDedicatedLinesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ListDedicatedLinesRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public ListDedicatedLinesRequest setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public ListDedicatedLinesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDedicatedLinesRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ListDedicatedLinesRequest setIspFormId(String ispFormId) {
        this.ispFormId = ispFormId;
        return this;
    }
    public String getIspFormId() {
        return this.ispFormId;
    }

    public ListDedicatedLinesRequest setIspId(String ispId) {
        this.ispId = ispId;
        return this;
    }
    public String getIspId() {
        return this.ispId;
    }

    public ListDedicatedLinesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDedicatedLinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDedicatedLinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDedicatedLinesRequest setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate;
        return this;
    }
    public String getOnlineDate() {
        return this.onlineDate;
    }

    public ListDedicatedLinesRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListDedicatedLinesRequest setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

}
