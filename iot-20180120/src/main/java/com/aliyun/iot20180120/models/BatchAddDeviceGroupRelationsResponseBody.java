// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlreadyRelatedGroupDeviceCount")
    public Integer alreadyRelatedGroupDeviceCount;

    /**
     * <p>The number of valid devices that you specified.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of devices that exist in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExceedTenGroupDeviceCount")
    public Integer exceedTenGroupDeviceCount;

    /**
     * <p>The number of the specified devices that are added to 10 or more groups. You can add a device to a maximum of 10 groups.</p>
     * 
     * <strong>example:</strong>
     * <p>671D0F8F-FDC7-4B12-93FA-336C079C965A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessAddedDeviceCount")
    public Integer successAddedDeviceCount;

    /**
     * <p>The number of devices that are added to the group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ValidDeviceCount")
    public Integer validDeviceCount;

    public static BatchAddDeviceGroupRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsResponseBody self = new BatchAddDeviceGroupRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsResponseBody setAlreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
        this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
        return this;
    }
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchAddDeviceGroupRelationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchAddDeviceGroupRelationsResponseBody setExceedTenGroupDeviceCount(Integer exceedTenGroupDeviceCount) {
        this.exceedTenGroupDeviceCount = exceedTenGroupDeviceCount;
        return this;
    }
    public Integer getExceedTenGroupDeviceCount() {
        return this.exceedTenGroupDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAddDeviceGroupRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchAddDeviceGroupRelationsResponseBody setSuccessAddedDeviceCount(Integer successAddedDeviceCount) {
        this.successAddedDeviceCount = successAddedDeviceCount;
        return this;
    }
    public Integer getSuccessAddedDeviceCount() {
        return this.successAddedDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setValidDeviceCount(Integer validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

}
