// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunSyncCommandRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("WaitTime")
    public Long waitTime;

    public static RunSyncCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSyncCommandRequest self = new RunSyncCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunSyncCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunSyncCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunSyncCommandRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RunSyncCommandRequest setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
        return this;
    }
    public Long getWaitTime() {
        return this.waitTime;
    }

}
