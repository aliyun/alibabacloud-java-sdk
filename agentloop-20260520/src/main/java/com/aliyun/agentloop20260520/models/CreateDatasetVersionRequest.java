// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The description of the version. This parameter is optional. If you do not specify this parameter, an empty string is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Dataset version used for the initial evaluation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the version to be created, which is used to identify the version within the current dataset. The name cannot be empty after leading and trailing whitespaces are removed. The length cannot exceed 128 bytes in UTF-8 encoding, and the name cannot contain forward slashes (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The optional client token that is generated and passed by the client. Do not use this token to determine whether the version is created. You can call ListDatasetVersions to query the version.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionRequest self = new CreateDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateDatasetVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
