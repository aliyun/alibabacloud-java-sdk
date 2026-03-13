// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTriggersOutput extends TeaModel {
    /**
     * <p>The name of the next trigger. The pagination token that is used in the next request to retrieve a new page of results. If this parameter is not returned, all the layers are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>next_token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The triggers.</p>
     */
    @NameInMap("triggers")
    public java.util.List<Trigger> triggers;

    public static ListTriggersOutput build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersOutput self = new ListTriggersOutput();
        return TeaModel.build(map, self);
    }

    public ListTriggersOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTriggersOutput setTriggers(java.util.List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<Trigger> getTriggers() {
        return this.triggers;
    }

}
