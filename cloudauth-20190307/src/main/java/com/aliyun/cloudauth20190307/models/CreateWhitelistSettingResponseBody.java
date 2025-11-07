// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF4979D3-060F-5336-BD9F-0D46ECB66B22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result, whether the creation was successful:</p>
     * <ul>
     * <li>true: Success</li>
     * <li>false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
