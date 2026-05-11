// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class VerifyAddressResp extends TeaModel {
    /**
     * <p>Data verification error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Data validation error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid argument.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The status of the data address verification.</p>
     * 
     * <strong>example:</strong>
     * <p>avaliable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the data address is verified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01T12:00:00.000Z</p>
     */
    @NameInMap("VerifyTime")
    public String verifyTime;

    public static VerifyAddressResp build(java.util.Map<String, ?> map) throws Exception {
        VerifyAddressResp self = new VerifyAddressResp();
        return TeaModel.build(map, self);
    }

    public VerifyAddressResp setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public VerifyAddressResp setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public VerifyAddressResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerifyAddressResp setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime;
        return this;
    }
    public String getVerifyTime() {
        return this.verifyTime;
    }

}
