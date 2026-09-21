// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class HttpDeliveryHeaderParamValue extends TeaModel {
    /**
     * <p>The value of the custom HTTP delivery request header.</p>
     * <blockquote>
     * <p>Key-map. The value can be a static value, a dynamic function, or a dynamic value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>x-auth: sk-***</p>
     */
    @NameInMap("StaticValue")
    public String staticValue;

    public static HttpDeliveryHeaderParamValue build(java.util.Map<String, ?> map) throws Exception {
        HttpDeliveryHeaderParamValue self = new HttpDeliveryHeaderParamValue();
        return TeaModel.build(map, self);
    }

    public HttpDeliveryHeaderParamValue setStaticValue(String staticValue) {
        this.staticValue = staticValue;
        return this;
    }
    public String getStaticValue() {
        return this.staticValue;
    }

}
