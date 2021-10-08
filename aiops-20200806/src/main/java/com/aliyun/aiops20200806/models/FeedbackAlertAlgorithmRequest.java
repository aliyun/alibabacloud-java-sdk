// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class FeedbackAlertAlgorithmRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("AlgorithmAccurateState")
    public Integer algorithmAccurateState;

    @NameInMap("AlgorithmAccurateDescribe")
    public String algorithmAccurateDescribe;

    public static FeedbackAlertAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackAlertAlgorithmRequest self = new FeedbackAlertAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackAlertAlgorithmRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public FeedbackAlertAlgorithmRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public FeedbackAlertAlgorithmRequest setAlgorithmAccurateState(Integer algorithmAccurateState) {
        this.algorithmAccurateState = algorithmAccurateState;
        return this;
    }
    public Integer getAlgorithmAccurateState() {
        return this.algorithmAccurateState;
    }

    public FeedbackAlertAlgorithmRequest setAlgorithmAccurateDescribe(String algorithmAccurateDescribe) {
        this.algorithmAccurateDescribe = algorithmAccurateDescribe;
        return this;
    }
    public String getAlgorithmAccurateDescribe() {
        return this.algorithmAccurateDescribe;
    }

}
