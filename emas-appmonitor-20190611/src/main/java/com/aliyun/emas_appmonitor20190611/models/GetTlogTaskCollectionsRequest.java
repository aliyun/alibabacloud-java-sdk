// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogTaskCollectionsRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
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
     * <p>WXAIGC5ZCVUIYY78ABTCOUHGSQ</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTlogTaskCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlogTaskCollectionsRequest self = new GetTlogTaskCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public GetTlogTaskCollectionsRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetTlogTaskCollectionsRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetTlogTaskCollectionsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
