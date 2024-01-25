// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllSceneModelRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAllSceneModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllSceneModelRequest self = new DescribeAllSceneModelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllSceneModelRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
