// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSubscribeResponseBody extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    @NameInMap("SubscribeStatus")
    public Integer subscribeStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Version")
    public String version;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("SpecsCode")
    public String specsCode;

    @NameInMap("CreatedTime")
    public String createdTime;

    public static DescribeSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeResponseBody self = new DescribeSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public DescribeSubscribeResponseBody setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public DescribeSubscribeResponseBody setSubscribeStatus(Integer subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
        return this;
    }
    public Integer getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public DescribeSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscribeResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeSubscribeResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeSubscribeResponseBody setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeSubscribeResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeSubscribeResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeSubscribeResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeSubscribeResponseBody setSpecsCode(String specsCode) {
        this.specsCode = specsCode;
        return this;
    }
    public String getSpecsCode() {
        return this.specsCode;
    }

    public DescribeSubscribeResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

}
