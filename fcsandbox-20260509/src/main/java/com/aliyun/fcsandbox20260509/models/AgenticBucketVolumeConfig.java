// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class AgenticBucketVolumeConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>absx9f61c8a-1311999136518149-cn-hangzhou-ab-apsr</p>
     */
    @NameInMap("agenticBucket")
    public String agenticBucket;

    /**
     * <strong>example:</strong>
     * <p>bs429pop1-1311999136518149-cn-hangzhou-bs-apsr</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>/test/</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("bucketPath")
    public String bucketPath;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou-internal.aliyuncs.com">https://oss-cn-hangzhou-internal.aliyuncs.com</a>&quot;</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("readOnly")
    public Boolean readOnly;

    public static AgenticBucketVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        AgenticBucketVolumeConfig self = new AgenticBucketVolumeConfig();
        return TeaModel.build(map, self);
    }

    public AgenticBucketVolumeConfig setAgenticBucket(String agenticBucket) {
        this.agenticBucket = agenticBucket;
        return this;
    }
    public String getAgenticBucket() {
        return this.agenticBucket;
    }

    public AgenticBucketVolumeConfig setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public AgenticBucketVolumeConfig setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public AgenticBucketVolumeConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AgenticBucketVolumeConfig setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
