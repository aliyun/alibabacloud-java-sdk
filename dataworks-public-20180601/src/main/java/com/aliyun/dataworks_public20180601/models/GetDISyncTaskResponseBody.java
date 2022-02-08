// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDISyncTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponseBody self = new GetDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponseBody setData(GetDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDISyncTaskResponseBodyDataTableMapping extends TeaModel {
        @NameInMap("DstTable")
        public String dstTable;

        @NameInMap("SrcTable")
        public String srcTable;

        public static GetDISyncTaskResponseBodyDataTableMapping build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataTableMapping self = new GetDISyncTaskResponseBodyDataTableMapping();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataTableMapping setDstTable(String dstTable) {
            this.dstTable = dstTable;
            return this;
        }
        public String getDstTable() {
            return this.dstTable;
        }

        public GetDISyncTaskResponseBodyDataTableMapping setSrcTable(String srcTable) {
            this.srcTable = srcTable;
            return this;
        }
        public String getSrcTable() {
            return this.srcTable;
        }

    }

    public static class GetDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Concurrent")
        public Integer concurrent;

        @NameInMap("DstDatasourceName")
        public String dstDatasourceName;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        @NameInMap("SrcDatasourceName")
        public String srcDatasourceName;

        @NameInMap("TableMapping")
        public java.util.List<GetDISyncTaskResponseBodyDataTableMapping> tableMapping;

        public static GetDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyData self = new GetDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyData setConcurrent(Integer concurrent) {
            this.concurrent = concurrent;
            return this;
        }
        public Integer getConcurrent() {
            return this.concurrent;
        }

        public GetDISyncTaskResponseBodyData setDstDatasourceName(String dstDatasourceName) {
            this.dstDatasourceName = dstDatasourceName;
            return this;
        }
        public String getDstDatasourceName() {
            return this.dstDatasourceName;
        }

        public GetDISyncTaskResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetDISyncTaskResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetDISyncTaskResponseBodyData setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public GetDISyncTaskResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDISyncTaskResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public GetDISyncTaskResponseBodyData setResGroupIdentifier(String resGroupIdentifier) {
            this.resGroupIdentifier = resGroupIdentifier;
            return this;
        }
        public String getResGroupIdentifier() {
            return this.resGroupIdentifier;
        }

        public GetDISyncTaskResponseBodyData setSrcDatasourceName(String srcDatasourceName) {
            this.srcDatasourceName = srcDatasourceName;
            return this;
        }
        public String getSrcDatasourceName() {
            return this.srcDatasourceName;
        }

        public GetDISyncTaskResponseBodyData setTableMapping(java.util.List<GetDISyncTaskResponseBodyDataTableMapping> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.List<GetDISyncTaskResponseBodyDataTableMapping> getTableMapping() {
            return this.tableMapping;
        }

    }

}
