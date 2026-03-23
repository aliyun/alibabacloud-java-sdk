// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class KickAntStaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;totalPv&quot;: 535,
     *       &quot;totalUv&quot;: 246,
     *       &quot;detailVo&quot;: [
     * {
     * &quot;uv&quot;:17,
     * &quot;pv&quot;:56,
     * &quot;ds&quot;:&quot;20230710&quot;
     * }
     * ]
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>the status of ap is not online</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>76F569F1-078E-5A08-881D-810B97C502A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KickAntStaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KickAntStaResponseBody self = new KickAntStaResponseBody();
        return TeaModel.build(map, self);
    }

    public KickAntStaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public KickAntStaResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public KickAntStaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public KickAntStaResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public KickAntStaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
