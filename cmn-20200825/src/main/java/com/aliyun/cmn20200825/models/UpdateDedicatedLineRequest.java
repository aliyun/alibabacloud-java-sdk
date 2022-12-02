// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDedicatedLineRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Contact")
    public String contact;

    @NameInMap("DedicatedLineGateway")
    public String dedicatedLineGateway;

    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    @NameInMap("DedicatedLineIp")
    public String dedicatedLineIp;

    @NameInMap("DedicatedLineRole")
    public String dedicatedLineRole;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DevicePort")
    public String devicePort;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("ExtAttributes")
    public String extAttributes;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("IspId")
    public String ispId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OnlineDate")
    public String onlineDate;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    public static UpdateDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDedicatedLineRequest self = new UpdateDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDedicatedLineRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateDedicatedLineRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public UpdateDedicatedLineRequest setDedicatedLineGateway(String dedicatedLineGateway) {
        this.dedicatedLineGateway = dedicatedLineGateway;
        return this;
    }
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    public UpdateDedicatedLineRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public UpdateDedicatedLineRequest setDedicatedLineIp(String dedicatedLineIp) {
        this.dedicatedLineIp = dedicatedLineIp;
        return this;
    }
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    public UpdateDedicatedLineRequest setDedicatedLineRole(String dedicatedLineRole) {
        this.dedicatedLineRole = dedicatedLineRole;
        return this;
    }
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    public UpdateDedicatedLineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDedicatedLineRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateDedicatedLineRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public UpdateDedicatedLineRequest setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public UpdateDedicatedLineRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public UpdateDedicatedLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDedicatedLineRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public UpdateDedicatedLineRequest setIspId(String ispId) {
        this.ispId = ispId;
        return this;
    }
    public String getIspId() {
        return this.ispId;
    }

    public UpdateDedicatedLineRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public UpdateDedicatedLineRequest setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate;
        return this;
    }
    public String getOnlineDate() {
        return this.onlineDate;
    }

    public UpdateDedicatedLineRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateDedicatedLineRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
