// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleTagDistributeResponse extends TeaModel {
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
    public java.util.List<ListVehicleTagDistributeResponseData> data;

    public static ListVehicleTagDistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleTagDistributeResponse self = new ListVehicleTagDistributeResponse();
        return TeaModel.build(map, self);
    }

    public ListVehicleTagDistributeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVehicleTagDistributeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVehicleTagDistributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVehicleTagDistributeResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVehicleTagDistributeResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVehicleTagDistributeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVehicleTagDistributeResponse setData(java.util.List<ListVehicleTagDistributeResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVehicleTagDistributeResponseData> getData() {
        return this.data;
    }

    public static class ListVehicleTagDistributeResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListVehicleTagDistributeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleTagDistributeResponseData self = new ListVehicleTagDistributeResponseData();
            return TeaModel.build(map, self);
        }

        public ListVehicleTagDistributeResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListVehicleTagDistributeResponseData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListVehicleTagDistributeResponseData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
