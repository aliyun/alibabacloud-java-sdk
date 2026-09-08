// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateFlowlogRequest extends TeaModel {
    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the flow log.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the flow log.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The capture window duration of the flow log. Unit: seconds. Valid values: <strong>60</strong> and <strong>600</strong>. Default value: <strong>600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The string that defines custom flow log record fields. </p>
     * <p>The format is defined as:
     * <code>${field 1}${field 2}${field 3}...${field n}</code></p>
     * <ul>
     * <li>If you leave this parameter empty, all default fields are recorded.</li>
     * <li>If you specify this parameter, because <code>${srcaddr}${dstaddr}${bytes}</code> are required fields, the string must start with <code>${srcaddr}${dstaddr}${bytes}</code>. For all supported flow log fields, see <a href="https://help.aliyun.com/document_detail/339822.html">Configure a flow log</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>${srcaddr}${dstaddr}${bytes}</p>
     */
    @NameInMap("LogFormatString")
    public String logFormatString;

    /**
     * <p>The Logstore that stores the caught traffic.</p>
     * <ul>
     * <li><p>If you have already created a Logstore in the current region, enter the name of the existing Logstore.</p>
     * </li>
     * <li><p>If you have not created a Logstore in the current region, specify a custom name for the Logstore. The system automatically creates the Logstore.
     *   The naming rules for the Logstore are as follows:</p>
     * <ul>
     * <li>The Logstore name must be unique within the same project.</li>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>flowlog-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The project that stores the caught traffic.</p>
     * <ul>
     * <li><p>If you have already created a project in the current region, enter the name of the existing project.</p>
     * </li>
     * <li><p>If you have not created a project in the current region, specify a custom name for the project. The system automatically creates the project.</p>
     * <p>  The project name must be globally unique within the Alibaba Cloud region and cannot be modified after creation. The naming rules are as follows:</p>
     * <ul>
     * <li>The project name must be globally unique.</li>
     * <li>The name can contain only lowercase letters, digits, and hyphens (-).</li>
     * <li>The name must start and end with a lowercase letter or digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>flowlog-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID of the flow log.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the region ID.</p>
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
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFlowlogRequestTag> tag;

    /**
     * <p>The ID of the VPC connection, VPN connection, VBR connection, ECR connection, or inter-region connection.</p>
     * <p>Leave this parameter empty if you want to configure a flow log for a transit router instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r6g0m3epjehw57****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The transit routing instance ID.</p>
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
         * <p>The tag key of the resource.</p>
         * <p>Once specified, the tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>Once specified, the tag value cannot be empty. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
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
