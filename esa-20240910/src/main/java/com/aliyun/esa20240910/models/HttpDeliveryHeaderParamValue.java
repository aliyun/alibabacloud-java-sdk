// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class HttpDeliveryHeaderParamValue extends TeaModel {
    /**
     * <p>The static variable.</p>
     * 
     * <strong>example:</strong>
     * <p>alicdn</p>
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
