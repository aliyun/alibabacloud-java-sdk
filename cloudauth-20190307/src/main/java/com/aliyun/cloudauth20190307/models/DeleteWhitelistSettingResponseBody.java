// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Boolean resultObject;

    public static DeleteWhitelistSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistSettingResponseBody self = new DeleteWhitelistSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWhitelistSettingResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
