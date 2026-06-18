// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueResponseBody extends TeaModel {
    /**
     * <p>Status code. A value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of data entries.</p>
     */
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

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

    public static GetIndexCurrentValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexCurrentValueResponseBody self = new GetIndexCurrentValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexCurrentValueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIndexCurrentValueResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public GetIndexCurrentValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIndexCurrentValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexCurrentValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
