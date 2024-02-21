// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StartLoggingRequest extends TeaModel {
    /**
     * <p>The name of the trail that you want to enable.</p>
     * <br>
     * <p>The name must be 6 to 36 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). It must start with a lowercase letter.</p>
     * <br>
     * <p>> The name must be unique within your Alibaba Cloud account.</p>
     */
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
