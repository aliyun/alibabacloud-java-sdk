// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchCheckPatentAddResponseBody extends TeaModel {
    @NameInMap("CacheKey")
    public String cacheKey;

    @NameInMap("CanAddCount")
    public Integer canAddCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ExistCount")
    public Integer existCount;

    @NameInMap("ErrorDetail")
    public java.util.List<BatchCheckPatentAddResponseBodyErrorDetail> errorDetail;

    @NameInMap("TradeList")
    public java.util.List<BatchCheckPatentAddResponseBodyTradeList> tradeList;

    public static BatchCheckPatentAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckPatentAddResponseBody self = new BatchCheckPatentAddResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckPatentAddResponseBody setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
        return this;
    }
    public String getCacheKey() {
        return this.cacheKey;
    }

    public BatchCheckPatentAddResponseBody setCanAddCount(Integer canAddCount) {
        this.canAddCount = canAddCount;
        return this;
    }
    public Integer getCanAddCount() {
        return this.canAddCount;
    }

    public BatchCheckPatentAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckPatentAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchCheckPatentAddResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public BatchCheckPatentAddResponseBody setExistCount(Integer existCount) {
        this.existCount = existCount;
        return this;
    }
    public Integer getExistCount() {
        return this.existCount;
    }

    public BatchCheckPatentAddResponseBody setErrorDetail(java.util.List<BatchCheckPatentAddResponseBodyErrorDetail> errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public java.util.List<BatchCheckPatentAddResponseBodyErrorDetail> getErrorDetail() {
        return this.errorDetail;
    }

    public BatchCheckPatentAddResponseBody setTradeList(java.util.List<BatchCheckPatentAddResponseBodyTradeList> tradeList) {
        this.tradeList = tradeList;
        return this;
    }
    public java.util.List<BatchCheckPatentAddResponseBodyTradeList> getTradeList() {
        return this.tradeList;
    }

    public static class BatchCheckPatentAddResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("ApplyNumber")
        public String applyNumber;

        public static BatchCheckPatentAddResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckPatentAddResponseBodyErrorDetail self = new BatchCheckPatentAddResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public BatchCheckPatentAddResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchCheckPatentAddResponseBodyErrorDetail setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchCheckPatentAddResponseBodyErrorDetail setApplyNumber(String applyNumber) {
            this.applyNumber = applyNumber;
            return this;
        }
        public String getApplyNumber() {
            return this.applyNumber;
        }

    }

    public static class BatchCheckPatentAddResponseBodyTradeList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("NeedFee")
        public Float needFee;

        @NameInMap("Discount")
        public String discount;

        @NameInMap("NeedCount")
        public Integer needCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Age")
        public String age;

        @NameInMap("ExistCount")
        public Long existCount;

        public static BatchCheckPatentAddResponseBodyTradeList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckPatentAddResponseBodyTradeList self = new BatchCheckPatentAddResponseBodyTradeList();
            return TeaModel.build(map, self);
        }

        public BatchCheckPatentAddResponseBodyTradeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchCheckPatentAddResponseBodyTradeList setNeedFee(Float needFee) {
            this.needFee = needFee;
            return this;
        }
        public Float getNeedFee() {
            return this.needFee;
        }

        public BatchCheckPatentAddResponseBodyTradeList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public BatchCheckPatentAddResponseBodyTradeList setNeedCount(Integer needCount) {
            this.needCount = needCount;
            return this;
        }
        public Integer getNeedCount() {
            return this.needCount;
        }

        public BatchCheckPatentAddResponseBodyTradeList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public BatchCheckPatentAddResponseBodyTradeList setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public BatchCheckPatentAddResponseBodyTradeList setExistCount(Long existCount) {
            this.existCount = existCount;
            return this;
        }
        public Long getExistCount() {
            return this.existCount;
        }

    }

}
