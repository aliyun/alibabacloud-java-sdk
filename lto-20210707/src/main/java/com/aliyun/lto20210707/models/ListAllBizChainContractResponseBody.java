// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainContractResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllBizChainContractResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllBizChainContractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainContractResponseBody self = new ListAllBizChainContractResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainContractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllBizChainContractResponseBody setData(java.util.List<ListAllBizChainContractResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllBizChainContractResponseBodyData> getData() {
        return this.data;
    }

    public ListAllBizChainContractResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllBizChainContractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllBizChainContractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllBizChainContractResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllBizChainContractResponseBodyData extends TeaModel {
        @NameInMap("ContractName")
        public String contractName;

        @NameInMap("ContractTemplateId")
        public String contractTemplateId;

        @NameInMap("InvokeType")
        public String invokeType;

        public static ListAllBizChainContractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllBizChainContractResponseBodyData self = new ListAllBizChainContractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllBizChainContractResponseBodyData setContractName(String contractName) {
            this.contractName = contractName;
            return this;
        }
        public String getContractName() {
            return this.contractName;
        }

        public ListAllBizChainContractResponseBodyData setContractTemplateId(String contractTemplateId) {
            this.contractTemplateId = contractTemplateId;
            return this;
        }
        public String getContractTemplateId() {
            return this.contractTemplateId;
        }

        public ListAllBizChainContractResponseBodyData setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

    }

}
