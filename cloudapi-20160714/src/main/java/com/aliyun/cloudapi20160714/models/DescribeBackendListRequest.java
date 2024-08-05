// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendListRequest extends TeaModel {
    /**
     * <p>The name of the backend service. You can use \* to perform fuzzy queries.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>The type of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <p>The number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of the tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeBackendListRequestTag> tag;

    public static DescribeBackendListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendListRequest self = new DescribeBackendListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackendListRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public DescribeBackendListRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public DescribeBackendListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackendListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackendListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeBackendListRequest setTag(java.util.List<DescribeBackendListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeBackendListRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeBackendListRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBackendListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendListRequestTag self = new DescribeBackendListRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeBackendListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackendListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
