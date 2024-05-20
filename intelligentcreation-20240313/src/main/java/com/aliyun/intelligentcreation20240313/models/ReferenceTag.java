// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ReferenceTag extends TeaModel {
    @NameInMap("referenceContent")
    public String referenceContent;

    @NameInMap("referenceTitle")
    public String referenceTitle;

    public static ReferenceTag build(java.util.Map<String, ?> map) throws Exception {
        ReferenceTag self = new ReferenceTag();
        return TeaModel.build(map, self);
    }

    public ReferenceTag setReferenceContent(String referenceContent) {
        this.referenceContent = referenceContent;
        return this;
    }
    public String getReferenceContent() {
        return this.referenceContent;
    }

    public ReferenceTag setReferenceTitle(String referenceTitle) {
        this.referenceTitle = referenceTitle;
        return this;
    }
    public String getReferenceTitle() {
        return this.referenceTitle;
    }

}
