// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("Code")
    public String code;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VersionAdaptNum")
    public Long versionAdaptNum;

    @NameInMap("VersionTotalNum")
    public Long versionTotalNum;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAppResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAppResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAppResponseBody setVersionAdaptNum(Long versionAdaptNum) {
        this.versionAdaptNum = versionAdaptNum;
        return this;
    }
    public Long getVersionAdaptNum() {
        return this.versionAdaptNum;
    }

    public GetAppResponseBody setVersionTotalNum(Long versionTotalNum) {
        this.versionTotalNum = versionTotalNum;
        return this;
    }
    public Long getVersionTotalNum() {
        return this.versionTotalNum;
    }

}
