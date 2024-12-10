// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of HBR clients.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public String clientIdsShrink;

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
    public String instanceIdsShrink;

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

    public static class DescribeBackupClientsShrinkRequestTag extends TeaModel {
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
