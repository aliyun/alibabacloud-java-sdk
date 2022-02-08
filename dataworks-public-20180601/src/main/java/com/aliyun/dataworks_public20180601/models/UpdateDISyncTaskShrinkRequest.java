// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskShrinkRequest extends TeaModel {
    @NameInMap("Concurrent")
    public Integer concurrent;

    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResGroupIdentifier")
    public String resGroupIdentifier;

    @NameInMap("TableMapping")
    public String tableMappingShrink;

    public static UpdateDISyncTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskShrinkRequest self = new UpdateDISyncTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskShrinkRequest setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }
    public Integer getConcurrent() {
        return this.concurrent;
    }

    public UpdateDISyncTaskShrinkRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateDISyncTaskShrinkRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public UpdateDISyncTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDISyncTaskShrinkRequest setResGroupIdentifier(String resGroupIdentifier) {
        this.resGroupIdentifier = resGroupIdentifier;
        return this;
    }
    public String getResGroupIdentifier() {
        return this.resGroupIdentifier;
    }

    public UpdateDISyncTaskShrinkRequest setTableMappingShrink(String tableMappingShrink) {
        this.tableMappingShrink = tableMappingShrink;
        return this;
    }
    public String getTableMappingShrink() {
        return this.tableMappingShrink;
    }

}
