// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAPSJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-bj1xxxxxx</p>
     */
    @NameInMap("ApsJobId")
    public String apsJobId;

    /**
     * <p>The operation status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned. A value of 200 indicates that the request was sent successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>OK</strong> is returned.                                </li>
     * <li>If the request is abnormal, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D1B8ED33-5E9B-512D-B188-1579ED6xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAPSJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAPSJobResponseBody self = new CreateAPSJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAPSJobResponseBody setApsJobId(String apsJobId) {
        this.apsJobId = apsJobId;
        return this;
    }
    public String getApsJobId() {
        return this.apsJobId;
    }

    public CreateAPSJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAPSJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAPSJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAPSJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAPSJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
