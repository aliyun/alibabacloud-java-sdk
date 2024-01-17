// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAllBlackListRequest extends TeaModel {
    @NameInMap("BlackType")
    public String blackType;

    public static RemoveAllBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAllBlackListRequest self = new RemoveAllBlackListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAllBlackListRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

}
