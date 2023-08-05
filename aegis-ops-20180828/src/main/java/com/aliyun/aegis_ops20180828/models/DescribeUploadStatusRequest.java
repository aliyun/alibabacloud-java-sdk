// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeUploadStatusRequest extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("OssMd5")
    public String ossMd5;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UnZip")
    public Boolean unZip;

    public static DescribeUploadStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadStatusRequest self = new DescribeUploadStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUploadStatusRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public DescribeUploadStatusRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public DescribeUploadStatusRequest setOssMd5(String ossMd5) {
        this.ossMd5 = ossMd5;
        return this;
    }
    public String getOssMd5() {
        return this.ossMd5;
    }

    public DescribeUploadStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeUploadStatusRequest setUnZip(Boolean unZip) {
        this.unZip = unZip;
        return this;
    }
    public Boolean getUnZip() {
        return this.unZip;
    }

}
