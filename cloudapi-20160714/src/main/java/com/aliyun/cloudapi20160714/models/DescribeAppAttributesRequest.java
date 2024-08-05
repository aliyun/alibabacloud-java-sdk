// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppAttributesRequest extends TeaModel {
    /**
     * <p>The AppCode of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>23552160</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>The ID of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>20112314518278</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The app key that is used to make an API call.</p>
     * 
     * <strong>example:</strong>
     * <p>203708622</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The name of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to enable tag verification.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    /**
     * <p>The extended information.</p>
     * 
     * <strong>example:</strong>
     * <p>110243810311</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The order. Valid values: asc and desc. Default value: desc.</p>
     * <ul>
     * <li>asc: The apps are displayed in ascending order of modification time.</li>
     * <li>desc: The apps are displayed in descending order of modification time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Key， Value</p>
     */
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

    public DescribeAppAttributesRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
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
        /**
         * <p>The value of tag N.</p>
         * <p>Valid values of n: <code>[1, 20]</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The key of tag N.</p>
         * <p>Valid values of n: <code>[1, 20]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot; \&quot;</p>
         */
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
