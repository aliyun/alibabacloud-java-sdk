// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByOSSRequest extends TeaModel {
    @NameInMap("bucketName")
    public String bucketName;

    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>oss endpoint</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("objectName")
    public String objectName;

    @NameInMap("type")
    public String type;

    public static UploadFileByOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByOSSRequest self = new UploadFileByOSSRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileByOSSRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public UploadFileByOSSRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UploadFileByOSSRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UploadFileByOSSRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public UploadFileByOSSRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
