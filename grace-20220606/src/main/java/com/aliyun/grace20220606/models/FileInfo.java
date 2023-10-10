// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    @NameInMap("analyzeProgress")
    public FileInfoAnalyzeProgress analyzeProgress;

    @NameInMap("creationTime")
    public Long creationTime;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("labels")
    public String labels;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("shared")
    public Boolean shared;

    @NameInMap("size")
    public Long size;

    @NameInMap("transferProgress")
    public FileInfoTransferProgress transferProgress;

    @NameInMap("transferState")
    public String transferState;

    @NameInMap("type")
    public String type;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setAnalyzeProgress(FileInfoAnalyzeProgress analyzeProgress) {
        this.analyzeProgress = analyzeProgress;
        return this;
    }
    public FileInfoAnalyzeProgress getAnalyzeProgress() {
        return this.analyzeProgress;
    }

    public FileInfo setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public Long getCreationTime() {
        return this.creationTime;
    }

    public FileInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public FileInfo setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public FileInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FileInfo setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FileInfo setShared(Boolean shared) {
        this.shared = shared;
        return this;
    }
    public Boolean getShared() {
        return this.shared;
    }

    public FileInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public FileInfo setTransferProgress(FileInfoTransferProgress transferProgress) {
        this.transferProgress = transferProgress;
        return this;
    }
    public FileInfoTransferProgress getTransferProgress() {
        return this.transferProgress;
    }

    public FileInfo setTransferState(String transferState) {
        this.transferState = transferState;
        return this;
    }
    public String getTransferState() {
        return this.transferState;
    }

    public FileInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class FileInfoAnalyzeProgress extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("percent")
        public Double percent;

        @NameInMap("state")
        public String state;

        public static FileInfoAnalyzeProgress build(java.util.Map<String, ?> map) throws Exception {
            FileInfoAnalyzeProgress self = new FileInfoAnalyzeProgress();
            return TeaModel.build(map, self);
        }

        public FileInfoAnalyzeProgress setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public FileInfoAnalyzeProgress setPercent(Double percent) {
            this.percent = percent;
            return this;
        }
        public Double getPercent() {
            return this.percent;
        }

        public FileInfoAnalyzeProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class FileInfoTransferProgress extends TeaModel {
        @NameInMap("totalSize")
        public Long totalSize;

        @NameInMap("transferredSize")
        public Long transferredSize;

        public static FileInfoTransferProgress build(java.util.Map<String, ?> map) throws Exception {
            FileInfoTransferProgress self = new FileInfoTransferProgress();
            return TeaModel.build(map, self);
        }

        public FileInfoTransferProgress setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public FileInfoTransferProgress setTransferredSize(Long transferredSize) {
            this.transferredSize = transferredSize;
            return this;
        }
        public Long getTransferredSize() {
            return this.transferredSize;
        }

    }

}
