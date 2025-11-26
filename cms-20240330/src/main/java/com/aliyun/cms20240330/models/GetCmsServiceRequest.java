// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCmsServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>prometheus</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>prometheus</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("service")
    public String service;

    public static GetCmsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCmsServiceRequest self = new GetCmsServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetCmsServiceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetCmsServiceRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
