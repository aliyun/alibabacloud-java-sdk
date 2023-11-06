// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceInternetAddressResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the activity fails.</p>
     * <br>
     * <p>>  This parameter appears only when an error occurs during the API call.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the public IP address was created.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateInstanceInternetAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInternetAddressResponseBody self = new CreateInstanceInternetAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInternetAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateInstanceInternetAddressResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateInstanceInternetAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceInternetAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
