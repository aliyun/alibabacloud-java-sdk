// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RecognizeOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/callback">https://example.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CandidateItems")
    public java.util.List<String> candidateItems;

    /**
     * <strong>example:</strong>
     * <p>DEVICE_001</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>ORDER_001</p>
     */
    @NameInMap("OrderUniqueId")
    public String orderUniqueId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://oss.example.com/video1.mp4%22%5D">https://oss.example.com/video1.mp4&quot;]</a></p>
     */
    @NameInMap("VideoUrls")
    public java.util.List<String> videoUrls;

    public static RecognizeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOrderRequest self = new RecognizeOrderRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeOrderRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public RecognizeOrderRequest setCandidateItems(java.util.List<String> candidateItems) {
        this.candidateItems = candidateItems;
        return this;
    }
    public java.util.List<String> getCandidateItems() {
        return this.candidateItems;
    }

    public RecognizeOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RecognizeOrderRequest setOrderUniqueId(String orderUniqueId) {
        this.orderUniqueId = orderUniqueId;
        return this;
    }
    public String getOrderUniqueId() {
        return this.orderUniqueId;
    }

    public RecognizeOrderRequest setVideoUrls(java.util.List<String> videoUrls) {
        this.videoUrls = videoUrls;
        return this;
    }
    public java.util.List<String> getVideoUrls() {
        return this.videoUrls;
    }

}
