// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConversationDetailByContactIdResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetConversationDetailByContactIdResponseBodyDataList dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetConversationDetailByContactIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailByContactIdResponseBody self = new GetConversationDetailByContactIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailByContactIdResponseBody setDataList(GetConversationDetailByContactIdResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetConversationDetailByContactIdResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetConversationDetailByContactIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConversationDetailByContactIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConversationDetailByContactIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConversationDetailByContactIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConversationDetailByContactIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        public static GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase build(java.util.Map<String, ?> map) throws Exception {
            GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase self = new GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase();
            return TeaModel.build(map, self);
        }

        public GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetConversationDetailByContactIdResponseBodyDataListList extends TeaModel {
        @NameInMap("QualityCheckPhrase")
        public java.util.List<GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase> qualityCheckPhrase;

        public static GetConversationDetailByContactIdResponseBodyDataListList build(java.util.Map<String, ?> map) throws Exception {
            GetConversationDetailByContactIdResponseBodyDataListList self = new GetConversationDetailByContactIdResponseBodyDataListList();
            return TeaModel.build(map, self);
        }

        public GetConversationDetailByContactIdResponseBodyDataListList setQualityCheckPhrase(java.util.List<GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase> qualityCheckPhrase) {
            this.qualityCheckPhrase = qualityCheckPhrase;
            return this;
        }
        public java.util.List<GetConversationDetailByContactIdResponseBodyDataListListQualityCheckPhrase> getQualityCheckPhrase() {
            return this.qualityCheckPhrase;
        }

    }

    public static class GetConversationDetailByContactIdResponseBodyDataList extends TeaModel {
        @NameInMap("List")
        public GetConversationDetailByContactIdResponseBodyDataListList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetConversationDetailByContactIdResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetConversationDetailByContactIdResponseBodyDataList self = new GetConversationDetailByContactIdResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetConversationDetailByContactIdResponseBodyDataList setList(GetConversationDetailByContactIdResponseBodyDataListList list) {
            this.list = list;
            return this;
        }
        public GetConversationDetailByContactIdResponseBodyDataListList getList() {
            return this.list;
        }

        public GetConversationDetailByContactIdResponseBodyDataList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetConversationDetailByContactIdResponseBodyDataList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetConversationDetailByContactIdResponseBodyDataList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
