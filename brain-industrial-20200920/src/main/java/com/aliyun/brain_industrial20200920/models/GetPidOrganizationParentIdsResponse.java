// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidOrganizationParentIdsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("OrganizationIdList")
    @Validation(required = true)
    public java.util.List<String> organizationIdList;

    public static GetPidOrganizationParentIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPidOrganizationParentIdsResponse self = new GetPidOrganizationParentIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetPidOrganizationParentIdsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPidOrganizationParentIdsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPidOrganizationParentIdsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPidOrganizationParentIdsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPidOrganizationParentIdsResponse setOrganizationIdList(java.util.List<String> organizationIdList) {
        this.organizationIdList = organizationIdList;
        return this;
    }
    public java.util.List<String> getOrganizationIdList() {
        return this.organizationIdList;
    }

}
