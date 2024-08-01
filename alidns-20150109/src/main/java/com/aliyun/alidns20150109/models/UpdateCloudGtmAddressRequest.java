// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368**92</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    @NameInMap("HealthTasks")
    public java.util.List<UpdateCloudGtmAddressRequestHealthTasks> healthTasks;

    /**
     * <strong>example:</strong>
     * <p>Address-1</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateCloudGtmAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressRequest self = new UpdateCloudGtmAddressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateCloudGtmAddressRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public UpdateCloudGtmAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public UpdateCloudGtmAddressRequest setHealthTasks(java.util.List<UpdateCloudGtmAddressRequestHealthTasks> healthTasks) {
        this.healthTasks = healthTasks;
        return this;
    }
    public java.util.List<UpdateCloudGtmAddressRequestHealthTasks> getHealthTasks() {
        return this.healthTasks;
    }

    public UpdateCloudGtmAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateCloudGtmAddressRequestHealthTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static UpdateCloudGtmAddressRequestHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudGtmAddressRequestHealthTasks self = new UpdateCloudGtmAddressRequestHealthTasks();
            return TeaModel.build(map, self);
        }

        public UpdateCloudGtmAddressRequestHealthTasks setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateCloudGtmAddressRequestHealthTasks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
