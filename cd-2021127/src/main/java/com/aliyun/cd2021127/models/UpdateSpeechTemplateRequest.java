// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateSpeechTemplateRequest extends TeaModel {
    @NameInMap("Contents")
    public String contents;

    @NameInMap("Type")
    public String type;

    @NameInMap("country")
    public String country;

    public static UpdateSpeechTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechTemplateRequest self = new UpdateSpeechTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechTemplateRequest setContents(String contents) {
        this.contents = contents;
        return this;
    }
    public String getContents() {
        return this.contents;
    }

    public UpdateSpeechTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateSpeechTemplateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
