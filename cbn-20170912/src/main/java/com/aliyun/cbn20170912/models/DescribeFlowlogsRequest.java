// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeFlowlogsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore where the flow log is stored.</p>
     * <br>
     * <p>The name must be 3 to 63 characters in length, and can contain lowercase letters, digits, underscores (\_), and hyphens (-). It must start or end with a lowercase letter or a digit.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The name of the flow log.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the project where the flow log is stored.</p>
     * <br>
     * <p>The name must be 3 to 63 characters in length, and can contain lowercase letters, digits, and hyphens (-). It must start or end with a lowercase letter or a digit.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The description of the flow log.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The information about the tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The tag key.</p>
     * <br>
     * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>You can specify at most 20 tag keys.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the flow log. Valid values:</p>
     * <br>
     * <p>*   **Active**: The flow log is enabled.</p>
     * <p>*   **Inactive**: The flow log is disabled.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the flow log.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of entries to return on each page. Minimum value: **1**. Default value: **20**.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag value.</p>
     * <br>
     * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeFlowlogsRequestTag> tag;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static DescribeFlowlogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowlogsRequest self = new DescribeFlowlogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowlogsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeFlowlogsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeFlowlogsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowlogsRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public DescribeFlowlogsRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public DescribeFlowlogsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeFlowlogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeFlowlogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeFlowlogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowlogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowlogsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeFlowlogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowlogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeFlowlogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeFlowlogsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowlogsRequest setTag(java.util.List<DescribeFlowlogsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFlowlogsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeFlowlogsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static class DescribeFlowlogsRequestTag extends TeaModel {
        /**
         * <p>The ID of the network instance connection.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The response.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowlogsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsRequestTag self = new DescribeFlowlogsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowlogsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
