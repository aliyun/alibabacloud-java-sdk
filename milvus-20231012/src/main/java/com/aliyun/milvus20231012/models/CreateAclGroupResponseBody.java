// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateAclGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;: \&quot;c-fa521a2393de4623\&quot;, \&quot;orderId\&quot;: \&quot;271129670950939\&quot;}</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>[%60wget Nds0v6lx.popscan.xaliyun.com%60]</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>BE7E95C4-10DE-5EA7-9D10-2D3E0FCCE68C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
