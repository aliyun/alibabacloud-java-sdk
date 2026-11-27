// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The extended attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;language&quot;:&quot;java&quot;}</p>
     */
    @NameInMap("attributes")
    public String attributes;

    /**
     * <p>The service description. This parameter is valid only when serviceType is set to RUM.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name. This parameter is valid only when serviceType is set to RUM.</p>
     * 
     * <strong>example:</strong>
     * <p>api-monitor-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The service status. This parameter is valid only when serviceType is set to RUM.</p>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("serviceStatus")
    public String serviceStatus;

    /**
     * <p>Specifies whether to perform a dry run of the request. Valid values: true: sends a check request and does not perform the actual operation. false: sends a normal request. Default value: false.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateServiceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateServiceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public UpdateServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
