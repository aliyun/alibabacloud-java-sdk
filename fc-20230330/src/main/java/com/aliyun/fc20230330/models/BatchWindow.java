// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class BatchWindow extends TeaModel {
    /**
     * <p>The maximum number of events that are allowed in the batch window. When this threshold is reached, data in the window is pushed downstream. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CountBasedWindow")
    public Integer countBasedWindow;

    /**
     * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed downstream. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TimeBasedWindow")
    public Integer timeBasedWindow;

    public static BatchWindow build(java.util.Map<String, ?> map) throws Exception {
        BatchWindow self = new BatchWindow();
        return TeaModel.build(map, self);
    }

    public BatchWindow setCountBasedWindow(Integer countBasedWindow) {
        this.countBasedWindow = countBasedWindow;
        return this;
    }
    public Integer getCountBasedWindow() {
        return this.countBasedWindow;
    }

    public BatchWindow setTimeBasedWindow(Integer timeBasedWindow) {
        this.timeBasedWindow = timeBasedWindow;
        return this;
    }
    public Integer getTimeBasedWindow() {
        return this.timeBasedWindow;
    }

}
