// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupAllActiveProductSpiServiceListRequest extends TeaModel {
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

    @NameInMap("ActionMethodVersion")
    public String actionMethodVersion;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("SpiChannel")
    public String spiChannel;

    @NameInMap("SpiGroup")
    public String spiGroup;

    public static LookupAllActiveProductSpiServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupAllActiveProductSpiServiceListRequest self = new LookupAllActiveProductSpiServiceListRequest();
        return TeaModel.build(map, self);
    }

    public LookupAllActiveProductSpiServiceListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public LookupAllActiveProductSpiServiceListRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public LookupAllActiveProductSpiServiceListRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public LookupAllActiveProductSpiServiceListRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public LookupAllActiveProductSpiServiceListRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public LookupAllActiveProductSpiServiceListRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public LookupAllActiveProductSpiServiceListRequest setActionMethodVersion(String actionMethodVersion) {
        this.actionMethodVersion = actionMethodVersion;
        return this;
    }
    public String getActionMethodVersion() {
        return this.actionMethodVersion;
    }

    public LookupAllActiveProductSpiServiceListRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public LookupAllActiveProductSpiServiceListRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public LookupAllActiveProductSpiServiceListRequest setSpiChannel(String spiChannel) {
        this.spiChannel = spiChannel;
        return this;
    }
    public String getSpiChannel() {
        return this.spiChannel;
    }

    public LookupAllActiveProductSpiServiceListRequest setSpiGroup(String spiGroup) {
        this.spiGroup = spiGroup;
        return this;
    }
    public String getSpiGroup() {
        return this.spiGroup;
    }

}
