// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PauseSessionRequest extends TeaModel {
    @NameInMap("fileSystemOnly")
    public String fileSystemOnly;

    /**
     * <p>The function alias or version associated with the session ID to save.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PauseSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseSessionRequest self = new PauseSessionRequest();
        return TeaModel.build(map, self);
    }

    public PauseSessionRequest setFileSystemOnly(String fileSystemOnly) {
        this.fileSystemOnly = fileSystemOnly;
        return this;
    }
    public String getFileSystemOnly() {
        return this.fileSystemOnly;
    }

    public PauseSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
