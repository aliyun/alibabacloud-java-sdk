// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetUserStatusResponseBody extends TeaModel {
    // 入驻状态，0没有，1有
    @NameInMap("ApplyStatus")
    public Integer applyStatus;

    // 购买状态，0没有，1有
    @NameInMap("BuyStatus")
    public Integer buyStatus;

    @NameInMap("Code")
    public Long code;

    // 合同审核状态，0没有，1完成
    @NameInMap("ContractStatus")
    public Integer contractStatus;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 购买链接
    @NameInMap("SaleLink")
    public String saleLink;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserStatusResponseBody self = new GetUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserStatusResponseBody setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    public GetUserStatusResponseBody setBuyStatus(Integer buyStatus) {
        this.buyStatus = buyStatus;
        return this;
    }
    public Integer getBuyStatus() {
        return this.buyStatus;
    }

    public GetUserStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUserStatusResponseBody setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
        return this;
    }
    public Integer getContractStatus() {
        return this.contractStatus;
    }

    public GetUserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserStatusResponseBody setSaleLink(String saleLink) {
        this.saleLink = saleLink;
        return this;
    }
    public String getSaleLink() {
        return this.saleLink;
    }

    public GetUserStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
