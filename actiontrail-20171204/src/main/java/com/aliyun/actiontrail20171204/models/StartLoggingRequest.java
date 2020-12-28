// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class StartLoggingRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static StartLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLoggingRequest self = new StartLoggingRequest();
        return TeaModel.build(map, self);
    }

    public StartLoggingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
