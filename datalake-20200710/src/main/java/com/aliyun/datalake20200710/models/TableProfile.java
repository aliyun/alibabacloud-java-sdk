// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableProfile extends TeaModel {
    // 文件数量
    @NameInMap("FileCnt")
    public Long fileCnt;

    // 文件大小
    @NameInMap("FileSize")
    public Long fileSize;

    // 是否分区表
    @NameInMap("IsPartitioned")
    public Boolean isPartitioned;

    // 最后跟新时间
    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    // 分区数量
    @NameInMap("PartitionCnt")
    public Long partitionCnt;

    // 记录数
    @NameInMap("RecordCnt")
    public Long recordCnt;

    public static TableProfile build(java.util.Map<String, ?> map) throws Exception {
        TableProfile self = new TableProfile();
        return TeaModel.build(map, self);
    }

    public TableProfile setFileCnt(Long fileCnt) {
        this.fileCnt = fileCnt;
        return this;
    }
    public Long getFileCnt() {
        return this.fileCnt;
    }

    public TableProfile setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public TableProfile setIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
        return this;
    }
    public Boolean getIsPartitioned() {
        return this.isPartitioned;
    }

    public TableProfile setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public TableProfile setPartitionCnt(Long partitionCnt) {
        this.partitionCnt = partitionCnt;
        return this;
    }
    public Long getPartitionCnt() {
        return this.partitionCnt;
    }

    public TableProfile setRecordCnt(Long recordCnt) {
        this.recordCnt = recordCnt;
        return this;
    }
    public Long getRecordCnt() {
        return this.recordCnt;
    }

}
