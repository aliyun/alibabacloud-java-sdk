// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushTimesUsageRequest extends TeaModel {
    @NameInMap("Adjust")
    public Boolean adjust;

    @NameInMap("AdjustDate")
    public Long adjustDate;

    /**
     * <p>The client token that ensures the idempotency of the request. We recommend that you use a UUID. The same <code>ClientToken</code> can be submitted only once within 24 hours. Use the same <code>ClientToken</code> when retrying the same operation. Use a new <code>ClientToken</code> for new business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>6dff6c70-3484-4a39-b725-164e3ad9b20d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Alibaba Cloud Marketplace instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mark")
    public String mark;

    /**
     * <p>The number of uses to deduct. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Times")
    public Long times;

    public static PushTimesUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTimesUsageRequest self = new PushTimesUsageRequest();
        return TeaModel.build(map, self);
    }

    public PushTimesUsageRequest setAdjust(Boolean adjust) {
        this.adjust = adjust;
        return this;
    }
    public Boolean getAdjust() {
        return this.adjust;
    }

    public PushTimesUsageRequest setAdjustDate(Long adjustDate) {
        this.adjustDate = adjustDate;
        return this;
    }
    public Long getAdjustDate() {
        return this.adjustDate;
    }

    public PushTimesUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PushTimesUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushTimesUsageRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public PushTimesUsageRequest setTimes(Long times) {
        this.times = times;
        return this;
    }
    public Long getTimes() {
        return this.times;
    }

}
