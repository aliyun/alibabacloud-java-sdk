// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDailyBillInfoLeafNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QueryDailyBillInfoLeafNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDailyBillInfoLeafNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDailyBillInfoLeafNewResponseBody self = new QueryDailyBillInfoLeafNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDailyBillInfoLeafNewResponseBody setList(QueryDailyBillInfoLeafNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryDailyBillInfoLeafNewResponseBodyList getList() {
        return this.list;
    }

    public QueryDailyBillInfoLeafNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO extends TeaModel {
        @NameInMap("AddCount")
        public Long addCount;

        @NameInMap("AddDate")
        public String addDate;

        @NameInMap("AddUnit")
        public String addUnit;

        @NameInMap("BillAmount")
        public String billAmount;

        @NameInMap("DetailItemName")
        public String detailItemName;

        @NameInMap("SinglePrice")
        public String singlePrice;

        public static QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO self = new QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO();
            return TeaModel.build(map, self);
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setAddCount(Long addCount) {
            this.addCount = addCount;
            return this;
        }
        public Long getAddCount() {
            return this.addCount;
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setAddDate(String addDate) {
            this.addDate = addDate;
            return this;
        }
        public String getAddDate() {
            return this.addDate;
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setAddUnit(String addUnit) {
            this.addUnit = addUnit;
            return this;
        }
        public String getAddUnit() {
            return this.addUnit;
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setBillAmount(String billAmount) {
            this.billAmount = billAmount;
            return this;
        }
        public String getBillAmount() {
            return this.billAmount;
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setDetailItemName(String detailItemName) {
            this.detailItemName = detailItemName;
            return this;
        }
        public String getDetailItemName() {
            return this.detailItemName;
        }

        public QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO setSinglePrice(String singlePrice) {
            this.singlePrice = singlePrice;
            return this;
        }
        public String getSinglePrice() {
            return this.singlePrice;
        }

    }

    public static class QueryDailyBillInfoLeafNewResponseBodyList extends TeaModel {
        @NameInMap("DailyBillDetailInfoDTO")
        public java.util.List<QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO> dailyBillDetailInfoDTO;

        public static QueryDailyBillInfoLeafNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryDailyBillInfoLeafNewResponseBodyList self = new QueryDailyBillInfoLeafNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryDailyBillInfoLeafNewResponseBodyList setDailyBillDetailInfoDTO(java.util.List<QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO> dailyBillDetailInfoDTO) {
            this.dailyBillDetailInfoDTO = dailyBillDetailInfoDTO;
            return this;
        }
        public java.util.List<QueryDailyBillInfoLeafNewResponseBodyListDailyBillDetailInfoDTO> getDailyBillDetailInfoDTO() {
            return this.dailyBillDetailInfoDTO;
        }

    }

}
