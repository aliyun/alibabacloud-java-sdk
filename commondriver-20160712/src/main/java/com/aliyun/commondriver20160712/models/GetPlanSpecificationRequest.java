// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetPlanSpecificationRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("BuyerId")
    public String buyerId;

    @NameInMap("ChildId")
    public String childId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("NeedItemSpecification")
    public Boolean needItemSpecification;

    @NameInMap("PayerId")
    public String payerId;

    @NameInMap("PlanCode")
    public String planCode;

    @NameInMap("PlanId")
    public Long planId;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("UserId")
    public String userId;

    public static GetPlanSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlanSpecificationRequest self = new GetPlanSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public GetPlanSpecificationRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetPlanSpecificationRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public GetPlanSpecificationRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

    public GetPlanSpecificationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetPlanSpecificationRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetPlanSpecificationRequest setNeedItemSpecification(Boolean needItemSpecification) {
        this.needItemSpecification = needItemSpecification;
        return this;
    }
    public Boolean getNeedItemSpecification() {
        return this.needItemSpecification;
    }

    public GetPlanSpecificationRequest setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public GetPlanSpecificationRequest setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public GetPlanSpecificationRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public GetPlanSpecificationRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public GetPlanSpecificationRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public GetPlanSpecificationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
