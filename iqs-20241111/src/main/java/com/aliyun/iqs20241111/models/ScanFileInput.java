// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScanFileInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wrwqr</p>
     */
    @NameInMap("imageBase64")
    public String imageBase64;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.1241.png">https://www.1241.png</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("scanFileInputConfig")
    public ScanFileInputConfig scanFileInputConfig;

    public static ScanFileInput build(java.util.Map<String, ?> map) throws Exception {
        ScanFileInput self = new ScanFileInput();
        return TeaModel.build(map, self);
    }

    public ScanFileInput setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public ScanFileInput setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ScanFileInput setScanFileInputConfig(ScanFileInputConfig scanFileInputConfig) {
        this.scanFileInputConfig = scanFileInputConfig;
        return this;
    }
    public ScanFileInputConfig getScanFileInputConfig() {
        return this.scanFileInputConfig;
    }

}
