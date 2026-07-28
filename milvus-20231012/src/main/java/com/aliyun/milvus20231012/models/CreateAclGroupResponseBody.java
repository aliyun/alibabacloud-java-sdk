// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateAclGroupResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial. This parameter is returned only if a request is denied due to insufficient RAM permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The data returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;: \&quot;c-fa521a2393de4623\&quot;, \&quot;orderId\&quot;: \&quot;271129670950939\&quot;}</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>[%60wget Nds0v6lx.popscan.xaliyun.com%60]</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique ID generated for the request. Use this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>BE7E95C4-10DE-5EA7-9D10-2D3E0FCCE68C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates if the request succeeded, where a value of <code>true</code> means success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateAclGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAclGroupResponseBody self = new CreateAclGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAclGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAclGroupResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateAclGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateAclGroupResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateAclGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAclGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAclGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
