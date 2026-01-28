// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/gcqe6nn722rw1g5/gcqe6nn722rw1g5.diff.zip?Expires=1750651377&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=55f4Rcml1vjydPgiv5c9KRdSGQo%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/gcqe6nn722rw1g5/gcqe6nn722rw1g5.diff.zip?Expires=1750651377&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=55f4Rcml1vjydPgiv5c9KRdSGQo%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("UserCode")
    public String userCode;

    public static ModifyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponseBody self = new ModifyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAppResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ModifyAppResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ModifyAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyAppResponseBody setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

}
