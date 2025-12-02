// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplatePositionResponseBody extends TeaModel {
    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request is successful, a <strong>SUCCESS</strong> message is returned.</li>
     * <li>If the request is abnormal, the detailed error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DC10091-348D-12B1-906D-AB49D658012E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifySqlTemplatePositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplatePositionResponseBody self = new ModifySqlTemplatePositionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplatePositionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySqlTemplatePositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySqlTemplatePositionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
