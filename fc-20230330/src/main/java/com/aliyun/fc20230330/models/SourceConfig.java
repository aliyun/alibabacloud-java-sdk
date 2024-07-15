// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-sls-logstore-name</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
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
