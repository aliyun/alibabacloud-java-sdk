// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class OrderClusterHealthCheckRiskNoticeRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mute")
    public Boolean mute;

    @NameInMap("NoticeType")
    public String noticeType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("RiskCode")
    public String riskCode;

    public static OrderClusterHealthCheckRiskNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderClusterHealthCheckRiskNoticeRequest self = new OrderClusterHealthCheckRiskNoticeRequest();
        return TeaModel.build(map, self);
    }

    public OrderClusterHealthCheckRiskNoticeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setMute(Boolean mute) {
        this.mute = mute;
        return this;
    }
    public Boolean getMute() {
        return this.mute;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public String getNoticeType() {
        return this.noticeType;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public OrderClusterHealthCheckRiskNoticeRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

}
