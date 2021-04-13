// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class RegisterProductSpiServiceRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("ActionMethodRegionId")
    public String actionMethodRegionId;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ActionMethodVersion")
    public String actionMethodVersion;

    @NameInMap("ActionMethod")
    public String actionMethod;

    @NameInMap("IsActivate")
    public Boolean isActivate;

    @NameInMap("Environment")
    public String environment;

    public static RegisterProductSpiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterProductSpiServiceRequest self = new RegisterProductSpiServiceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterProductSpiServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RegisterProductSpiServiceRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public RegisterProductSpiServiceRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public RegisterProductSpiServiceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public RegisterProductSpiServiceRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public RegisterProductSpiServiceRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public RegisterProductSpiServiceRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public RegisterProductSpiServiceRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public RegisterProductSpiServiceRequest setActionMethodVersion(String actionMethodVersion) {
        this.actionMethodVersion = actionMethodVersion;
        return this;
    }
    public String getActionMethodVersion() {
        return this.actionMethodVersion;
    }

    public RegisterProductSpiServiceRequest setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
        return this;
    }
    public String getActionMethod() {
        return this.actionMethod;
    }

    public RegisterProductSpiServiceRequest setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
        return this;
    }
    public Boolean getIsActivate() {
        return this.isActivate;
    }

    public RegisterProductSpiServiceRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

}
