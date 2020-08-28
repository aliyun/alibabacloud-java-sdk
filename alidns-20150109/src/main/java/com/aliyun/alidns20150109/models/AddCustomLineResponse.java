// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LineId")
    @Validation(required = true)
    public Long lineId;

    @NameInMap("LineCode")
    @Validation(required = true)
    public String lineCode;

    public static AddCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponse self = new AddCustomLineResponse();
        return TeaModel.build(map, self);
    }

}
