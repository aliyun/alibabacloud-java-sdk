// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableLevelResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LevelId")
    public Long levelId;

    /**
     * <p>1AAE721C-F9EC-5923-BAFC-99802C4E0F21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the table level.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTableLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTableLevelResponseBody self = new CreateTableLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTableLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateTableLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTableLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTableLevelResponseBody setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public CreateTableLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTableLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
