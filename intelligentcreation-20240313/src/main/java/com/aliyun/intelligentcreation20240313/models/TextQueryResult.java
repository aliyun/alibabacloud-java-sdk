// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextQueryResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("texts")
    public java.util.List<Text> texts;

    @NameInMap("total")
    public Integer total;

    public static TextQueryResult build(java.util.Map<String, ?> map) throws Exception {
        TextQueryResult self = new TextQueryResult();
        return TeaModel.build(map, self);
    }

    public TextQueryResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextQueryResult setTexts(java.util.List<Text> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<Text> getTexts() {
        return this.texts;
    }

    public TextQueryResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
