// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListInstanceAlarmRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static ListInstanceAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAlarmRequest self = new ListInstanceAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAlarmRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
