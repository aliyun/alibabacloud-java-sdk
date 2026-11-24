// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRecordResponseBody extends TeaModel {
    /**
     * <p>The build record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crbr-ly77w5i3t31f****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The return code of the API operation. A value of 200 indicates success. Other values indicate error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBuildRecordByRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRecordResponseBody self = new CreateBuildRecordByRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBuildRecordByRecordResponseBody setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public CreateBuildRecordByRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBuildRecordByRecordResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateBuildRecordByRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
