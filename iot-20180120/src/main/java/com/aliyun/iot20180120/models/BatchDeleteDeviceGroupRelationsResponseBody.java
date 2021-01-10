// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsResponseBody extends TeaModel {
    @NameInMap("ValidDeviceCount")
    public Integer validDeviceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessDeviceCount")
    public Integer successDeviceCount;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("AlreadyRelatedGroupDeviceCount")
    public Integer alreadyRelatedGroupDeviceCount;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static BatchDeleteDeviceGroupRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsResponseBody self = new BatchDeleteDeviceGroupRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setValidDeviceCount(Integer validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setSuccessDeviceCount(Integer successDeviceCount) {
        this.successDeviceCount = successDeviceCount;
        return this;
    }
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public BatchDeleteDeviceGroupRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
