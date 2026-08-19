// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsRequest extends TeaModel {
    /**
     * <p>The list of backup client IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public java.util.List<String> clientIds;

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
    public java.util.List<DescribeBackupClientsRequestFilters> filters;

    /**
     * <p>The list of ECS instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-*********************&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
    public java.util.List<DescribeBackupClientsRequestTag> tag;

    public static DescribeBackupClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsRequest self = new DescribeBackupClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsRequest setClientIds(java.util.List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public java.util.List<String> getClientIds() {
        return this.clientIds;
    }

    public DescribeBackupClientsRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeBackupClientsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupClientsRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DescribeBackupClientsRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DescribeBackupClientsRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public DescribeBackupClientsRequest setFilters(java.util.List<DescribeBackupClientsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeBackupClientsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeBackupClientsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeBackupClientsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupClientsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupClientsRequest setTag(java.util.List<DescribeBackupClientsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeBackupClientsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeBackupClientsRequestFilters extends TeaModel {
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

        public static DescribeBackupClientsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsRequestFilters self = new DescribeBackupClientsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupClientsRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeBackupClientsRequestTag extends TeaModel {
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

        public static DescribeBackupClientsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsRequestTag self = new DescribeBackupClientsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupClientsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
