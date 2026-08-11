// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainMetasResponseBody extends TeaModel {
    /**
     * <p>The list of domain name lists.</p>
     */
    @NameInMap("DomainMetas")
    public java.util.List<ListDomainMetasResponseBodyDomainMetas> domainMetas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D2788E14-8C9F-5FE8-B72F-5ABD033AA27E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of lists that match the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDomainMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainMetasResponseBody self = new ListDomainMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainMetasResponseBody setDomainMetas(java.util.List<ListDomainMetasResponseBodyDomainMetas> domainMetas) {
        this.domainMetas = domainMetas;
        return this;
    }
    public java.util.List<ListDomainMetasResponseBodyDomainMetas> getDomainMetas() {
        return this.domainMetas;
    }

    public ListDomainMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainMetasResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListDomainMetasResponseBodyDomainMetas extends TeaModel {
        /**
         * <p>The time when the list was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01 10:20:30</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the list was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-02 15:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The number of domain name entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("ItemCount")
        public Long itemCount;

        /**
         * <p>The list ID, which is a unique business identifier used for policy references and CRUD operations.</p>
         * 
         * <strong>example:</strong>
         * <p>ladl-8acxxxa0f2a7daf9</p>
         */
        @NameInMap("ListId")
        public String listId;

        /**
         * <p>The list type.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white_list</p>
         */
        @NameInMap("ListType")
        public String listType;

        /**
         * <p>The list name.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeDomainWhitelist</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>RS_ladl-xxxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListDomainMetasResponseBodyDomainMetas build(java.util.Map<String, ?> map) throws Exception {
            ListDomainMetasResponseBodyDomainMetas self = new ListDomainMetasResponseBodyDomainMetas();
            return TeaModel.build(map, self);
        }

        public ListDomainMetasResponseBodyDomainMetas setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDomainMetasResponseBodyDomainMetas setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDomainMetasResponseBodyDomainMetas setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public ListDomainMetasResponseBodyDomainMetas setListId(String listId) {
            this.listId = listId;
            return this;
        }
        public String getListId() {
            return this.listId;
        }

        public ListDomainMetasResponseBodyDomainMetas setListType(String listType) {
            this.listType = listType;
            return this;
        }
        public String getListType() {
            return this.listType;
        }

        public ListDomainMetasResponseBodyDomainMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDomainMetasResponseBodyDomainMetas setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
