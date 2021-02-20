// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreCreateEnsServiceResponseBody extends TeaModel {
    @NameInMap("BuyResourcesDetail")
    public String buyResourcesDetail;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("EnsServiceId")
    public String ensServiceId;

    @NameInMap("NetLevel")
    public String netLevel;

    @NameInMap("RequestId")
    public String requestId;

    public static PreCreateEnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCreateEnsServiceResponseBody self = new PreCreateEnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCreateEnsServiceResponseBody setBuyResourcesDetail(String buyResourcesDetail) {
        this.buyResourcesDetail = buyResourcesDetail;
        return this;
    }
    public String getBuyResourcesDetail() {
        return this.buyResourcesDetail;
    }

    public PreCreateEnsServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PreCreateEnsServiceResponseBody setEnsServiceId(String ensServiceId) {
        this.ensServiceId = ensServiceId;
        return this;
    }
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    public PreCreateEnsServiceResponseBody setNetLevel(String netLevel) {
        this.netLevel = netLevel;
        return this;
    }
    public String getNetLevel() {
        return this.netLevel;
    }

    public PreCreateEnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
