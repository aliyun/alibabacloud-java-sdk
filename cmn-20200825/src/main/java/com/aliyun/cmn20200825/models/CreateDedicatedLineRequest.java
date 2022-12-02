// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDedicatedLineRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Contact")
    public String contact;

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

    @NameInMap("IspFormId")
    public String ispFormId;

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

    public static CreateDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedLineRequest self = new CreateDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedLineRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDedicatedLineRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CreateDedicatedLineRequest setDedicatedLineGateway(String dedicatedLineGateway) {
        this.dedicatedLineGateway = dedicatedLineGateway;
        return this;
    }
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    public CreateDedicatedLineRequest setDedicatedLineIp(String dedicatedLineIp) {
        this.dedicatedLineIp = dedicatedLineIp;
        return this;
    }
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    public CreateDedicatedLineRequest setDedicatedLineRole(String dedicatedLineRole) {
        this.dedicatedLineRole = dedicatedLineRole;
        return this;
    }
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    public CreateDedicatedLineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDedicatedLineRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDedicatedLineRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public CreateDedicatedLineRequest setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public CreateDedicatedLineRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public CreateDedicatedLineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDedicatedLineRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateDedicatedLineRequest setIspFormId(String ispFormId) {
        this.ispFormId = ispFormId;
        return this;
    }
    public String getIspFormId() {
        return this.ispFormId;
    }

    public CreateDedicatedLineRequest setIspId(String ispId) {
        this.ispId = ispId;
        return this;
    }
    public String getIspId() {
        return this.ispId;
    }

    public CreateDedicatedLineRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public CreateDedicatedLineRequest setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate;
        return this;
    }
    public String getOnlineDate() {
        return this.onlineDate;
    }

    public CreateDedicatedLineRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateDedicatedLineRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
