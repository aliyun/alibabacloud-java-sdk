// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogTaskInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WXAIGCOYIQELGKLAL6IFXECD4B</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTlogTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlogTaskInfoRequest self = new GetTlogTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTlogTaskInfoRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetTlogTaskInfoRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetTlogTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
