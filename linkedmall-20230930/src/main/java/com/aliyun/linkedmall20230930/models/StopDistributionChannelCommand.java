// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class StopDistributionChannelCommand extends TeaModel {
    /**
     * <p>The set of channel IDs.</p>
     */
    @NameInMap("channelCodes")
    public java.util.List<String> channelCodes;

    /**
     * <p>The store ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1100001</p>
     */
    @NameInMap("lmShopId")
    public String lmShopId;

    /**
     * <p>The commodity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>660******080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The request time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    /**
     * <p>The requesting user.</p>
     * 
     * <strong>example:</strong>
     * <p>12000000001</p>
     */
    @NameInMap("requestUser")
    public String requestUser;

    public static StopDistributionChannelCommand build(java.util.Map<String, ?> map) throws Exception {
        StopDistributionChannelCommand self = new StopDistributionChannelCommand();
        return TeaModel.build(map, self);
    }

    public StopDistributionChannelCommand setChannelCodes(java.util.List<String> channelCodes) {
        this.channelCodes = channelCodes;
        return this;
    }
    public java.util.List<String> getChannelCodes() {
        return this.channelCodes;
    }

    public StopDistributionChannelCommand setLmShopId(String lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public String getLmShopId() {
        return this.lmShopId;
    }

    public StopDistributionChannelCommand setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public StopDistributionChannelCommand setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDistributionChannelCommand setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public StopDistributionChannelCommand setRequestUser(String requestUser) {
        this.requestUser = requestUser;
        return this;
    }
    public String getRequestUser() {
        return this.requestUser;
    }

}
