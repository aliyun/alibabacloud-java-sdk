// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateCloudauthstSceneResponseBody extends TeaModel {
    /**
     * <p>ID of this request</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result, indicating whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResultObject")
    public Boolean resultObject;

    public static CreateCloudauthstSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudauthstSceneResponseBody self = new CreateCloudauthstSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudauthstSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudauthstSceneResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
