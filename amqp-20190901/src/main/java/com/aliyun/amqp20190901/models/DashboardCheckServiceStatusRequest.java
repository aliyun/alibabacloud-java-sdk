// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DashboardCheckServiceStatusRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static DashboardCheckServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DashboardCheckServiceStatusRequest self = new DashboardCheckServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DashboardCheckServiceStatusRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
