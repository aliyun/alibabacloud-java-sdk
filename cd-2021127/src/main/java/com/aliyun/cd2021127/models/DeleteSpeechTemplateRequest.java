// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteSpeechTemplateRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("country")
    public String country;

    public static DeleteSpeechTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpeechTemplateRequest self = new DeleteSpeechTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpeechTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteSpeechTemplateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
