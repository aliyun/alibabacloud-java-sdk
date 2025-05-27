// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgQueryLoadTreeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A93073FC-1E86-58BA-AB83-54DA6BDB4F03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TreeDto")
    public String treeDto;

    public static EnterpriseOrgQueryLoadTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgQueryLoadTreeResponseBody self = new EnterpriseOrgQueryLoadTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgQueryLoadTreeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseOrgQueryLoadTreeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseOrgQueryLoadTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseOrgQueryLoadTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnterpriseOrgQueryLoadTreeResponseBody setTreeDto(String treeDto) {
        this.treeDto = treeDto;
        return this;
    }
    public String getTreeDto() {
        return this.treeDto;
    }

}
