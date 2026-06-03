// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class DeleteSceneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>95E6F720-6786-53BD-9982-C9A636CEA627</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:\&quot;200\&quot;,\&quot;RequestId\&quot;:\&quot;B946877A-8BDC-55AD-BE7E-85B75B2527E5\&quot;,\&quot;data\&quot;:true}</p>
     */
    @NameInMap("data")
    public String data;

    public static DeleteSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneResponseBody self = new DeleteSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSceneResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
