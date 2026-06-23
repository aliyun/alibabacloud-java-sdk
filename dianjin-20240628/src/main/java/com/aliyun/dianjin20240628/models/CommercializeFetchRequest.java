// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CommercializeFetchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("channelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("secretKey")
    public String secretKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sign")
    public String sign;

    public static CommercializeFetchRequest build(java.util.Map<String, ?> map) throws Exception {
        CommercializeFetchRequest self = new CommercializeFetchRequest();
        return TeaModel.build(map, self);
    }

    public CommercializeFetchRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CommercializeFetchRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CommercializeFetchRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CommercializeFetchRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommercializeFetchRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public CommercializeFetchRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
