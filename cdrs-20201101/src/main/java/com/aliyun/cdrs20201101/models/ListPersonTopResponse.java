// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListPersonTopResponse extends TeaModel {
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
    public java.util.List<ListPersonTopResponseData> data;

    public static ListPersonTopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTopResponse self = new ListPersonTopResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonTopResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonTopResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTopResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTopResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTopResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonTopResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPersonTopResponse setData(java.util.List<ListPersonTopResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTopResponseData> getData() {
        return this.data;
    }

    public static class ListPersonTopResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("PoiId")
        @Validation(required = true)
        public String poiId;

        @NameInMap("PoiName")
        @Validation(required = true)
        public String poiName;

        @NameInMap("PassHour")
        @Validation(required = true)
        public String passHour;

        @NameInMap("Frequency")
        @Validation(required = true)
        public String frequency;

        public static ListPersonTopResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTopResponseData self = new ListPersonTopResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonTopResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTopResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonTopResponseData setPoiId(String poiId) {
            this.poiId = poiId;
            return this;
        }
        public String getPoiId() {
            return this.poiId;
        }

        public ListPersonTopResponseData setPoiName(String poiName) {
            this.poiName = poiName;
            return this;
        }
        public String getPoiName() {
            return this.poiName;
        }

        public ListPersonTopResponseData setPassHour(String passHour) {
            this.passHour = passHour;
            return this;
        }
        public String getPassHour() {
            return this.passHour;
        }

        public ListPersonTopResponseData setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

    }

}
