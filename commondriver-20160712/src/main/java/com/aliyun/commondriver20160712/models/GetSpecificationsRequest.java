// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetSpecificationsRequest extends TeaModel {
    @NameInMap("paramStr")
    public String paramStr;

    public static GetSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificationsRequest self = new GetSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public GetSpecificationsRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
