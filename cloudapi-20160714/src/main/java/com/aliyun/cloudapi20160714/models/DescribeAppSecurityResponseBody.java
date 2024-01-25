// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityResponseBody extends TeaModel {
    /**
     * <p>The AppCode of the app.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>The key of the app.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The password of the app.</p>
     */
    @NameInMap("AppSecret")
    public String appSecret;

    /**
     * <p>The creation time (UTC) of the key, which is the same as the app creation time.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The modification time (UTC) of the key.</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppSecurityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityResponseBody self = new DescribeAppSecurityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityResponseBody setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DescribeAppSecurityResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppSecurityResponseBody setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public DescribeAppSecurityResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeAppSecurityResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeAppSecurityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
