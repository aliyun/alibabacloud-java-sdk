// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionsOutput extends TeaModel {
    @NameInMap("functions")
    public java.util.List<Function> functions;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsOutput self = new ListFunctionsOutput();
        return TeaModel.build(map, self);
    }

    public ListFunctionsOutput setFunctions(java.util.List<Function> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<Function> getFunctions() {
        return this.functions;
    }

    public ListFunctionsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
