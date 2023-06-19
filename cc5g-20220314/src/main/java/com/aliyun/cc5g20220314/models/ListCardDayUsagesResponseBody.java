// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardDayUsagesResponseBody extends TeaModel {
    @NameInMap("Cards")
    public java.util.List<ListCardDayUsagesResponseBodyCards> cards;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCardDayUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCardDayUsagesResponseBody self = new ListCardDayUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCardDayUsagesResponseBody setCards(java.util.List<ListCardDayUsagesResponseBodyCards> cards) {
        this.cards = cards;
        return this;
    }
    public java.util.List<ListCardDayUsagesResponseBodyCards> getCards() {
        return this.cards;
    }

    public ListCardDayUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages extends TeaModel {
        @NameInMap("Day")
        public String day;

        @NameInMap("UsageData")
        public String usageData;

        public static ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages build(java.util.Map<String, ?> map) throws Exception {
            ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages self = new ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages();
            return TeaModel.build(map, self);
        }

        public ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages setUsageData(String usageData) {
            this.usageData = usageData;
            return this;
        }
        public String getUsageData() {
            return this.usageData;
        }

    }

    public static class ListCardDayUsagesResponseBodyCardsUsageDataMonths extends TeaModel {
        @NameInMap("CardDayUsages")
        public java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages> cardDayUsages;

        @NameInMap("Month")
        public String month;

        @NameInMap("UsageDataMonth")
        public String usageDataMonth;

        public static ListCardDayUsagesResponseBodyCardsUsageDataMonths build(java.util.Map<String, ?> map) throws Exception {
            ListCardDayUsagesResponseBodyCardsUsageDataMonths self = new ListCardDayUsagesResponseBodyCardsUsageDataMonths();
            return TeaModel.build(map, self);
        }

        public ListCardDayUsagesResponseBodyCardsUsageDataMonths setCardDayUsages(java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages> cardDayUsages) {
            this.cardDayUsages = cardDayUsages;
            return this;
        }
        public java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonthsCardDayUsages> getCardDayUsages() {
            return this.cardDayUsages;
        }

        public ListCardDayUsagesResponseBodyCardsUsageDataMonths setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public ListCardDayUsagesResponseBodyCardsUsageDataMonths setUsageDataMonth(String usageDataMonth) {
            this.usageDataMonth = usageDataMonth;
            return this;
        }
        public String getUsageDataMonth() {
            return this.usageDataMonth;
        }

    }

    public static class ListCardDayUsagesResponseBodyCards extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("UsageDataMonths")
        public java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonths> usageDataMonths;

        public static ListCardDayUsagesResponseBodyCards build(java.util.Map<String, ?> map) throws Exception {
            ListCardDayUsagesResponseBodyCards self = new ListCardDayUsagesResponseBodyCards();
            return TeaModel.build(map, self);
        }

        public ListCardDayUsagesResponseBodyCards setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public ListCardDayUsagesResponseBodyCards setUsageDataMonths(java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonths> usageDataMonths) {
            this.usageDataMonths = usageDataMonths;
            return this;
        }
        public java.util.List<ListCardDayUsagesResponseBodyCardsUsageDataMonths> getUsageDataMonths() {
            return this.usageDataMonths;
        }

    }

}
