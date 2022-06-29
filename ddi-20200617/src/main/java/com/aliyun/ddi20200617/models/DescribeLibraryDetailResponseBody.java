// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryDetailResponseBody extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("LibraryVersion")
    public String libraryVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("Properties")
    public String properties;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SourceLocation")
    public String sourceLocation;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    public static DescribeLibraryDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryDetailResponseBody self = new DescribeLibraryDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryDetailResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeLibraryDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeLibraryDetailResponseBody setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
        return this;
    }
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    public DescribeLibraryDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeLibraryDetailResponseBody setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public DescribeLibraryDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLibraryDetailResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeLibraryDetailResponseBody setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    public DescribeLibraryDetailResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeLibraryDetailResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeLibraryDetailResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
