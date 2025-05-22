// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class GetAlipayUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.beian_assist</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>206129201170307</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://nfyt.lzsgtghchy.com:502/sigin/">https://nfyt.lzsgtghchy.com:502/sigin/</a></p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetAlipayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlRequest self = new GetAlipayUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAlipayUrlRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetAlipayUrlRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public GetAlipayUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
