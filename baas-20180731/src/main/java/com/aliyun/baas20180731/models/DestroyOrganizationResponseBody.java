// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyOrganizationResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DestroyOrganizationResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DestroyOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyOrganizationResponseBody self = new DestroyOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyOrganizationResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DestroyOrganizationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DestroyOrganizationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DestroyOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DestroyOrganizationResponseBody setResult(DestroyOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DestroyOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public DestroyOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DestroyOrganizationResponseBodyResult extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static DestroyOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DestroyOrganizationResponseBodyResult self = new DestroyOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DestroyOrganizationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DestroyOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
