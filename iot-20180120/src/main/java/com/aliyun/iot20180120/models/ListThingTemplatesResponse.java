// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesResponse extends TeaModel {
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
    public java.util.List<ListThingTemplatesResponseData> data;

    public static ListThingTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListThingTemplatesResponse self = new ListThingTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListThingTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListThingTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingTemplatesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingTemplatesResponse setData(java.util.List<ListThingTemplatesResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListThingTemplatesResponseData> getData() {
        return this.data;
    }

    public static class ListThingTemplatesResponseData extends TeaModel {
        @NameInMap("CategoryKey")
        @Validation(required = true)
        public String categoryKey;

        @NameInMap("CategoryName")
        @Validation(required = true)
        public String categoryName;

        public static ListThingTemplatesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListThingTemplatesResponseData self = new ListThingTemplatesResponseData();
            return TeaModel.build(map, self);
        }

        public ListThingTemplatesResponseData setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public ListThingTemplatesResponseData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
