// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppAttributesRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Tag")
    public java.util.List<DescribeAppAttributesRequestTag> tag;

    public static DescribeAppAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAttributesRequest self = new DescribeAppAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppAttributesRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DescribeAppAttributesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppAttributesRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppAttributesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppAttributesRequest setEnableTagAuth(Boolean enableTagAuth) {
        this.enableTagAuth = enableTagAuth;
        return this;
    }
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    public DescribeAppAttributesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppAttributesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppAttributesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAppAttributesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeAppAttributesRequest setTag(java.util.List<DescribeAppAttributesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAppAttributesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAppAttributesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAppAttributesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAttributesRequestTag self = new DescribeAppAttributesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAppAttributesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppAttributesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
