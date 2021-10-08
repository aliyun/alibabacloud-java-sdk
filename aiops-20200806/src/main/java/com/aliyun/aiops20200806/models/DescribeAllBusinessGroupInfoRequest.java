// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllBusinessGroupInfoRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAllBusinessGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllBusinessGroupInfoRequest self = new DescribeAllBusinessGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllBusinessGroupInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
