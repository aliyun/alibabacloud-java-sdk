// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryTextStreamResponseBody extends TeaModel {
    @NameInMap("end")
    public Boolean end;

    @NameInMap("index")
    public Integer index;

    @NameInMap("message")
    public String message;

    @NameInMap("type")
    public Integer type;

    public static QueryTextStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTextStreamResponseBody self = new QueryTextStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTextStreamResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public QueryTextStreamResponseBody setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public QueryTextStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTextStreamResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
