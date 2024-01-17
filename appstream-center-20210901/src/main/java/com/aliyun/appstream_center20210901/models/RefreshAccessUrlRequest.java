// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RefreshAccessUrlRequest extends TeaModel {
    @NameInMap("AccessPageId")
    public String accessPageId;

    public static RefreshAccessUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAccessUrlRequest self = new RefreshAccessUrlRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAccessUrlRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

}
