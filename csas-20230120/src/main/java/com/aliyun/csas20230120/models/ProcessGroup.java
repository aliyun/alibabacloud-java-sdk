// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ProcessGroup extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProcessGroupId")
    public String processGroupId;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Processes")
    public java.util.List<ProcessItem> processes;

    public static ProcessGroup build(java.util.Map<String, ?> map) throws Exception {
        ProcessGroup self = new ProcessGroup();
        return TeaModel.build(map, self);
    }

    public ProcessGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProcessGroup setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ProcessGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ProcessGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProcessGroup setProcessGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
        return this;
    }
    public String getProcessGroupId() {
        return this.processGroupId;
    }

    public ProcessGroup setProcesses(java.util.List<ProcessItem> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<ProcessItem> getProcesses() {
        return this.processes;
    }

}
