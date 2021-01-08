// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDataSetReportResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DescribeDataSetReportResponseBodyResult result;

    public static DescribeDataSetReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetReportResponseBody self = new DescribeDataSetReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSetReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataSetReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSetReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDataSetReportResponseBody setResult(DescribeDataSetReportResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDataSetReportResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDataSetReportResponseBodyResultOverall extends TeaModel {
        @NameInMap("UserRepetitiveRate")
        public Float userRepetitiveRate;

        @NameInMap("UserUserCount")
        public Integer userUserCount;

        @NameInMap("BhvCount")
        public Integer bhvCount;

        @NameInMap("BhvLegalRate")
        public Float bhvLegalRate;

        @NameInMap("UserCompleteRate")
        public Float userCompleteRate;

        @NameInMap("UserLoginRate")
        public Float userLoginRate;

        @NameInMap("ItemCompleteRate")
        public Float itemCompleteRate;

        @NameInMap("ItemRepetitiveRate")
        public Float itemRepetitiveRate;

        @NameInMap("ItemItemCount")
        public Integer itemItemCount;

        @NameInMap("UserLegalRate")
        public Float userLegalRate;

        @NameInMap("ItemLegalRate")
        public Float itemLegalRate;

        @NameInMap("ItemLoginRate")
        public Float itemLoginRate;

        public static DescribeDataSetReportResponseBodyResultOverall build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSetReportResponseBodyResultOverall self = new DescribeDataSetReportResponseBodyResultOverall();
            return TeaModel.build(map, self);
        }

        public DescribeDataSetReportResponseBodyResultOverall setUserRepetitiveRate(Float userRepetitiveRate) {
            this.userRepetitiveRate = userRepetitiveRate;
            return this;
        }
        public Float getUserRepetitiveRate() {
            return this.userRepetitiveRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setUserUserCount(Integer userUserCount) {
            this.userUserCount = userUserCount;
            return this;
        }
        public Integer getUserUserCount() {
            return this.userUserCount;
        }

        public DescribeDataSetReportResponseBodyResultOverall setBhvCount(Integer bhvCount) {
            this.bhvCount = bhvCount;
            return this;
        }
        public Integer getBhvCount() {
            return this.bhvCount;
        }

        public DescribeDataSetReportResponseBodyResultOverall setBhvLegalRate(Float bhvLegalRate) {
            this.bhvLegalRate = bhvLegalRate;
            return this;
        }
        public Float getBhvLegalRate() {
            return this.bhvLegalRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setUserCompleteRate(Float userCompleteRate) {
            this.userCompleteRate = userCompleteRate;
            return this;
        }
        public Float getUserCompleteRate() {
            return this.userCompleteRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setUserLoginRate(Float userLoginRate) {
            this.userLoginRate = userLoginRate;
            return this;
        }
        public Float getUserLoginRate() {
            return this.userLoginRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setItemCompleteRate(Float itemCompleteRate) {
            this.itemCompleteRate = itemCompleteRate;
            return this;
        }
        public Float getItemCompleteRate() {
            return this.itemCompleteRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setItemRepetitiveRate(Float itemRepetitiveRate) {
            this.itemRepetitiveRate = itemRepetitiveRate;
            return this;
        }
        public Float getItemRepetitiveRate() {
            return this.itemRepetitiveRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setItemItemCount(Integer itemItemCount) {
            this.itemItemCount = itemItemCount;
            return this;
        }
        public Integer getItemItemCount() {
            return this.itemItemCount;
        }

        public DescribeDataSetReportResponseBodyResultOverall setUserLegalRate(Float userLegalRate) {
            this.userLegalRate = userLegalRate;
            return this;
        }
        public Float getUserLegalRate() {
            return this.userLegalRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setItemLegalRate(Float itemLegalRate) {
            this.itemLegalRate = itemLegalRate;
            return this;
        }
        public Float getItemLegalRate() {
            return this.itemLegalRate;
        }

        public DescribeDataSetReportResponseBodyResultOverall setItemLoginRate(Float itemLoginRate) {
            this.itemLoginRate = itemLoginRate;
            return this;
        }
        public Float getItemLoginRate() {
            return this.itemLoginRate;
        }

    }

    public static class DescribeDataSetReportResponseBodyResultDetail extends TeaModel {
        @NameInMap("UvCtr")
        public Float uvCtr;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("PerUvClick")
        public Float perUvClick;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("ActiveItem")
        public Long activeItem;

        @NameInMap("Ctr")
        public Float ctr;

        @NameInMap("PerUvBhv")
        public Float perUvBhv;

        @NameInMap("Click")
        public Long click;

        @NameInMap("Uv")
        public Long uv;

        @NameInMap("ClickUser")
        public Long clickUser;

        public static DescribeDataSetReportResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSetReportResponseBodyResultDetail self = new DescribeDataSetReportResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDataSetReportResponseBodyResultDetail setUvCtr(Float uvCtr) {
            this.uvCtr = uvCtr;
            return this;
        }
        public Float getUvCtr() {
            return this.uvCtr;
        }

        public DescribeDataSetReportResponseBodyResultDetail setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public DescribeDataSetReportResponseBodyResultDetail setPerUvClick(Float perUvClick) {
            this.perUvClick = perUvClick;
            return this;
        }
        public Float getPerUvClick() {
            return this.perUvClick;
        }

        public DescribeDataSetReportResponseBodyResultDetail setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribeDataSetReportResponseBodyResultDetail setActiveItem(Long activeItem) {
            this.activeItem = activeItem;
            return this;
        }
        public Long getActiveItem() {
            return this.activeItem;
        }

        public DescribeDataSetReportResponseBodyResultDetail setCtr(Float ctr) {
            this.ctr = ctr;
            return this;
        }
        public Float getCtr() {
            return this.ctr;
        }

        public DescribeDataSetReportResponseBodyResultDetail setPerUvBhv(Float perUvBhv) {
            this.perUvBhv = perUvBhv;
            return this;
        }
        public Float getPerUvBhv() {
            return this.perUvBhv;
        }

        public DescribeDataSetReportResponseBodyResultDetail setClick(Long click) {
            this.click = click;
            return this;
        }
        public Long getClick() {
            return this.click;
        }

        public DescribeDataSetReportResponseBodyResultDetail setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public DescribeDataSetReportResponseBodyResultDetail setClickUser(Long clickUser) {
            this.clickUser = clickUser;
            return this;
        }
        public Long getClickUser() {
            return this.clickUser;
        }

    }

    public static class DescribeDataSetReportResponseBodyResult extends TeaModel {
        @NameInMap("Overall")
        public DescribeDataSetReportResponseBodyResultOverall overall;

        @NameInMap("Detail")
        public java.util.List<DescribeDataSetReportResponseBodyResultDetail> detail;

        public static DescribeDataSetReportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSetReportResponseBodyResult self = new DescribeDataSetReportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataSetReportResponseBodyResult setOverall(DescribeDataSetReportResponseBodyResultOverall overall) {
            this.overall = overall;
            return this;
        }
        public DescribeDataSetReportResponseBodyResultOverall getOverall() {
            return this.overall;
        }

        public DescribeDataSetReportResponseBodyResult setDetail(java.util.List<DescribeDataSetReportResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDataSetReportResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

    }

}
