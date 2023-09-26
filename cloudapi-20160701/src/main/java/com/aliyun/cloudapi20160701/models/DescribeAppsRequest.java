// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

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

    @NameInMap("Tag")
    public java.util.List<DescribeAppsRequestTag> tag;

    public static DescribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsRequest self = new DescribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppsRequest setEnableTagAuth(Boolean enableTagAuth) {
        this.enableTagAuth = enableTagAuth;
        return this;
    }
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    public DescribeAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAppsRequest setTag(java.util.List<DescribeAppsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAppsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAppsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAppsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsRequestTag self = new DescribeAppsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAppsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
