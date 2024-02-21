// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StopLoggingRequest extends TeaModel {
    /**
     * <p>The name of the trail that you want to disable.</p>
     * <br>
     * <p>The name must be 6 to 36 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). It must start with a lowercase letter.</p>
     * <br>
     * <p>> The name must be unique within your Alibaba Cloud account.</p>
     */
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
