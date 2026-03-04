// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputGroupConfig extends TeaModel {
    /**
     * <p>The filename for the manifest. This parameter is only applicable when Type is set to Hls or Dash.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest</p>
     */
    @NameInMap("ManifestName")
    public String manifestName;

    /**
     * <p>The directory where all files for this output group are stored.</p>
     */
    @NameInMap("OutputFileBase")
    public MediaObject outputFileBase;

    /**
     * <p>The type of the output group. Valid values:</p>
     * <ul>
     * <li>File: Generates one or more standalone files.</li>
     * <li>Hls: Generates HLS manifests.</li>
     * <li>Dash: Generates DASH manifests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hls</p>
     */
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
