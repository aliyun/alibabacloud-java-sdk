// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IP address or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the address. This ID uniquely identifies the address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368**92</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>Address Attribution information.</p>
     * 
     * <strong>example:</strong>
     * <p>This parameter is not supported in the current version and does not need to be input.</p>
     */
    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new condition for determining the health state of the address. Valid values:</p>
     * <ul>
     * <li>any_ok: The health check results of at least one health check template are normal.</li>
     * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
     * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
     * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
     * <li>all_ok: The health check results of all health check templates are normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>The health check tasks.</p>
     */
    @NameInMap("HealthTasks")
    public java.util.List<UpdateCloudGtmAddressRequestHealthTasks> healthTasks;

    /**
     * <p>The name of the address.</p>
     * 
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
         * <p>The service port of the address on which health check tasks are performed. If the ping protocol is used for health checks, the configuration of the service port is not supported.</p>
         * <ul>
         * <li>If you leave this parameter empty, the existing service port is deleted.</li>
         * <li>If you specify this parameter, the existing service port is updated based on the value of this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the health check template that is associated with the address. This parameter is required if you specify a service port of the address for health check tasks.</p>
         * <ul>
         * <li>If you leave this parameter empty, the associated health check template is disassociated from the address.</li>
         * <li>If you specify this parameter, the associated health check template is updated based on the value of this parameter.</li>
         * </ul>
         * 
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
