// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DownloadPrivacyKeyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DownloadPrivacyKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadPrivacyKeyRequest self = new DownloadPrivacyKeyRequest();
        return TeaModel.build(map, self);
    }

    public DownloadPrivacyKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
