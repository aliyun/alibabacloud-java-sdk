// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    /**
     * <p>An optional description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial analysis group project data development</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the development environment. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables the development environment for the workspace and isolates it from the production environment.</p>
     * </li>
     * <li><p><code>false</code>: Uses only the production environment.</p>
     * </li>
     * </ul>
     * <p><strong>Important</strong>: You cannot disable the development environment after you enable it.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <p>Specifies whether to disable the development role, which grants permissions for workflow and code editing. Valid values:</p>
     * <ul>
     * <li><p><code>false</code>: Enables the development role. This is the default value.</p>
     * </li>
     * <li><p><code>true</code>: Disables the development role.</p>
     * </li>
     * </ul>
     * <p><strong>Important</strong>: After you enable the development role (by setting this parameter to <code>false</code>), you cannot disable it.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevRoleDisabled")
    public Boolean devRoleDisabled;

    /**
     * <p>The display name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>Sora financial analysis Space</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the DataWorks workspace. To find the workspace ID, log in to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the Workspace Management page.</p>
     * <p>This parameter specifies the DataWorks workspace to use for the API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Specifies whether to enable task scheduling for Machine Learning Platform for AI (PAI). Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: You can create PAI nodes in the DataWorks workspace and run them on a schedule.</p>
     * </li>
     * <li><p><code>false</code>: Disables task scheduling for PAI.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PaiTaskEnabled")
    public Boolean paiTaskEnabled;

    /**
     * <p>Specifies whether to enable or disable the workspace. Valid values:</p>
     * <ul>
     * <li><p><code>Available</code>: Enables the workspace.</p>
     * </li>
     * <li><p><code>Forbidden</code>: Disables the workspace.</p>
     * </li>
     * </ul>
     * 
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
