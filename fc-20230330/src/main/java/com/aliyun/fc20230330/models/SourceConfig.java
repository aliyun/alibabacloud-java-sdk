// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceConfig extends TeaModel {
    /**
     * <p>The name of the Logstore. The trigger periodically subscribes to data from this Logstore and then triggers the function.</p>
     * 
     * <strong>example:</strong>
     * <p>my-sls-logstore-name</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The start time of consumption. Unit: seconds. If you do not specify this parameter, consumption starts from the latest data. If this parameter is specified, a trigger event is generated for data written after the specified time. For consumption of existing data, the trigger interval is ignored to catch up with the consumption delay until the real-time trigger progress is caught up. When the catch-up is complete, the trigger starts to trigger function invocations based on the specified trigger event interval without delay.</p>
     * 
     * <strong>example:</strong>
     * <p>1704790317</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static SourceConfig build(java.util.Map<String, ?> map) throws Exception {
        SourceConfig self = new SourceConfig();
        return TeaModel.build(map, self);
    }

    public SourceConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public SourceConfig setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
