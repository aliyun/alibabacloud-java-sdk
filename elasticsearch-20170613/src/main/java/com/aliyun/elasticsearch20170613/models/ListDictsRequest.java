// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsRequest extends TeaModel {
    @NameInMap("analyzerType")
    public String analyzerType;

    @NameInMap("body")
    public String body;

    @NameInMap("name")
    public String name;

    public static ListDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDictsRequest self = new ListDictsRequest();
        return TeaModel.build(map, self);
    }

    public ListDictsRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public ListDictsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListDictsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
