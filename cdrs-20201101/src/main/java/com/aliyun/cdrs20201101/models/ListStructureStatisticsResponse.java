// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListStructureStatisticsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListStructureStatisticsResponseData> data;

    public static ListStructureStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStructureStatisticsResponse self = new ListStructureStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListStructureStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStructureStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStructureStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStructureStatisticsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStructureStatisticsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStructureStatisticsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListStructureStatisticsResponse setData(java.util.List<ListStructureStatisticsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStructureStatisticsResponseData> getData() {
        return this.data;
    }

    public static class ListStructureStatisticsResponseData extends TeaModel {
        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        public static ListStructureStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListStructureStatisticsResponseData self = new ListStructureStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public ListStructureStatisticsResponseData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListStructureStatisticsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

}
