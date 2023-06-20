// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetSpeechTemplateRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("country")
    public String country;

    public static GetSpeechTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechTemplateRequest self = new GetSpeechTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetSpeechTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetSpeechTemplateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
