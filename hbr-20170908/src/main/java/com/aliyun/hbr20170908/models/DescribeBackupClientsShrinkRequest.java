// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsShrinkRequest extends TeaModel {
    /**
     * <p>The list of backup client IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public String clientIdsShrink;

    /**
     * <p>The type of the backup client. Valid values:</p>
     * <ul>
     * <li><strong>ECS_CLIENT</strong>: ECS File Backup client.</li>
     * <li><strong>CONTAINER_CLIENT</strong>: container backup client.</li>
     * <li><strong>LOCAL_CLIENT</strong>: local NAS backup, CPFS backup, archive, or data synchronization client.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_CLIENT</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The ID of the backup cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000ge4wa61b4d337xblq</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the RAM role created in the source account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The type of cross-account backup. Valid values: </p>
     * <ul>
     * <li>SELF_ACCOUNT: backup within the current account. </li>
     * <li>CROSS_ACCOUNT: cross-account backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source account used for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>129374672382xxxx</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The query filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeBackupClientsShrinkRequestFilters> filters;

    /**
     * <p>The list of ECS instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-*********************&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag information to return.</p>
     * 
     * <strong>example:</strong>
     * <p>33738719#</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeBackupClientsShrinkRequestTag> tag;

    public static DescribeBackupClientsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsShrinkRequest self = new DescribeBackupClientsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsShrinkRequest setClientIdsShrink(String clientIdsShrink) {
        this.clientIdsShrink = clientIdsShrink;
        return this;
    }
    public String getClientIdsShrink() {
        return this.clientIdsShrink;
    }

    public DescribeBackupClientsShrinkRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeBackupClientsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupClientsShrinkRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DescribeBackupClientsShrinkRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DescribeBackupClientsShrinkRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public DescribeBackupClientsShrinkRequest setFilters(java.util.List<DescribeBackupClientsShrinkRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeBackupClientsShrinkRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeBackupClientsShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DescribeBackupClientsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupClientsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupClientsShrinkRequest setTag(java.util.List<DescribeBackupClientsShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeBackupClientsShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeBackupClientsShrinkRequestFilters extends TeaModel {
        /**
         * <p>The key of the query filter.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values to match in the query filter.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeBackupClientsShrinkRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsShrinkRequestFilters self = new DescribeBackupClientsShrinkRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsShrinkRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupClientsShrinkRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeBackupClientsShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. </li>
         * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>. </li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag value cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBackupClientsShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsShrinkRequestTag self = new DescribeBackupClientsShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupClientsShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
