// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class OrderClusterHealthCheckRiskNoticeRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to disable the notification feature if the risk item occurs.</p>
     * <br>
     * <p>*   true: disabled</p>
     * <p>*   false: enabled</p>
     */
    @NameInMap("Mute")
    public Boolean mute;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("NoticeType")
    public String noticeType;

    /**
     * <p>The region in which the cluster resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The ID of the risk item.</p>
     */
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
