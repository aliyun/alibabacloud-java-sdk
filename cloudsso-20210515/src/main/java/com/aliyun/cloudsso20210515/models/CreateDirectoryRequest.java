// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateDirectoryRequest extends TeaModel {
    /**
     * <p>The name of the directory. The name must be globally unique.</p>
     * <p>Format: The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-) and cannot contain two consecutive hyphens (-). It cannot start with <code>d-</code>.</p>
     * <p>Length: 2 to 64 characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically generates a name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    public static CreateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectoryRequest self = new CreateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

}
