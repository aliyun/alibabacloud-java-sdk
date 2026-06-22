// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadNarratorOption extends TeaModel {
    /**
     * <p>Whether to enable the document narration feature. Set to <code>true</code> to enable narration. Defaults to <code>false</code>.</p>
     */
    @NameInMap("Narrate")
    public Boolean narrate;

    public static DocumentReadNarratorOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentReadNarratorOption self = new DocumentReadNarratorOption();
        return TeaModel.build(map, self);
    }

    public DocumentReadNarratorOption setNarrate(Boolean narrate) {
        this.narrate = narrate;
        return this;
    }
    public Boolean getNarrate() {
        return this.narrate;
    }

}
