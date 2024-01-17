// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleasePostInstanceResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ReleaseStatus")
    public Boolean releaseStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReleasePostInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostInstanceResponseBody self = new ReleasePostInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePostInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ReleasePostInstanceResponseBody setReleaseStatus(Boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }
    public Boolean getReleaseStatus() {
        return this.releaseStatus;
    }

    public ReleasePostInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleasePostInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
