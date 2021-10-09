// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportScreenRequest extends TeaModel {
    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssObjectKey")
    public String ossObjectKey;

    public static ReportScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportScreenRequest self = new ReportScreenRequest();
        return TeaModel.build(map, self);
    }

    public ReportScreenRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public ReportScreenRequest setOssObjectKey(String ossObjectKey) {
        this.ossObjectKey = ossObjectKey;
        return this;
    }
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

}
