// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetItemPubChEcomRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static GetItemPubChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetItemPubChEcomRequest self = new GetItemPubChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetItemPubChEcomRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetItemPubChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetItemPubChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
