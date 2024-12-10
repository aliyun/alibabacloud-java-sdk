// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsRequest extends TeaModel {
    /**
     * <p>The IDs of HBR clients.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public java.util.List<String> clientIds;

    /**
     * <p>The type of the HBR client. Valid values:</p>
     * <ul>
     * <li><strong>ECS_CLIENT</strong>: HBR client for Elastic Compute Service (ECS) file backup</li>
     * <li><strong>CONTAINER_CLIENT</strong>: HBR client for container backup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_CLIENT</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The ID of the cluster for the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000ge4wa61b4d337xblq</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
     * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>129374672382xxxx</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The IDs of ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-*********************&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tags.</p>
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

    public static class DescribeBackupClientsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
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
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
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
