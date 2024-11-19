// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsResponseBody extends TeaModel {
    /**
     * <p>The number of devices that exist in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AlreadyRelatedGroupDeviceCount")
    public Integer alreadyRelatedGroupDeviceCount;

    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8739385E-143F-4389-B900-B7DF9174CE0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of devices that are removed from the group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessDeviceCount")
    public Integer successDeviceCount;

    /**
     * <p>The number of valid devices that you specified.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ValidDeviceCount")
    public Integer validDeviceCount;

    public static BatchDeleteDeviceGroupRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsResponseBody self = new BatchDeleteDeviceGroupRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setAlreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
        this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
        return this;
    }
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setSuccessDeviceCount(Integer successDeviceCount) {
        this.successDeviceCount = successDeviceCount;
        return this;
    }
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setValidDeviceCount(Integer validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

}
