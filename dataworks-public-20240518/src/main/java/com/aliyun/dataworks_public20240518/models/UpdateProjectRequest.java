// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevRoleDisabled")
    public Boolean devRoleDisabled;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PaiTaskEnabled")
    public Boolean paiTaskEnabled;

    /**
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
        this.devEnvironmentEnabled = devEnvironmentEnabled;
        return this;
    }
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    public UpdateProjectRequest setDevRoleDisabled(Boolean devRoleDisabled) {
        this.devRoleDisabled = devRoleDisabled;
        return this;
    }
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    public UpdateProjectRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateProjectRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateProjectRequest setPaiTaskEnabled(Boolean paiTaskEnabled) {
        this.paiTaskEnabled = paiTaskEnabled;
        return this;
    }
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    public UpdateProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
