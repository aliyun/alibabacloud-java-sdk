// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSaChGeneralRequest extends TeaModel {
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

    public static GetSaChGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSaChGeneralRequest self = new GetSaChGeneralRequest();
        return TeaModel.build(map, self);
    }

    public GetSaChGeneralRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetSaChGeneralRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
