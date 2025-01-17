// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupConfig extends TeaModel {
    @NameInMap("ManifestName")
    public String manifestName;

    @NameInMap("OutputFileBase")
    public MediaObject outputFileBase;

    @NameInMap("Type")
    public String type;

    public static MediaConvertOutputGroupConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutputGroupConfig self = new MediaConvertOutputGroupConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutputGroupConfig setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public MediaConvertOutputGroupConfig setOutputFileBase(MediaObject outputFileBase) {
        this.outputFileBase = outputFileBase;
        return this;
    }
    public MediaObject getOutputFileBase() {
        return this.outputFileBase;
    }

    public MediaConvertOutputGroupConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
