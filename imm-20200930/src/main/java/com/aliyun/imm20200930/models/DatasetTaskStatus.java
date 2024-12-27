// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DatasetTaskStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("LastSucceededTime")
    public String lastSucceededTime;

    /**
     * <strong>example:</strong>
     * <p>2024-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    public static DatasetTaskStatus build(java.util.Map<String, ?> map) throws Exception {
        DatasetTaskStatus self = new DatasetTaskStatus();
        return TeaModel.build(map, self);
    }

    public DatasetTaskStatus setLastSucceededTime(String lastSucceededTime) {
        this.lastSucceededTime = lastSucceededTime;
        return this;
    }
    public String getLastSucceededTime() {
        return this.lastSucceededTime;
    }

    public DatasetTaskStatus setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DatasetTaskStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
