// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListStorageStatisticsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListStorageStatisticsResponseData> data;

    public static ListStorageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStorageStatisticsResponse self = new ListStorageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListStorageStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStorageStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStorageStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStorageStatisticsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListStorageStatisticsResponse setData(java.util.List<ListStorageStatisticsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStorageStatisticsResponseData> getData() {
        return this.data;
    }

    public static class ListStorageStatisticsResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("TotalStore")
        @Validation(required = true)
        public String totalStore;

        @NameInMap("UnusedStore")
        @Validation(required = true)
        public String unusedStore;

        @NameInMap("UsedStore")
        @Validation(required = true)
        public String usedStore;

        public static ListStorageStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListStorageStatisticsResponseData self = new ListStorageStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public ListStorageStatisticsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListStorageStatisticsResponseData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListStorageStatisticsResponseData setTotalStore(String totalStore) {
            this.totalStore = totalStore;
            return this;
        }
        public String getTotalStore() {
            return this.totalStore;
        }

        public ListStorageStatisticsResponseData setUnusedStore(String unusedStore) {
            this.unusedStore = unusedStore;
            return this;
        }
        public String getUnusedStore() {
            return this.unusedStore;
        }

        public ListStorageStatisticsResponseData setUsedStore(String usedStore) {
            this.usedStore = usedStore;
            return this;
        }
        public String getUsedStore() {
            return this.usedStore;
        }

    }

}
