// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetUserUploadSignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetUserUploadSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadSignRequest self = new GetUserUploadSignRequest();
        return TeaModel.build(map, self);
    }

    public GetUserUploadSignRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
