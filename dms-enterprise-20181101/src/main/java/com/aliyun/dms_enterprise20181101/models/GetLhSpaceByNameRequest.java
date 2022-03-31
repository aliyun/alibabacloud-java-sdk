// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameRequest extends TeaModel {
    @NameInMap("SpaceName")
    public String spaceName;

    @NameInMap("Tid")
    public Long tid;

    public static GetLhSpaceByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLhSpaceByNameRequest self = new GetLhSpaceByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetLhSpaceByNameRequest setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public GetLhSpaceByNameRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
