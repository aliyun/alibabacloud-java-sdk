// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardUsagesResponseBody extends TeaModel {
    @NameInMap("Cards")
    public java.util.List<ListCardUsagesResponseBodyCards> cards;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListCardUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCardUsagesResponseBody self = new ListCardUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCardUsagesResponseBody setCards(java.util.List<ListCardUsagesResponseBodyCards> cards) {
        this.cards = cards;
        return this;
    }
    public java.util.List<ListCardUsagesResponseBodyCards> getCards() {
        return this.cards;
    }

    public ListCardUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCardUsagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListCardUsagesResponseBodyCards extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("UsageDataMonth")
        public Long usageDataMonth;

        public static ListCardUsagesResponseBodyCards build(java.util.Map<String, ?> map) throws Exception {
            ListCardUsagesResponseBodyCards self = new ListCardUsagesResponseBodyCards();
            return TeaModel.build(map, self);
        }

        public ListCardUsagesResponseBodyCards setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public ListCardUsagesResponseBodyCards setUsageDataMonth(Long usageDataMonth) {
            this.usageDataMonth = usageDataMonth;
            return this;
        }
        public Long getUsageDataMonth() {
            return this.usageDataMonth;
        }

    }

}
