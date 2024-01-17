// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveBlackListRequest extends TeaModel {
    @NameInMap("BlackContent")
    public String blackContent;

    @NameInMap("BlackType")
    public String blackType;

    public static RemoveBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBlackListRequest self = new RemoveBlackListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBlackListRequest setBlackContent(String blackContent) {
        this.blackContent = blackContent;
        return this;
    }
    public String getBlackContent() {
        return this.blackContent;
    }

    public RemoveBlackListRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

}
