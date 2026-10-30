// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the route map.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>descname</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The direction of the route map. Valid values:</p>
     * <ul>
     * <li><strong>Inbound</strong>: inbound. The direction in which the instance route table receives routes from the associated network instance. This affects the routes that the current instance can learn from the associated network instance.</li>
     * <li><strong>Outbound</strong>: outbound. The direction in which the instance route table sends routes to the associated network instance. This affects the routes that the current instance advertises to the associated network instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Inbound</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>Specifies whether to perform a dry run on the request, including permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request. After the check is passed, the route map is directly created.</li>
     * <li><strong>true</strong>: sends a dry run request. Only the check is performed, and the route map is not created. Check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check is passed, the error code <code>DryRunOperation</code> is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the route map.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Policy priority of the route map. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>Policy priority of a route map must be unique within an Alibaba Cloud account. When a route map is executed, the system matches route map rules starting from the route map with the smallest priority value based on policy priority of the route map rules. Therefore, when you specify policy priority of a route map, make sure that policy priority meets your expected matching order.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3unpnuw****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRouteMapRequestTag> tag;

    public static CreateRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapRequest self = new CreateRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouteMapRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateRouteMapRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRouteMapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouteMapRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateRouteMapRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRouteMapRequest setTag(java.util.List<CreateRouteMapRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRouteMapRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateRouteMapRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>If you specify this parameter, it cannot be an empty string. The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>If you specify this parameter, it cannot be empty. The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to a tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRouteMapRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteMapRequestTag self = new CreateRouteMapRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRouteMapRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRouteMapRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
