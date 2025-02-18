// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class StopDistributionCommand extends TeaModel {
    @NameInMap("lmShopId")
    public String lmShopId;

    @NameInMap("productId")
    public String productId;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-12-01 10:01:00</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    @NameInMap("requestUser")
    public String requestUser;

    public static StopDistributionCommand build(java.util.Map<String, ?> map) throws Exception {
        StopDistributionCommand self = new StopDistributionCommand();
        return TeaModel.build(map, self);
    }

    public StopDistributionCommand setLmShopId(String lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public String getLmShopId() {
        return this.lmShopId;
    }

    public StopDistributionCommand setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public StopDistributionCommand setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDistributionCommand setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public StopDistributionCommand setRequestUser(String requestUser) {
        this.requestUser = requestUser;
        return this;
    }
    public String getRequestUser() {
        return this.requestUser;
    }

}
