// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class MVFolderRequest extends TeaModel {
    @NameInMap("destPath")
    public String destPath;

    @NameInMap("srcPath")
    public String srcPath;

    public static MVFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        MVFolderRequest self = new MVFolderRequest();
        return TeaModel.build(map, self);
    }

    public MVFolderRequest setDestPath(String destPath) {
        this.destPath = destPath;
        return this;
    }
    public String getDestPath() {
        return this.destPath;
    }

    public MVFolderRequest setSrcPath(String srcPath) {
        this.srcPath = srcPath;
        return this;
    }
    public String getSrcPath() {
        return this.srcPath;
    }

}
