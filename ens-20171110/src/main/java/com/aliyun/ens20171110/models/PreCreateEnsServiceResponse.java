// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreCreateEnsServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("EnsServiceId")
    @Validation(required = true)
    public String ensServiceId;

    @NameInMap("NetLevel")
    @Validation(required = true)
    public String netLevel;

    @NameInMap("BuyResourcesDetail")
    @Validation(required = true)
    public String buyResourcesDetail;

    public static PreCreateEnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCreateEnsServiceResponse self = new PreCreateEnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public PreCreateEnsServiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreCreateEnsServiceResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PreCreateEnsServiceResponse setEnsServiceId(String ensServiceId) {
        this.ensServiceId = ensServiceId;
        return this;
    }
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    public PreCreateEnsServiceResponse setNetLevel(String netLevel) {
        this.netLevel = netLevel;
        return this;
    }
    public String getNetLevel() {
        return this.netLevel;
    }

    public PreCreateEnsServiceResponse setBuyResourcesDetail(String buyResourcesDetail) {
        this.buyResourcesDetail = buyResourcesDetail;
        return this;
    }
    public String getBuyResourcesDetail() {
        return this.buyResourcesDetail;
    }

}
