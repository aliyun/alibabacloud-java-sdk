// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class DisableProductSpiServiceRequest extends TeaModel {
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

    public static DisableProductSpiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableProductSpiServiceRequest self = new DisableProductSpiServiceRequest();
        return TeaModel.build(map, self);
    }

    public DisableProductSpiServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DisableProductSpiServiceRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public DisableProductSpiServiceRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public DisableProductSpiServiceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public DisableProductSpiServiceRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public DisableProductSpiServiceRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public DisableProductSpiServiceRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DisableProductSpiServiceRequest setActionMethodVersion(String actionMethodVersion) {
        this.actionMethodVersion = actionMethodVersion;
        return this;
    }
    public String getActionMethodVersion() {
        return this.actionMethodVersion;
    }

    public DisableProductSpiServiceRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

}
