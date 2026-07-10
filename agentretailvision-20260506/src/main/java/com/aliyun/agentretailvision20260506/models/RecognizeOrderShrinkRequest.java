// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RecognizeOrderShrinkRequest extends TeaModel {
    /**
     * <p>Callback URL for this task. If not provided, the registered default address is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/callback">https://example.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>List of candidate items. It is recommended to pass platform_item_id.</p>
     */
    @NameInMap("CandidateItems")
    public String candidateItemsShrink;

    /**
     * <p>Device ID</p>
     * 
     * <strong>example:</strong>
     * <p>DEVICE_001</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Unique idempotent ID of the business party, unique within the same business party</p>
     * 
     * <strong>example:</strong>
     * <p>ORDER_001</p>
     */
    @NameInMap("OrderUniqueId")
    public String orderUniqueId;

    /**
     * <p>List of shopping video OSS addresses (currently only one is supported)</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://oss.example.com/video1.mp4%22%5D">https://oss.example.com/video1.mp4&quot;]</a></p>
     */
    @NameInMap("VideoUrls")
    public String videoUrlsShrink;

    public static RecognizeOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOrderShrinkRequest self = new RecognizeOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeOrderShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public RecognizeOrderShrinkRequest setCandidateItemsShrink(String candidateItemsShrink) {
        this.candidateItemsShrink = candidateItemsShrink;
        return this;
    }
    public String getCandidateItemsShrink() {
        return this.candidateItemsShrink;
    }

    public RecognizeOrderShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RecognizeOrderShrinkRequest setOrderUniqueId(String orderUniqueId) {
        this.orderUniqueId = orderUniqueId;
        return this;
    }
    public String getOrderUniqueId() {
        return this.orderUniqueId;
    }

    public RecognizeOrderShrinkRequest setVideoUrlsShrink(String videoUrlsShrink) {
        this.videoUrlsShrink = videoUrlsShrink;
        return this;
    }
    public String getVideoUrlsShrink() {
        return this.videoUrlsShrink;
    }

}
