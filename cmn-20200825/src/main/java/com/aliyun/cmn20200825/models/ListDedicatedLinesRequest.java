// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesRequest extends TeaModel {
    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    public static ListDedicatedLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesRequest self = new ListDedicatedLinesRequest();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
