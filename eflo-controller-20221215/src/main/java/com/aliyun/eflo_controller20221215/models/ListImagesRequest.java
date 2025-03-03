// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>Architecture</p>
     * 
     * <strong>example:</strong>
     * <p>x86_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Image version</p>
     * 
     * <strong>example:</strong>
     * <p>7.9</p>
     */
    @NameInMap("ImageVersion")
    public String imageVersion;

    /**
     * <p>Platform</p>
     * 
     * <strong>example:</strong>
     * <p>ALinux3</p>
     */
    @NameInMap("Platform")
    public String platform;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ListImagesRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

    public ListImagesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
