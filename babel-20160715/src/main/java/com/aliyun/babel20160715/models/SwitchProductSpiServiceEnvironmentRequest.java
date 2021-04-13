// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SwitchProductSpiServiceEnvironmentRequest extends TeaModel {
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

    @NameInMap("Environment")
    public String environment;

    @NameInMap("TargetEnv")
    public String targetEnv;

    public static SwitchProductSpiServiceEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchProductSpiServiceEnvironmentRequest self = new SwitchProductSpiServiceEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public SwitchProductSpiServiceEnvironmentRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SwitchProductSpiServiceEnvironmentRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public SwitchProductSpiServiceEnvironmentRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public SwitchProductSpiServiceEnvironmentRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SwitchProductSpiServiceEnvironmentRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public SwitchProductSpiServiceEnvironmentRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SwitchProductSpiServiceEnvironmentRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public SwitchProductSpiServiceEnvironmentRequest setActionMethodVersion(String actionMethodVersion) {
        this.actionMethodVersion = actionMethodVersion;
        return this;
    }
    public String getActionMethodVersion() {
        return this.actionMethodVersion;
    }

    public SwitchProductSpiServiceEnvironmentRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public SwitchProductSpiServiceEnvironmentRequest setTargetEnv(String targetEnv) {
        this.targetEnv = targetEnv;
        return this;
    }
    public String getTargetEnv() {
        return this.targetEnv;
    }

}
