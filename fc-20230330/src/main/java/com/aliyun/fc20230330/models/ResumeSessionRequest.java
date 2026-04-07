// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResumeSessionRequest extends TeaModel {
    @NameInMap("fileSystemOnly")
    public Boolean fileSystemOnly;

    /**
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static ResumeSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeSessionRequest self = new ResumeSessionRequest();
        return TeaModel.build(map, self);
    }

    public ResumeSessionRequest setFileSystemOnly(Boolean fileSystemOnly) {
        this.fileSystemOnly = fileSystemOnly;
        return this;
    }
    public Boolean getFileSystemOnly() {
        return this.fileSystemOnly;
    }

    public ResumeSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
