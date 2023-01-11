// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetOperateResultRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ResId")
    public String resId;

    @NameInMap("SerialNo")
    public String serialNo;

    public static GetOperateResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperateResultRequest self = new GetOperateResultRequest();
        return TeaModel.build(map, self);
    }

    public GetOperateResultRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetOperateResultRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public GetOperateResultRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
