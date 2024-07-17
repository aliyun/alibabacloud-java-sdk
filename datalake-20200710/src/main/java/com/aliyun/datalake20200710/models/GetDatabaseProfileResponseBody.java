// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseProfileResponseBody extends TeaModel {
    /**
     * <p>Code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;FileCnt&quot;: 213,
     *     &quot;FileSize&quot;: 34324
     * }</p>
     */
    @NameInMap("DatabaseProfile")
    public DatabaseProfile databaseProfile;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>AEA7DCC8-DBF5-561B-A7FD-0747D7D51FEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseProfileResponseBody self = new GetDatabaseProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseProfileResponseBody setDatabaseProfile(DatabaseProfile databaseProfile) {
        this.databaseProfile = databaseProfile;
        return this;
    }
    public DatabaseProfile getDatabaseProfile() {
        return this.databaseProfile;
    }

    public GetDatabaseProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatabaseProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
