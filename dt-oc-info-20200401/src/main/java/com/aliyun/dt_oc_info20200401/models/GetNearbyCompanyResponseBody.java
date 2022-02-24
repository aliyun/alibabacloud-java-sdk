// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetNearbyCompanyResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetNearbyCompanyResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static GetNearbyCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNearbyCompanyResponseBody self = new GetNearbyCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNearbyCompanyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetNearbyCompanyResponseBody setData(java.util.List<GetNearbyCompanyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNearbyCompanyResponseBodyData> getData() {
        return this.data;
    }

    public GetNearbyCompanyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNearbyCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNearbyCompanyResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetNearbyCompanyResponseBodyData extends TeaModel {
        @NameInMap("BizStatus")
        public String bizStatus;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("Distance")
        public Float distance;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("OneCompId")
        public String oneCompId;

        @NameInMap("RegAddress")
        public String regAddress;

        @NameInMap("RegCap")
        public Float regCap;

        @NameInMap("RegLat")
        public Float regLat;

        @NameInMap("RegLon")
        public Float regLon;

        public static GetNearbyCompanyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNearbyCompanyResponseBodyData self = new GetNearbyCompanyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNearbyCompanyResponseBodyData setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
        }

        public GetNearbyCompanyResponseBodyData setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public GetNearbyCompanyResponseBodyData setDistance(Float distance) {
            this.distance = distance;
            return this;
        }
        public Float getDistance() {
            return this.distance;
        }

        public GetNearbyCompanyResponseBodyData setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public GetNearbyCompanyResponseBodyData setOneCompId(String oneCompId) {
            this.oneCompId = oneCompId;
            return this;
        }
        public String getOneCompId() {
            return this.oneCompId;
        }

        public GetNearbyCompanyResponseBodyData setRegAddress(String regAddress) {
            this.regAddress = regAddress;
            return this;
        }
        public String getRegAddress() {
            return this.regAddress;
        }

        public GetNearbyCompanyResponseBodyData setRegCap(Float regCap) {
            this.regCap = regCap;
            return this;
        }
        public Float getRegCap() {
            return this.regCap;
        }

        public GetNearbyCompanyResponseBodyData setRegLat(Float regLat) {
            this.regLat = regLat;
            return this;
        }
        public Float getRegLat() {
            return this.regLat;
        }

        public GetNearbyCompanyResponseBodyData setRegLon(Float regLon) {
            this.regLon = regLon;
            return this;
        }
        public Float getRegLon() {
            return this.regLon;
        }

    }

}
