// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindLicenseProductResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the license was unbound from the product.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4F94B97-1D64-4080-BFD2-67461667AA43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnbindLicenseProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindLicenseProductResponseBody self = new UnbindLicenseProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindLicenseProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindLicenseProductResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UnbindLicenseProductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnbindLicenseProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindLicenseProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
