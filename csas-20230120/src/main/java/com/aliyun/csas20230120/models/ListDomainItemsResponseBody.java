// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainItemsResponseBody extends TeaModel {
    /**
     * <p>The list of domain name entries.</p>
     */
    @NameInMap("DomainItems")
    public java.util.List<ListDomainItemsResponseBodyDomainItems> domainItems;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019F68B5-2D0D-5399-9BB2-D81C13C2C05D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the specified conditions. This is an optional parameter and may not be returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDomainItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainItemsResponseBody self = new ListDomainItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainItemsResponseBody setDomainItems(java.util.List<ListDomainItemsResponseBodyDomainItems> domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public java.util.List<ListDomainItemsResponseBodyDomainItems> getDomainItems() {
        return this.domainItems;
    }

    public ListDomainItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainItemsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListDomainItemsResponseBodyDomainItems extends TeaModel {
        /**
         * <p>The time when the entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01 10:20:30</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the entry was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01 10:20:30</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>499</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The domain name. Wildcard domain names are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static ListDomainItemsResponseBodyDomainItems build(java.util.Map<String, ?> map) throws Exception {
            ListDomainItemsResponseBodyDomainItems self = new ListDomainItemsResponseBodyDomainItems();
            return TeaModel.build(map, self);
        }

        public ListDomainItemsResponseBodyDomainItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDomainItemsResponseBodyDomainItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDomainItemsResponseBodyDomainItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDomainItemsResponseBodyDomainItems setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

}
