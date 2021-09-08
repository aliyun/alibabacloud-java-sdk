// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public Boolean resultObject;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWhitelistSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingResponseBody self = new CreateWhitelistSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public CreateWhitelistSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
