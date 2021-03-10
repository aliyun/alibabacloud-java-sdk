// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ValidDeviceCount")
    @Validation(required = true)
    public Integer validDeviceCount;

    @NameInMap("AlreadyRelatedGroupDeviceCount")
    @Validation(required = true)
    public Integer alreadyRelatedGroupDeviceCount;

    @NameInMap("SuccessDeviceCount")
    @Validation(required = true)
    public Integer successDeviceCount;

    public static BatchDeleteDeviceGroupRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsResponse self = new BatchDeleteDeviceGroupRelationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDeviceGroupRelationsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchDeleteDeviceGroupRelationsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteDeviceGroupRelationsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchDeleteDeviceGroupRelationsResponse setValidDeviceCount(Integer validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponse setAlreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
        this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
        return this;
    }
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    public BatchDeleteDeviceGroupRelationsResponse setSuccessDeviceCount(Integer successDeviceCount) {
        this.successDeviceCount = successDeviceCount;
        return this;
    }
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }

}
