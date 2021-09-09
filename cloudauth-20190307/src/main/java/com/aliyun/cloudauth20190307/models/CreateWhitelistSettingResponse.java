// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public Boolean resultObject;

    public static CreateWhitelistSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingResponse self = new CreateWhitelistSettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWhitelistSettingResponse setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
