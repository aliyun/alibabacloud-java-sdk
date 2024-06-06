// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ServiceInvokeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DoraemonAction")
    public String doraemonAction;

    @NameInMap("MobileExtendParamsJson")
    public String mobileExtendParamsJson;

    @NameInMap("MobileExtendParamsJsonSign")
    public String mobileExtendParamsJsonSign;

    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("TestModel")
    public Boolean testModel;

    @NameInMap("XClientIp")
    public String XClientIp;

    public static ServiceInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        ServiceInvokeRequest self = new ServiceInvokeRequest();
        return TeaModel.build(map, self);
    }

    public ServiceInvokeRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public ServiceInvokeRequest setDoraemonAction(String doraemonAction) {
        this.doraemonAction = doraemonAction;
        return this;
    }
    public String getDoraemonAction() {
        return this.doraemonAction;
    }

    public ServiceInvokeRequest setMobileExtendParamsJson(String mobileExtendParamsJson) {
        this.mobileExtendParamsJson = mobileExtendParamsJson;
        return this;
    }
    public String getMobileExtendParamsJson() {
        return this.mobileExtendParamsJson;
    }

    public ServiceInvokeRequest setMobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
        this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
        return this;
    }
    public String getMobileExtendParamsJsonSign() {
        return this.mobileExtendParamsJsonSign;
    }

    public ServiceInvokeRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public ServiceInvokeRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ServiceInvokeRequest setTestModel(Boolean testModel) {
        this.testModel = testModel;
        return this;
    }
    public Boolean getTestModel() {
        return this.testModel;
    }

    public ServiceInvokeRequest setXClientIp(String XClientIp) {
        this.XClientIp = XClientIp;
        return this;
    }
    public String getXClientIp() {
        return this.XClientIp;
    }

}
