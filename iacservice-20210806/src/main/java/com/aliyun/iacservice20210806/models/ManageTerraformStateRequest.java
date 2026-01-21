// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ManageTerraformStateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Import</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stack-as11xxxxxxxxx:developmentA</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxx</p>
     */
    @NameInMap("importResourceId")
    public String importResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc:alicloud_vswitch.vswitches[0]</p>
     */
    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("type")
    public String type;

    public static ManageTerraformStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageTerraformStateRequest self = new ManageTerraformStateRequest();
        return TeaModel.build(map, self);
    }

    public ManageTerraformStateRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ManageTerraformStateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ManageTerraformStateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ManageTerraformStateRequest setImportResourceId(String importResourceId) {
        this.importResourceId = importResourceId;
        return this;
    }
    public String getImportResourceId() {
        return this.importResourceId;
    }

    public ManageTerraformStateRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public ManageTerraformStateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
