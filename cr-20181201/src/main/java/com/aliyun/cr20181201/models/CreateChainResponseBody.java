// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChainResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery chain.</p>
     * 
     * <strong>example:</strong>
     * <p>chi-02ymhtwl3cq8****</p>
     */
    @NameInMap("ChainId")
    public String chainId;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4BC03B36-E515-5806-99AC-268AE3C0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChainResponseBody self = new CreateChainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChainResponseBody setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChainResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
