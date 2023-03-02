// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class PushMonitorRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static PushMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMonitorRequest self = new PushMonitorRequest();
        return TeaModel.build(map, self);
    }

    public PushMonitorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
