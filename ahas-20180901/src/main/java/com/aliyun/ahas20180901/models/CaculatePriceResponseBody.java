// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CaculatePriceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CaculatePriceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CaculatePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CaculatePriceResponseBody self = new CaculatePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public CaculatePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CaculatePriceResponseBody setData(java.util.List<CaculatePriceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CaculatePriceResponseBodyData> getData() {
        return this.data;
    }

    public CaculatePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CaculatePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CaculatePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CaculatePriceResponseBodyDataPackages extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("hours")
        public Integer hours;

        @NameInMap("maxDays")
        public Integer maxDays;

        @NameInMap("name")
        public String name;

        @NameInMap("price")
        public Float price;

        public static CaculatePriceResponseBodyDataPackages build(java.util.Map<String, ?> map) throws Exception {
            CaculatePriceResponseBodyDataPackages self = new CaculatePriceResponseBodyDataPackages();
            return TeaModel.build(map, self);
        }

        public CaculatePriceResponseBodyDataPackages setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CaculatePriceResponseBodyDataPackages setHours(Integer hours) {
            this.hours = hours;
            return this;
        }
        public Integer getHours() {
            return this.hours;
        }

        public CaculatePriceResponseBodyDataPackages setMaxDays(Integer maxDays) {
            this.maxDays = maxDays;
            return this;
        }
        public Integer getMaxDays() {
            return this.maxDays;
        }

        public CaculatePriceResponseBodyDataPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CaculatePriceResponseBodyDataPackages setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

    }

    public static class CaculatePriceResponseBodyData extends TeaModel {
        @NameInMap("Packages")
        public java.util.List<CaculatePriceResponseBodyDataPackages> packages;

        @NameInMap("Price")
        public Float price;

        @NameInMap("SolutionName")
        public String solutionName;

        public static CaculatePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CaculatePriceResponseBodyData self = new CaculatePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CaculatePriceResponseBodyData setPackages(java.util.List<CaculatePriceResponseBodyDataPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<CaculatePriceResponseBodyDataPackages> getPackages() {
            return this.packages;
        }

        public CaculatePriceResponseBodyData setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public CaculatePriceResponseBodyData setSolutionName(String solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public String getSolutionName() {
            return this.solutionName;
        }

    }

}
