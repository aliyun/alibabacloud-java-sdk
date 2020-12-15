// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapAoisResponse extends TeaModel {
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
    public java.util.List<ListCityMapAoisResponseData> data;

    public static ListCityMapAoisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapAoisResponse self = new ListCityMapAoisResponse();
        return TeaModel.build(map, self);
    }

    public ListCityMapAoisResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCityMapAoisResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCityMapAoisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCityMapAoisResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCityMapAoisResponse setData(java.util.List<ListCityMapAoisResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCityMapAoisResponseData> getData() {
        return this.data;
    }

    public static class ListCityMapAoisResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListCityMapAoisResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCityMapAoisResponseData self = new ListCityMapAoisResponseData();
            return TeaModel.build(map, self);
        }

        public ListCityMapAoisResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCityMapAoisResponseData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
