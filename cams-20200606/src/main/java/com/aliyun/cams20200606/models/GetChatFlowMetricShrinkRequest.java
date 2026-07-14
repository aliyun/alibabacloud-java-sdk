// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowMetricShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The flow code. You can view the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. On the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to open the canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    /**
     * <p>The start time. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1751299200</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>The metric name. Valid values:</p>
     * <ul>
     * <li><p>nodeUsageStatistics: node usage statistics.</p>
     * </li>
     * <li><p>nodeErrorDetails: node error details.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nodeUsageStatistics</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The extended parameter for the metric query. When MetricName is set to nodeErrorDetails, pass in a JSON string. Valid values for the JSON fields:</p>
     * <ul>
     * <li><p>pageNo: the current page number.</p>
     * </li>
     * <li><p>pageSize: the number of entries per page.</p>
     * </li>
     * <li><p>nodeId: the node ID. On the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to open the canvas and copy the node ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;pageNo&quot;: 1,
     *   &quot;pageSize&quot;: 20,
     *   &quot;nodeId&quot;: &quot;SendWhatsAppMessage#H7fKq5rM&quot;
     * }</p>
     */
    @NameInMap("MetricParam")
    public String metricParamShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The end time. This value is a UNIX timestamp. Unit: seconds.</p>
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
