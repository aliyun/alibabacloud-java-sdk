// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>descriptiontest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterPolicyTableRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf654ttymmljlvh2x****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTransitRouterPolicyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyTableRequest self = new CreateTransitRouterPolicyTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterPolicyTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTransitRouterPolicyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterPolicyTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTransitRouterPolicyTableRequest setTag(java.util.List<CreateTransitRouterPolicyTableRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterPolicyTableRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterPolicyTableRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class CreateTransitRouterPolicyTableRequestTag extends TeaModel {
        public static CreateTransitRouterPolicyTableRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterPolicyTableRequestTag self = new CreateTransitRouterPolicyTableRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
