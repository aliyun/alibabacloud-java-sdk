// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTriggersOutput extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

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
