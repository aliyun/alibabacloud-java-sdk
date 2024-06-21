// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the destination cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-8e8e9060</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination version number.</p>
     * <blockquote>
     * <p>You must call the GetImage operation to obtain the maximum destination version number that corresponds to MaxVersionCode.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZooKeeper_3_5_5</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateImageRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
