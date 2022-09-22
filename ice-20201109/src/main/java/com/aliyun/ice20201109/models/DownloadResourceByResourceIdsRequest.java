// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DownloadResourceByResourceIdsRequest extends TeaModel {
    @NameInMap("ResourceIds")
    public String resourceIds;

    public static DownloadResourceByResourceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadResourceByResourceIdsRequest self = new DownloadResourceByResourceIdsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadResourceByResourceIdsRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

}
