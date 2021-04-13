// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class CountProductSpiServiceRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("ActionMethodRegionId")
    public String actionMethodRegionId;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("ActionMethodVersion")
    public String actionMethodVersion;

    @NameInMap("IsActivate")
    public Boolean isActivate;

    @NameInMap("Environment")
    public String environment;

    public static CountProductSpiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CountProductSpiServiceRequest self = new CountProductSpiServiceRequest();
        return TeaModel.build(map, self);
    }

    public CountProductSpiServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CountProductSpiServiceRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public CountProductSpiServiceRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public CountProductSpiServiceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public CountProductSpiServiceRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public CountProductSpiServiceRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public CountProductSpiServiceRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public CountProductSpiServiceRequest setActionMethodVersion(String actionMethodVersion) {
        this.actionMethodVersion = actionMethodVersion;
        return this;
    }
    public String getActionMethodVersion() {
        return this.actionMethodVersion;
    }

    public CountProductSpiServiceRequest setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
        return this;
    }
    public Boolean getIsActivate() {
        return this.isActivate;
    }

    public CountProductSpiServiceRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

}
