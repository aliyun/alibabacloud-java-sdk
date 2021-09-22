// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ModifyWebHostingConfigRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("IndexPath")
    public String indexPath;

    @NameInMap("ErrorPath")
    public String errorPath;

    @NameInMap("AllowedIps")
    public String allowedIps;

    public static ModifyWebHostingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebHostingConfigRequest self = new ModifyWebHostingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebHostingConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ModifyWebHostingConfigRequest setIndexPath(String indexPath) {
        this.indexPath = indexPath;
        return this;
    }
    public String getIndexPath() {
        return this.indexPath;
    }

    public ModifyWebHostingConfigRequest setErrorPath(String errorPath) {
        this.errorPath = errorPath;
        return this;
    }
    public String getErrorPath() {
        return this.errorPath;
    }

    public ModifyWebHostingConfigRequest setAllowedIps(String allowedIps) {
        this.allowedIps = allowedIps;
        return this;
    }
    public String getAllowedIps() {
        return this.allowedIps;
    }

}
