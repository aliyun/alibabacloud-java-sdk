// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAliasesOutput extends TeaModel {
    @NameInMap("aliases")
    public java.util.List<Alias> aliases;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAliasesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesOutput self = new ListAliasesOutput();
        return TeaModel.build(map, self);
    }

    public ListAliasesOutput setAliases(java.util.List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }
    public java.util.List<Alias> getAliases() {
        return this.aliases;
    }

    public ListAliasesOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
