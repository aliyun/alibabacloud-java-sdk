// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTrialInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-backup-oss</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The time when the file system was created. UNIX timestamp, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1607436917</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>005494</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The data source type. Only free trial information of OSS backup and NAS backup can be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static GetTrialInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrialInfoRequest self = new GetTrialInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTrialInfoRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetTrialInfoRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetTrialInfoRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetTrialInfoRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
