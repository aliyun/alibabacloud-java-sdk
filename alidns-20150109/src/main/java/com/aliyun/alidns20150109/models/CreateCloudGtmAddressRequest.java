// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Address")
    public String address;

    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    @NameInMap("HealthTasks")
    public java.util.List<CreateCloudGtmAddressRequestHealthTasks> healthTasks;

    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCloudGtmAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressRequest self = new CreateCloudGtmAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateCloudGtmAddressRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public CreateCloudGtmAddressRequest setAvailableMode(String availableMode) {
        this.availableMode = availableMode;
        return this;
    }
    public String getAvailableMode() {
        return this.availableMode;
    }

    public CreateCloudGtmAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmAddressRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmAddressRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public CreateCloudGtmAddressRequest setHealthTasks(java.util.List<CreateCloudGtmAddressRequestHealthTasks> healthTasks) {
        this.healthTasks = healthTasks;
        return this;
    }
    public java.util.List<CreateCloudGtmAddressRequestHealthTasks> getHealthTasks() {
        return this.healthTasks;
    }

    public CreateCloudGtmAddressRequest setManualAvailableStatus(String manualAvailableStatus) {
        this.manualAvailableStatus = manualAvailableStatus;
        return this;
    }
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    public CreateCloudGtmAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmAddressRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCloudGtmAddressRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateCloudGtmAddressRequestHealthTasks extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("TemplateId")
        public String templateId;

        public static CreateCloudGtmAddressRequestHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudGtmAddressRequestHealthTasks self = new CreateCloudGtmAddressRequestHealthTasks();
            return TeaModel.build(map, self);
        }

        public CreateCloudGtmAddressRequestHealthTasks setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateCloudGtmAddressRequestHealthTasks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
