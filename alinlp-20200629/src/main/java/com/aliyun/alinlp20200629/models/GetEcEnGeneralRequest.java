// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEcEnGeneralRequest extends TeaModel {
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

    public static GetEcEnGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEcEnGeneralRequest self = new GetEcEnGeneralRequest();
        return TeaModel.build(map, self);
    }

    public GetEcEnGeneralRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetEcEnGeneralRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
