// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInfo extends TeaModel {
    @NameInMap("ossBucketName")
    public String ossBucketName;

    @NameInMap("ossObjectName")
    public String ossObjectName;

    public static CodeInfo build(java.util.Map<String, ?> map) throws Exception {
        CodeInfo self = new CodeInfo();
        return TeaModel.build(map, self);
    }

    public CodeInfo setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CodeInfo setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

}
