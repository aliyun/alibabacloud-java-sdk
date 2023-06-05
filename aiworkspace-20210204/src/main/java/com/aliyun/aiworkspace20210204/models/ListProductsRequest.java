// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    @NameInMap("ProductCodes")
    public String productCodes;

    @NameInMap("ServiceCodes")
    public String serviceCodes;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setProductCodes(String productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public String getProductCodes() {
        return this.productCodes;
    }

    public ListProductsRequest setServiceCodes(String serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }
    public String getServiceCodes() {
        return this.serviceCodes;
    }

    public ListProductsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
