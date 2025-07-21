// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowMetricShrinkRequest extends TeaModel {
    /**
     * <p>Business tenant code, default is “ALICOM_OPAAS”.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>Business extension information, default is “{}”.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>Flow code.</p>
     * 
     * <strong>example:</strong>
     * <p>f4912c16943b4dfba44bd6fedacf****</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>Flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    /**
     * <p>Start timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1751299200</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>Metric name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nodeUsageStatistics</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("MetricParam")
    public String metricParamShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>End timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1751385599</p>
     */
    @NameInMap("To")
    public Long to;

    public static GetChatFlowMetricShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatFlowMetricShrinkRequest self = new GetChatFlowMetricShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetChatFlowMetricShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GetChatFlowMetricShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public GetChatFlowMetricShrinkRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public GetChatFlowMetricShrinkRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public GetChatFlowMetricShrinkRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetChatFlowMetricShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetChatFlowMetricShrinkRequest setMetricParamShrink(String metricParamShrink) {
        this.metricParamShrink = metricParamShrink;
        return this;
    }
    public String getMetricParamShrink() {
        return this.metricParamShrink;
    }

    public GetChatFlowMetricShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetChatFlowMetricShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetChatFlowMetricShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetChatFlowMetricShrinkRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
