// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Boolean resultObject;

    public static CreateWhitelistSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingResponseBody self = new CreateWhitelistSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWhitelistSettingResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
