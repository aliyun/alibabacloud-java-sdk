// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteBizTypeRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    public static DeleteBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizTypeRequest self = new DeleteBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBizTypeRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

}
