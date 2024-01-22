// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ElementContent extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Type")
    public String type;

    @NameInMap("URL")
    public String URL;

    public static ElementContent build(java.util.Map<String, ?> map) throws Exception {
        ElementContent self = new ElementContent();
        return TeaModel.build(map, self);
    }

    public ElementContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ElementContent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ElementContent setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
