// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RunCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
