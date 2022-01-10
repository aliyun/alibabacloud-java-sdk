// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetPlanItemSpecificationRequest extends TeaModel {
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

    @NameInMap("PayerId")
    public String payerId;

    @NameInMap("PlanItemId")
    public String planItemId;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("UserId")
    public String userId;

    public static GetPlanItemSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlanItemSpecificationRequest self = new GetPlanItemSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public GetPlanItemSpecificationRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetPlanItemSpecificationRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public GetPlanItemSpecificationRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

    public GetPlanItemSpecificationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetPlanItemSpecificationRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetPlanItemSpecificationRequest setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public GetPlanItemSpecificationRequest setPlanItemId(String planItemId) {
        this.planItemId = planItemId;
        return this;
    }
    public String getPlanItemId() {
        return this.planItemId;
    }

    public GetPlanItemSpecificationRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public GetPlanItemSpecificationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
