// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimProjectDrawFilesRequest extends TeaModel {
    // 建筑
    @NameInMap("ArchitectureFiles")
    public java.util.List<UpdateBimProjectDrawFilesRequestArchitectureFiles> architectureFiles;

    // 结构
    @NameInMap("StructureFiles")
    public java.util.List<UpdateBimProjectDrawFilesRequestStructureFiles> structureFiles;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateBimProjectDrawFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimProjectDrawFilesRequest self = new UpdateBimProjectDrawFilesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimProjectDrawFilesRequest setArchitectureFiles(java.util.List<UpdateBimProjectDrawFilesRequestArchitectureFiles> architectureFiles) {
        this.architectureFiles = architectureFiles;
        return this;
    }
    public java.util.List<UpdateBimProjectDrawFilesRequestArchitectureFiles> getArchitectureFiles() {
        return this.architectureFiles;
    }

    public UpdateBimProjectDrawFilesRequest setStructureFiles(java.util.List<UpdateBimProjectDrawFilesRequestStructureFiles> structureFiles) {
        this.structureFiles = structureFiles;
        return this;
    }
    public java.util.List<UpdateBimProjectDrawFilesRequestStructureFiles> getStructureFiles() {
        return this.structureFiles;
    }

    public UpdateBimProjectDrawFilesRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class UpdateBimProjectDrawFilesRequestArchitectureFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static UpdateBimProjectDrawFilesRequestArchitectureFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateBimProjectDrawFilesRequestArchitectureFiles self = new UpdateBimProjectDrawFilesRequestArchitectureFiles();
            return TeaModel.build(map, self);
        }

        public UpdateBimProjectDrawFilesRequestArchitectureFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBimProjectDrawFilesRequestArchitectureFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateBimProjectDrawFilesRequestStructureFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static UpdateBimProjectDrawFilesRequestStructureFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateBimProjectDrawFilesRequestStructureFiles self = new UpdateBimProjectDrawFilesRequestStructureFiles();
            return TeaModel.build(map, self);
        }

        public UpdateBimProjectDrawFilesRequestStructureFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBimProjectDrawFilesRequestStructureFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
