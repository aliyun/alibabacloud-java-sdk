// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectMetaSourceTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListProjectMetaSourceTypesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectMetaSourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMetaSourceTypesResponseBody self = new ListProjectMetaSourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMetaSourceTypesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListProjectMetaSourceTypesResponseBody setData(java.util.List<ListProjectMetaSourceTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectMetaSourceTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectMetaSourceTypesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectMetaSourceTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectMetaSourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMetaSourceTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectMetaSourceTypesResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        public static ListProjectMetaSourceTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMetaSourceTypesResponseBodyData self = new ListProjectMetaSourceTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectMetaSourceTypesResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListProjectMetaSourceTypesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
