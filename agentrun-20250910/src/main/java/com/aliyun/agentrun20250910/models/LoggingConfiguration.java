// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class LoggingConfiguration extends TeaModel {
    /**
     * <p>日志输出的目标配置列表</p>
     */
    @NameInMap("destinations")
    public java.util.List<LogDestination> destinations;

    public static LoggingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        LoggingConfiguration self = new LoggingConfiguration();
        return TeaModel.build(map, self);
    }

    public LoggingConfiguration setDestinations(java.util.List<LogDestination> destinations) {
        this.destinations = destinations;
        return this;
    }
    public java.util.List<LogDestination> getDestinations() {
        return this.destinations;
    }

}
