// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("DivisionAddress")
    @Validation(required = true)
    public QueryAddressResponseDivisionAddress divisionAddress;

    public static QueryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressResponse self = new QueryAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAddressResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressResponse setDivisionAddress(QueryAddressResponseDivisionAddress divisionAddress) {
        this.divisionAddress = divisionAddress;
        return this;
    }
    public QueryAddressResponseDivisionAddress getDivisionAddress() {
        return this.divisionAddress;
    }

    public static class QueryAddressResponseDivisionAddressDivisionAddress extends TeaModel {
        @NameInMap("DivisionCode")
        @Validation(required = true)
        public Long divisionCode;

        @NameInMap("DivisionName")
        @Validation(required = true)
        public String divisionName;

        @NameInMap("DivisionLevel")
        @Validation(required = true)
        public Integer divisionLevel;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static QueryAddressResponseDivisionAddressDivisionAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressResponseDivisionAddressDivisionAddress self = new QueryAddressResponseDivisionAddressDivisionAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressResponseDivisionAddressDivisionAddress setDivisionCode(Long divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public Long getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressResponseDivisionAddressDivisionAddress setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAddressResponseDivisionAddressDivisionAddress setDivisionLevel(Integer divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Integer getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryAddressResponseDivisionAddressDivisionAddress setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class QueryAddressResponseDivisionAddress extends TeaModel {
        @NameInMap("DivisionAddress")
        @Validation(required = true)
        public java.util.List<QueryAddressResponseDivisionAddressDivisionAddress> divisionAddress;

        public static QueryAddressResponseDivisionAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressResponseDivisionAddress self = new QueryAddressResponseDivisionAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressResponseDivisionAddress setDivisionAddress(java.util.List<QueryAddressResponseDivisionAddressDivisionAddress> divisionAddress) {
            this.divisionAddress = divisionAddress;
            return this;
        }
        public java.util.List<QueryAddressResponseDivisionAddressDivisionAddress> getDivisionAddress() {
            return this.divisionAddress;
        }

    }

}
