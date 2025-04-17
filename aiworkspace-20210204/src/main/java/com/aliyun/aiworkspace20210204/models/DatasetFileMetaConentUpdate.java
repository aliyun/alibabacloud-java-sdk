// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaConentUpdate extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    @NameInMap("MetaAttributes")
    public String metaAttributes;

    @NameInMap("SemanticIndexJobId")
    public String semanticIndexJobId;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01.000Z</p>
     */
    @NameInMap("SemanticIndexUpdateTime")
    public String semanticIndexUpdateTime;

    /**
     * <strong>example:</strong>
     * <p>● 执行算法打标更新（必须设置有效的TagJobId）： {    &quot;ai&quot;:[&quot;车道线&quot;, &quot;水马&quot;, &quot;晴天&quot;] } ● 用户手动打标：(add/remove表示对标签组内的标签进行增加/删除操作) 用户可操作的标签组为：   ○ user: 对单个元数据，用户自行添加的标签名列表。   ○ user-delete-ai-tags: 对单个元数据，算法标签组中用户需要删除的标签名列表。 {     &quot;user&quot;:{         &quot;add&quot;:[&quot;车道线&quot;,&quot;晴天&quot;],         &quot;remove&quot;:[&quot;水马&quot;]     },     &quot;user-delete-ai-tags&quot;:{         &quot;add&quot;: [&quot;地面阴影&quot;],         &quot;remove&quot;: []     } }</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DatasetFileMetaConentUpdate build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetaConentUpdate self = new DatasetFileMetaConentUpdate();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetaConentUpdate setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DatasetFileMetaConentUpdate setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DatasetFileMetaConentUpdate setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetFileMetaConentUpdate setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMetaConentUpdate setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public DatasetFileMetaConentUpdate setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DatasetFileMetaConentUpdate setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DatasetFileMetaConentUpdate setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public DatasetFileMetaConentUpdate setMetaAttributes(String metaAttributes) {
        this.metaAttributes = metaAttributes;
        return this;
    }
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    public DatasetFileMetaConentUpdate setSemanticIndexJobId(String semanticIndexJobId) {
        this.semanticIndexJobId = semanticIndexJobId;
        return this;
    }
    public String getSemanticIndexJobId() {
        return this.semanticIndexJobId;
    }

    public DatasetFileMetaConentUpdate setSemanticIndexUpdateTime(String semanticIndexUpdateTime) {
        this.semanticIndexUpdateTime = semanticIndexUpdateTime;
        return this;
    }
    public String getSemanticIndexUpdateTime() {
        return this.semanticIndexUpdateTime;
    }

    public DatasetFileMetaConentUpdate setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
