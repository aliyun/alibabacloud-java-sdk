// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAclGroupCidrsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>[RDS%22]</p>
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
     * <p>CB356AEE-6B3F-5FC8-9C2C-7B2D881EA9E2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateAclGroupCidrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclGroupCidrsResponseBody self = new UpdateAclGroupCidrsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAclGroupCidrsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateAclGroupCidrsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateAclGroupCidrsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateAclGroupCidrsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public UpdateAclGroupCidrsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAclGroupCidrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAclGroupCidrsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
