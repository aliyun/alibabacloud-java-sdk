// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetPlatformUserInfoForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>djisdpfOjofjifojfajaspsdkasdada</p>
     */
    @NameInMap("EncryptedOpenId")
    public String encryptedOpenId;

    /**
     * <strong>example:</strong>
     * <p>djisdpfOjofjifojfajaspsdkasdada</p>
     */
    @NameInMap("EncryptedUnionId")
    public String encryptedUnionId;

    /**
     * <strong>example:</strong>
     * <p>11111111111111111111111</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0320C9F4-5EDC-5355-9D7E-DF4CF6C2B3BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPlatformUserInfoForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlatformUserInfoForPartnerResponseBody self = new GetPlatformUserInfoForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlatformUserInfoForPartnerResponseBody setEncryptedOpenId(String encryptedOpenId) {
        this.encryptedOpenId = encryptedOpenId;
        return this;
    }
    public String getEncryptedOpenId() {
        return this.encryptedOpenId;
    }

    public GetPlatformUserInfoForPartnerResponseBody setEncryptedUnionId(String encryptedUnionId) {
        this.encryptedUnionId = encryptedUnionId;
        return this;
    }
    public String getEncryptedUnionId() {
        return this.encryptedUnionId;
    }

    public GetPlatformUserInfoForPartnerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetPlatformUserInfoForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPlatformUserInfoForPartnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
