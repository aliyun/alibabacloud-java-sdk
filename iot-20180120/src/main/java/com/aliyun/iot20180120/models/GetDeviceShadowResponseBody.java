// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceShadowResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message that is returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A56E345A-0978-4993-ACBA-3EF444ED187F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The shadow information that is returned if the call is successful.</p>
     * <blockquote>
     * <p> The structure of the shadow information varies based on the status of the device. For more information, see the <a href="https://help.aliyun.com/document_detail/53930.html">Overview</a> topic of Device shadows.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;method&quot;:&quot;update&quot;,&quot;state&quot;:{&quot;desired&quot;:{&quot;color&quot;:&quot;green&quot;}},&quot;version&quot;:1}</p>
     */
    @NameInMap("ShadowMessage")
    public String shadowMessage;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDeviceShadowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceShadowResponseBody self = new GetDeviceShadowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceShadowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceShadowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceShadowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceShadowResponseBody setShadowMessage(String shadowMessage) {
        this.shadowMessage = shadowMessage;
        return this;
    }
    public String getShadowMessage() {
        return this.shadowMessage;
    }

    public GetDeviceShadowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
