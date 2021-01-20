// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteLogMonitorRequest extends TeaModel {
    @NameInMap("LogId")
    public Long logId;

    public static DeleteLogMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogMonitorRequest self = new DeleteLogMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogMonitorRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }
    public Long getLogId() {
        return this.logId;
    }

}
