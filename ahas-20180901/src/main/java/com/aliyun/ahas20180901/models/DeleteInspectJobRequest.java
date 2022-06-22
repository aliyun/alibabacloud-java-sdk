// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteInspectJobRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    public static DeleteInspectJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectJobRequest self = new DeleteInspectJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInspectJobRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DeleteInspectJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
