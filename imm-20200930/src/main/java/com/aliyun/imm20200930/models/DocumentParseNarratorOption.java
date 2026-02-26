// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentParseNarratorOption extends TeaModel {
    @NameInMap("Narrate")
    public Boolean narrate;

    public static DocumentParseNarratorOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseNarratorOption self = new DocumentParseNarratorOption();
        return TeaModel.build(map, self);
    }

    public DocumentParseNarratorOption setNarrate(Boolean narrate) {
        this.narrate = narrate;
        return this;
    }
    public Boolean getNarrate() {
        return this.narrate;
    }

}
