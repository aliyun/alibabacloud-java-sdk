// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChGeneralStanfordRequest extends TeaModel {
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

    public static GetDpChGeneralStanfordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDpChGeneralStanfordRequest self = new GetDpChGeneralStanfordRequest();
        return TeaModel.build(map, self);
    }

    public GetDpChGeneralStanfordRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetDpChGeneralStanfordRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
