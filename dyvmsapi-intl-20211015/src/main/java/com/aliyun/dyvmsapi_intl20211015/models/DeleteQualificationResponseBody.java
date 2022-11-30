// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteQualificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQualificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualificationResponseBody self = new DeleteQualificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQualificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteQualificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteQualificationResponseBody setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public DeleteQualificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
