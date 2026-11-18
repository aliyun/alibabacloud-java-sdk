// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ImportDriveResponseBody extends TeaModel {
    /**
     * <p>The modification result. A value of <code>success</code> indicates success. Otherwise, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Response code. 200 indicates success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The newly created or reused target drive ID. A success response only indicates that the import task has been accepted.</p>
     * 
     * <strong>example:</strong>
     * <p>dri-aaaa****</p>
     */
    @NameInMap("DriveId")
    public String driveId;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Response message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A87DBB05-653A-5E4B-B72B-5F4A1E07****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDriveResponseBody self = new ImportDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDriveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportDriveResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ImportDriveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportDriveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDriveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
