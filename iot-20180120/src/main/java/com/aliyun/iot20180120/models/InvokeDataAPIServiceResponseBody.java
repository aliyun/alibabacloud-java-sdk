// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InvokeDataAPIServiceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InvokeDataAPIServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceResponseBody self = new InvokeDataAPIServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeDataAPIServiceResponseBody setData(InvokeDataAPIServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeDataAPIServiceResponseBodyData getData() {
        return this.data;
    }

    public InvokeDataAPIServiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InvokeDataAPIServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeDataAPIServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InvokeDataAPIServiceResponseBodyDataFieldNameList extends TeaModel {
        @NameInMap("FieldNameList")
        public java.util.List<String> fieldNameList;

        public static InvokeDataAPIServiceResponseBodyDataFieldNameList build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseBodyDataFieldNameList self = new InvokeDataAPIServiceResponseBodyDataFieldNameList();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseBodyDataFieldNameList setFieldNameList(java.util.List<String> fieldNameList) {
            this.fieldNameList = fieldNameList;
            return this;
        }
        public java.util.List<String> getFieldNameList() {
            return this.fieldNameList;
        }

    }

    public static class InvokeDataAPIServiceResponseBodyDataResultList extends TeaModel {
        @NameInMap("ResultList")
        public java.util.List<java.util.Map<String, ?>> resultList;

        public static InvokeDataAPIServiceResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseBodyDataResultList self = new InvokeDataAPIServiceResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseBodyDataResultList setResultList(java.util.List<java.util.Map<String, ?>> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResultList() {
            return this.resultList;
        }

    }

    public static class InvokeDataAPIServiceResponseBodyData extends TeaModel {
        @NameInMap("ApiSrn")
        public String apiSrn;

        @NameInMap("FieldNameList")
        public InvokeDataAPIServiceResponseBodyDataFieldNameList fieldNameList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultList")
        public InvokeDataAPIServiceResponseBodyDataResultList resultList;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static InvokeDataAPIServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceResponseBodyData self = new InvokeDataAPIServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceResponseBodyData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public InvokeDataAPIServiceResponseBodyData setFieldNameList(InvokeDataAPIServiceResponseBodyDataFieldNameList fieldNameList) {
            this.fieldNameList = fieldNameList;
            return this;
        }
        public InvokeDataAPIServiceResponseBodyDataFieldNameList getFieldNameList() {
            return this.fieldNameList;
        }

        public InvokeDataAPIServiceResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public InvokeDataAPIServiceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public InvokeDataAPIServiceResponseBodyData setResultList(InvokeDataAPIServiceResponseBodyDataResultList resultList) {
            this.resultList = resultList;
            return this;
        }
        public InvokeDataAPIServiceResponseBodyDataResultList getResultList() {
            return this.resultList;
        }

        public InvokeDataAPIServiceResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
