// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunSyncCommandRequest extends TeaModel {
    /**
     * <p>The content of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding method of the script content. If the specified value is not within the valid values, the default value <code>PlainText</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The list of cloud phone instance IDs. A single request supports up to 50 instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The wait time in milliseconds. Valid values: 500 to 3000. Default value: 1000.</p>
     * 
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
