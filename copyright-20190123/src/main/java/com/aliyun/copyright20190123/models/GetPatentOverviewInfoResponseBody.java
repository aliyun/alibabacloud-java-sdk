// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentOverviewInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetPatentOverviewInfoResponseBodyData> data;

    public static GetPatentOverviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentOverviewInfoResponseBody self = new GetPatentOverviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentOverviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentOverviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentOverviewInfoResponseBody setData(java.util.List<GetPatentOverviewInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPatentOverviewInfoResponseBodyData> getData() {
        return this.data;
    }

    public static class GetPatentOverviewInfoResponseBodyData extends TeaModel {
        @NameInMap("UserType")
        public String userType;

        @NameInMap("WaiguanCount")
        public Integer waiguanCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("ShiyongCount")
        public Integer shiyongCount;

        @NameInMap("FamingCount")
        public Integer famingCount;

        public static GetPatentOverviewInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentOverviewInfoResponseBodyData self = new GetPatentOverviewInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentOverviewInfoResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public GetPatentOverviewInfoResponseBodyData setWaiguanCount(Integer waiguanCount) {
            this.waiguanCount = waiguanCount;
            return this;
        }
        public Integer getWaiguanCount() {
            return this.waiguanCount;
        }

        public GetPatentOverviewInfoResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetPatentOverviewInfoResponseBodyData setShiyongCount(Integer shiyongCount) {
            this.shiyongCount = shiyongCount;
            return this;
        }
        public Integer getShiyongCount() {
            return this.shiyongCount;
        }

        public GetPatentOverviewInfoResponseBodyData setFamingCount(Integer famingCount) {
            this.famingCount = famingCount;
            return this;
        }
        public Integer getFamingCount() {
            return this.famingCount;
        }

    }

}
