// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("Description")
    public String description;

    public static UpdateBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeRequest self = new UpdateBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public UpdateBizTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
