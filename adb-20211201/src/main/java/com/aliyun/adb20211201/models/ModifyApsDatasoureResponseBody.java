// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsDatasoureResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of resource group information.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The HTTP status code returned. A status code of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The execution result of the application suggestion. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>SUCCESS</strong> is returned. </li>
     * <li>If the request is abnormal, the specific error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A3EB3BCD-D974-52D4-B75C-BB06505916CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyApsDatasoureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsDatasoureResponseBody self = new ModifyApsDatasoureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApsDatasoureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyApsDatasoureResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyApsDatasoureResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyApsDatasoureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyApsDatasoureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyApsDatasoureResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
