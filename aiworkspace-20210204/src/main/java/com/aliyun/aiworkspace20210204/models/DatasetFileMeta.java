// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMeta extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("FileFingerPrint")
    public String fileFingerPrint;

    /**
     * <strong>example:</strong>
     * <p>car.png</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    /**
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("Score")
    public Float score;

    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>oss://test-bucket/dataset/car.png</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DatasetFileMeta build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMeta self = new DatasetFileMeta();
        return TeaModel.build(map, self);
    }

    public DatasetFileMeta setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMeta setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMeta setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DatasetFileMeta setFileFingerPrint(String fileFingerPrint) {
        this.fileFingerPrint = fileFingerPrint;
        return this;
    }
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
    }

    public DatasetFileMeta setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMeta setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMeta setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public DatasetFileMeta setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DatasetFileMeta setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
