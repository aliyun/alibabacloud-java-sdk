// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeDataByQueryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <ul>
     * <li>2XX: The request was successful.</li>
     * <li>3XX: A redirection message was returned.</li>
     * <li>4XX: The request was invalid.</li>
     * <li>5XX: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The Browser Monitoring data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;total&quot;:0,&quot;auth&quot;:false,&quot;pageSize&quot;:20,&quot;completed&quot;:true,&quot;page&quot;:1,&quot;items&quot;:[]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A0CEDF1-06FE-44AC-8E21-21A5BE65****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRetcodeDataByQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeDataByQueryResponseBody self = new GetRetcodeDataByQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeDataByQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRetcodeDataByQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetRetcodeDataByQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRetcodeDataByQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRetcodeDataByQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
