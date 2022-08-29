// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccProjectNamesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListCsccProjectNamesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccProjectNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccProjectNamesResponseBody self = new ListCsccProjectNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccProjectNamesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccProjectNamesResponseBody setData(ListCsccProjectNamesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCsccProjectNamesResponseBodyData getData() {
        return this.data;
    }

    public ListCsccProjectNamesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccProjectNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccProjectNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccProjectNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccProjectNamesResponseBodyDataContent extends TeaModel {
        @NameInMap("CsccRegion")
        public String csccRegion;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListCsccProjectNamesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCsccProjectNamesResponseBodyDataContent self = new ListCsccProjectNamesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCsccProjectNamesResponseBodyDataContent setCsccRegion(String csccRegion) {
            this.csccRegion = csccRegion;
            return this;
        }
        public String getCsccRegion() {
            return this.csccRegion;
        }

        public ListCsccProjectNamesResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCsccProjectNamesResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCsccProjectNamesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCsccProjectNamesResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCsccProjectNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccProjectNamesResponseBodyData self = new ListCsccProjectNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccProjectNamesResponseBodyData setContent(java.util.List<ListCsccProjectNamesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCsccProjectNamesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCsccProjectNamesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCsccProjectNamesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
