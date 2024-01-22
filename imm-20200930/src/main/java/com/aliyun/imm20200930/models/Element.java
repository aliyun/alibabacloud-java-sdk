// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Element extends TeaModel {
    @NameInMap("ElementContents")
    public java.util.List<ElementContent> elementContents;

    public static Element build(java.util.Map<String, ?> map) throws Exception {
        Element self = new Element();
        return TeaModel.build(map, self);
    }

    public Element setElementContents(java.util.List<ElementContent> elementContents) {
        this.elementContents = elementContents;
        return this;
    }
    public java.util.List<ElementContent> getElementContents() {
        return this.elementContents;
    }

}
