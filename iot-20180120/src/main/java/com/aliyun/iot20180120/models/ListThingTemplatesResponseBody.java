// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListThingTemplatesResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListThingTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListThingTemplatesResponseBody self = new ListThingTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListThingTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingTemplatesResponseBody setData(java.util.List<ListThingTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListThingTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListThingTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListThingTemplatesResponseBodyData extends TeaModel {
        @NameInMap("CategoryKey")
        public String categoryKey;

        @NameInMap("CategoryName")
        public String categoryName;

        public static ListThingTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListThingTemplatesResponseBodyData self = new ListThingTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListThingTemplatesResponseBodyData setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public ListThingTemplatesResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
