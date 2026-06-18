// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentStatusResponseBody extends TeaModel {
    /**
     * <p>Status code. A value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Agent status. Valid values:  </p>
     * <ul>
     * <li><strong>Offline</strong>  </li>
     * <li><strong>Idle</strong>  </li>
     * <li><strong>Post-processing</strong>  </li>
     * <li><strong>In Call</strong>  </li>
     * <li><strong>Break - Rest</strong>  </li>
     * <li><strong>Break - Meal</strong>  </li>
     * <li><strong>Break - Meeting</strong>  </li>
     * <li><strong>Break - Training</strong>  </li>
     * <li><strong>Break - Coaching</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>通话中</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.  </li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentStatusResponseBody self = new GetHotlineAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineAgentStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotlineAgentStatusResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHotlineAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineAgentStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
