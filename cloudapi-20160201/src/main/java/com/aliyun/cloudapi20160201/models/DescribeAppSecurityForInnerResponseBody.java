// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityForInnerResponseBody extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppSecret")
    public String appSecret;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppSecurityForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityForInnerResponseBody self = new DescribeAppSecurityForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityForInnerResponseBody setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DescribeAppSecurityForInnerResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppSecurityForInnerResponseBody setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public DescribeAppSecurityForInnerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeAppSecurityForInnerResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeAppSecurityForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
