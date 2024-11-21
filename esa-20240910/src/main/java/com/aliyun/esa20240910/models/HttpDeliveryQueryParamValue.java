// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class HttpDeliveryQueryParamValue extends TeaModel {
    /**
     * <p>The static variable.</p>
     * 
     * <strong>example:</strong>
     * <p>alicdn</p>
     */
    @NameInMap("StaticValue")
    public String staticValue;

    public static HttpDeliveryQueryParamValue build(java.util.Map<String, ?> map) throws Exception {
        HttpDeliveryQueryParamValue self = new HttpDeliveryQueryParamValue();
        return TeaModel.build(map, self);
    }

    public HttpDeliveryQueryParamValue setStaticValue(String staticValue) {
        this.staticValue = staticValue;
        return this;
    }
    public String getStaticValue() {
        return this.staticValue;
    }

}
