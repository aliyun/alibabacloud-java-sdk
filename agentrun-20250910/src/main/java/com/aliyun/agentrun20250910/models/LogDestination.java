// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class LogDestination extends TeaModel {
    /**
     * <p>阿里云日志服务（SLS）的日志目标配置</p>
     */
    @NameInMap("slsLogDestination")
    public SLSLogDestination slsLogDestination;

    public static LogDestination build(java.util.Map<String, ?> map) throws Exception {
        LogDestination self = new LogDestination();
        return TeaModel.build(map, self);
    }

    public LogDestination setSlsLogDestination(SLSLogDestination slsLogDestination) {
        this.slsLogDestination = slsLogDestination;
        return this;
    }
    public SLSLogDestination getSlsLogDestination() {
        return this.slsLogDestination;
    }

}
