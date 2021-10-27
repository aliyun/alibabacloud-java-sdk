// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StopLoggingRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static StopLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLoggingRequest self = new StopLoggingRequest();
        return TeaModel.build(map, self);
    }

    public StopLoggingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
