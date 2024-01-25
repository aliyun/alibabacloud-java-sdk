// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTagBusinessGroupListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TagId")
    public Long tagId;

    public static GetTagBusinessGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagBusinessGroupListRequest self = new GetTagBusinessGroupListRequest();
        return TeaModel.build(map, self);
    }

    public GetTagBusinessGroupListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetTagBusinessGroupListRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

}
