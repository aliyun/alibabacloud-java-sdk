// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleByProductResponse extends TeaModel {
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
    public java.util.List<ListOTAModuleByProductResponseData> data;

    public static ListOTAModuleByProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleByProductResponse self = new ListOTAModuleByProductResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleByProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAModuleByProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAModuleByProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAModuleByProductResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAModuleByProductResponse setData(java.util.List<ListOTAModuleByProductResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOTAModuleByProductResponseData> getData() {
        return this.data;
    }

    public static class ListOTAModuleByProductResponseData extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        public static ListOTAModuleByProductResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleByProductResponseData self = new ListOTAModuleByProductResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleByProductResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAModuleByProductResponseData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAModuleByProductResponseData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListOTAModuleByProductResponseData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListOTAModuleByProductResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOTAModuleByProductResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
