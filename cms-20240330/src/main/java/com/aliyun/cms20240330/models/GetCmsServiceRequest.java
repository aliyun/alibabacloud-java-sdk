// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCmsServiceRequest extends TeaModel {
    /**
     * <p>prometheus: the activation status of the Prometheus service (billed based on the amount of reported or written data).</p>
     * 
     * <strong>example:</strong>
     * <p>prometheus</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("product")
    public String product;

    /**
     * <p>prometheus: indicates whether the Prometheus product billed based on the amount of reported data is activated.
     * prometheusgb: indicates whether the Prometheus product billed based on the amount of written data is activated.</p>
     * 
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
