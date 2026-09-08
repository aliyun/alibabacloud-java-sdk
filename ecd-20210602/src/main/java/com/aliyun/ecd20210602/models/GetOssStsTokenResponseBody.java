// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetOssStsTokenResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>STS.NZeNA1kdCm4QPuAJ9kN******</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The STS temporary AccessKey secret.</p>
     * 
     * <strong>example:</strong>
     * <p>9EStV7fgkSQsPuBi576EmNQXLxJGddL2EGyX********</p>
     */
    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    /**
     * <p>The logical OSS bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-wy-*****</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The project storage path.</p>
     */
    @NameInMap("ObjectKeyPrefix")
    public String objectKeyPrefix;

    /**
     * <p>The region to which the current OSS bucket belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou</p>
     */
    @NameInMap("OssRegion")
    public String ossRegion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Security Token Service (STS) token.</p>
     * 
     * <strong>example:</strong>
     * <p>CAISvAN1q6Ft5B2yfSjIr5n2Bez81ZRTgqOGZn6FkHBnXf9qgI6apjz2IH*******</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    public static GetOssStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssStsTokenResponseBody self = new GetOssStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssStsTokenResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetOssStsTokenResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GetOssStsTokenResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetOssStsTokenResponseBody setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
        return this;
    }
    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    public GetOssStsTokenResponseBody setOssRegion(String ossRegion) {
        this.ossRegion = ossRegion;
        return this;
    }
    public String getOssRegion() {
        return this.ossRegion;
    }

    public GetOssStsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssStsTokenResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
