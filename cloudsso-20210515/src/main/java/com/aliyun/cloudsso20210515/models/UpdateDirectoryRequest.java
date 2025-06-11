// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateDirectoryRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new name of the directory. The name must be globally unique.</p>
     * <p>The name can contain lowercase letters, digits, and hyphens (-). The name cannot start or end with a hyphen (-) and cannot contain two consecutive hyphens (-). If you want the new name of the directory to start with <code>d-</code>, you must set this parameter to the ID of the directory.</p>
     * <p>The name must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>new-example</p>
     */
    @NameInMap("NewDirectoryName")
    public String newDirectoryName;

    public static UpdateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryRequest self = new UpdateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateDirectoryRequest setNewDirectoryName(String newDirectoryName) {
        this.newDirectoryName = newDirectoryName;
        return this;
    }
    public String getNewDirectoryName() {
        return this.newDirectoryName;
    }

}
