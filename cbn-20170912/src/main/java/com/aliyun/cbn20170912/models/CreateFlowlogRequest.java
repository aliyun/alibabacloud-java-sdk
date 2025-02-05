// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateFlowlogRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the flow log.</p>
     * <p>The description is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The flow log name.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The time window for collecting log data. Unit: seconds. Valid values: <strong>60</strong> and <strong>600</strong>. Default value: <strong>600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The strings that define the fields in the flow log.</p>
     * <p>Format: <code>${Field 1}${Field 2}${Field 3}...{Field n}</code></p>
     * <ul>
     * <li>If you do not configure this parameter, all fields are included in the flow log.</li>
     * <li>If you configure this parameter, start the string with <code>${srcaddr}${dstaddr}${bytes}</code> because <code>${srcaddr}${dstaddr}${bytes}</code> are required variables. For more information about the fields supported by flow logs, see <a href="https://help.aliyun.com/document_detail/339822.html">Configure a flow log</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>${srcaddr}${dstaddr}${bytes}</p>
     */
    @NameInMap("LogFormatString")
    public String logFormatString;

    /**
     * <p>The Logstore that stores the captured traffic data.</p>
     * <ul>
     * <li><p>If a Logstore is already created in the selected region, enter the name of the Logstore.</p>
     * </li>
     * <li><p>If no Logstores are created in the selected region, enter a name and the system automatically creates a Logstore. The name of the Logstore. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique in a project.</li>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length,</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowLogStore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The project that stores the captured traffic data.</p>
     * <ul>
     * <li><p>If a project is already created in the selected region, enter the name of the project.</p>
     * </li>
     * <li><p>If no projects are created in the selected region, enter a name and the system automatically creates a project.</p>
     * <p>The project name must be unique in a region. You cannot change the name after the project is created. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be globally unique.</li>
     * <li>The name can contain only lowercase letters, digits, and hyphens (-).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length,</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowLogProject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the region where the flow log is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * <p>You can specify at most 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFlowlogRequestTag> tag;

    /**
     * <p>The ID of the VPC connection, VPN connection, VBR connection, ECR connection, or inter-region connection.</p>
     * <p>If you create the flow log for a transfer router, skip this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r6g0m3epjehw57****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1rmwxnk221e3fas****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateFlowlogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowlogRequest self = new CreateFlowlogRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowlogRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateFlowlogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowlogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowlogRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public CreateFlowlogRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateFlowlogRequest setLogFormatString(String logFormatString) {
        this.logFormatString = logFormatString;
        return this;
    }
    public String getLogFormatString() {
        return this.logFormatString;
    }

    public CreateFlowlogRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateFlowlogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFlowlogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowlogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFlowlogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowlogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowlogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFlowlogRequest setTag(java.util.List<CreateFlowlogRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFlowlogRequestTag> getTag() {
        return this.tag;
    }

    public CreateFlowlogRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public CreateFlowlogRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class CreateFlowlogRequestTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length. The tag keys cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFlowlogRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowlogRequestTag self = new CreateFlowlogRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFlowlogRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFlowlogRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
