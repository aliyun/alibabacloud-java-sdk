// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeWasmUserInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeWasmUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWasmUserInfoRequest self = new DescribeWasmUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWasmUserInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
