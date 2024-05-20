// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetBrandChEcomRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    public static GetBrandChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBrandChEcomRequest self = new GetBrandChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetBrandChEcomRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetBrandChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetBrandChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
