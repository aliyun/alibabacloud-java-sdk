// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleaseExpiredInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReleaseStatus")
    public String releaseStatus;

    /**
     * <strong>example:</strong>
     * <p>9EC1DB0F-EE53-5D36-B5DA-71CB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReleaseExpiredInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseExpiredInstanceResponseBody self = new ReleaseExpiredInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseExpiredInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ReleaseExpiredInstanceResponseBody setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }
    public String getReleaseStatus() {
        return this.releaseStatus;
    }

    public ReleaseExpiredInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseExpiredInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
