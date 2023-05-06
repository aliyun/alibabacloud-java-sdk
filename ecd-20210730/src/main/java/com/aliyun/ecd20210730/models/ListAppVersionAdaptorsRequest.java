// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppVersionAdaptorsRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("VersionId")
    public Integer versionId;

    public static ListAppVersionAdaptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionAdaptorsRequest self = new ListAppVersionAdaptorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppVersionAdaptorsRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ListAppVersionAdaptorsRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
