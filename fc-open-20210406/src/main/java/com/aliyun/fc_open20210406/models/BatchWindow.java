// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class BatchWindow extends TeaModel {
    @NameInMap("CountBasedWindow")
    public Long countBasedWindow;

    @NameInMap("TimeBasedWindow")
    public Long timeBasedWindow;

    public static BatchWindow build(java.util.Map<String, ?> map) throws Exception {
        BatchWindow self = new BatchWindow();
        return TeaModel.build(map, self);
    }

    public BatchWindow setCountBasedWindow(Long countBasedWindow) {
        this.countBasedWindow = countBasedWindow;
        return this;
    }
    public Long getCountBasedWindow() {
        return this.countBasedWindow;
    }

    public BatchWindow setTimeBasedWindow(Long timeBasedWindow) {
        this.timeBasedWindow = timeBasedWindow;
        return this;
    }
    public Long getTimeBasedWindow() {
        return this.timeBasedWindow;
    }

}
