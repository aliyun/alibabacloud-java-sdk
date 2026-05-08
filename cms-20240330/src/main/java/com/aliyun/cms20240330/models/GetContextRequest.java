// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetContextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("formatted")
    public Boolean formatted;

    public static GetContextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextRequest self = new GetContextRequest();
        return TeaModel.build(map, self);
    }

    public GetContextRequest setFormatted(Boolean formatted) {
        this.formatted = formatted;
        return this;
    }
    public Boolean getFormatted() {
        return this.formatted;
    }

}
