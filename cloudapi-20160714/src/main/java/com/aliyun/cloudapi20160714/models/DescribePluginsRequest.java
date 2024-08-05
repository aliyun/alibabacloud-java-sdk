// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>a96926e82f994915a8da40a119374537</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The name of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>testPlugin</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    /**
     * <p>The business type of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>cors</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the lifecycle rule. You can specify multiple tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Key， Value</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribePluginsRequestTag> tag;

    public static DescribePluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsRequest self = new DescribePluginsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DescribePluginsRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public DescribePluginsRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public DescribePluginsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePluginsRequest setTag(java.util.List<DescribePluginsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribePluginsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribePluginsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <p>N can be an integer from 1 to 20.``</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>N can be an integer from 1 to 20.``</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot; \&quot;</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePluginsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsRequestTag self = new DescribePluginsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribePluginsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePluginsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
