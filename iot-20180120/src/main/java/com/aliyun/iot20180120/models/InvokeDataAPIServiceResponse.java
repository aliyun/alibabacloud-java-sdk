// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public InvokeDataAPIServiceResponseData data;

    public static InvokeDataAPIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceResponse self = new InvokeDataAPIServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeDataAPIServiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvokeDataAPIServiceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeDataAPIServiceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InvokeDataAPIServiceResponse setData(InvokeDataAPIServiceResponseData data) {
        this.data = data;
        return this;
    }
    public InvokeDataAPIServiceResponseData getData() {
        return this.data;
    }

    public static class InvokeDataAPIServiceResponseDataFieldNameList extends TeaModel {
        // FieldNameList
        @NameInMap("FieldNameList")
        @Validation(required = true)
        public java.util.List<String> fieldNameList;

        public static InvokeDataAPIServiceResponseDataFieldNameList build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseDataFieldNameList self = new InvokeDataAPIServiceResponseDataFieldNameList();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseDataFieldNameList setFieldNameList(java.util.List<String> fieldNameList) {
            this.fieldNameList = fieldNameList;
            return this;
        }
        public java.util.List<String> getFieldNameList() {
            return this.fieldNameList;
        }

    }

    public static class InvokeDataAPIServiceResponseDataResultList extends TeaModel {
        // ResultList
        @NameInMap("ResultList")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> resultList;

        public static InvokeDataAPIServiceResponseDataResultList build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseDataResultList self = new InvokeDataAPIServiceResponseDataResultList();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseDataResultList setResultList(java.util.List<java.util.Map<String, ?>> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResultList() {
            return this.resultList;
        }

    }

    public static class InvokeDataAPIServiceResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("ApiSrn")
        @Validation(required = true)
        public String apiSrn;

        @NameInMap("FieldNameList")
        @Validation(required = true)
        public InvokeDataAPIServiceResponseDataFieldNameList fieldNameList;

        @NameInMap("ResultList")
        @Validation(required = true)
        public InvokeDataAPIServiceResponseDataResultList resultList;

        public static InvokeDataAPIServiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseData self = new InvokeDataAPIServiceResponseData();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public InvokeDataAPIServiceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public InvokeDataAPIServiceResponseData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public InvokeDataAPIServiceResponseData setFieldNameList(InvokeDataAPIServiceResponseDataFieldNameList fieldNameList) {
            this.fieldNameList = fieldNameList;
            return this;
        }
        public InvokeDataAPIServiceResponseDataFieldNameList getFieldNameList() {
            return this.fieldNameList;
        }

        public InvokeDataAPIServiceResponseData setResultList(InvokeDataAPIServiceResponseDataResultList resultList) {
            this.resultList = resultList;
            return this;
        }
        public InvokeDataAPIServiceResponseDataResultList getResultList() {
            return this.resultList;
        }

    }

}
