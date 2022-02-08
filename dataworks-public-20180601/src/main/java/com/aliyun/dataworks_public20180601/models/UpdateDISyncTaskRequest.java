// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskRequest extends TeaModel {
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
    public java.util.List<UpdateDISyncTaskRequestTableMapping> tableMapping;

    public static UpdateDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskRequest self = new UpdateDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskRequest setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }
    public Integer getConcurrent() {
        return this.concurrent;
    }

    public UpdateDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateDISyncTaskRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public UpdateDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDISyncTaskRequest setResGroupIdentifier(String resGroupIdentifier) {
        this.resGroupIdentifier = resGroupIdentifier;
        return this;
    }
    public String getResGroupIdentifier() {
        return this.resGroupIdentifier;
    }

    public UpdateDISyncTaskRequest setTableMapping(java.util.List<UpdateDISyncTaskRequestTableMapping> tableMapping) {
        this.tableMapping = tableMapping;
        return this;
    }
    public java.util.List<UpdateDISyncTaskRequestTableMapping> getTableMapping() {
        return this.tableMapping;
    }

    public static class UpdateDISyncTaskRequestTableMapping extends TeaModel {
        @NameInMap("DstTable")
        public String dstTable;

        @NameInMap("SrcTable")
        public String srcTable;

        public static UpdateDISyncTaskRequestTableMapping build(java.util.Map<String, ?> map) throws Exception {
            UpdateDISyncTaskRequestTableMapping self = new UpdateDISyncTaskRequestTableMapping();
            return TeaModel.build(map, self);
        }

        public UpdateDISyncTaskRequestTableMapping setDstTable(String dstTable) {
            this.dstTable = dstTable;
            return this;
        }
        public String getDstTable() {
            return this.dstTable;
        }

        public UpdateDISyncTaskRequestTableMapping setSrcTable(String srcTable) {
            this.srcTable = srcTable;
            return this;
        }
        public String getSrcTable() {
            return this.srcTable;
        }

    }

}
