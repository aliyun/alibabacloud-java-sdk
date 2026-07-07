// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsRequest extends TeaModel {
    /**
     * <p>The page number for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query parameters passed in JSON format, which contain various filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>ListLists</p>
     */
    @NameInMap("QueryArgs")
    public ListListsRequestQueryArgs queryArgs;

    public static ListListsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListsRequest self = new ListListsRequest();
        return TeaModel.build(map, self);
    }

    public ListListsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListsRequest setQueryArgs(ListListsRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListListsRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public static class ListListsRequestQueryArgs extends TeaModel {
        /**
         * <p>Specifies whether to sort the results in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>The value used to fuzzy match list descriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        @NameInMap("DescriptionLike")
        public String descriptionLike;

        /**
         * <p>The value used to fuzzy match list IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        @NameInMap("IdLike")
        public String idLike;

        /**
         * <p>The value used to fuzzy match list content.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("ItemLike")
        public String itemLike;

        /**
         * <p>The kind of the custom list.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The value used to fuzzy match both list content and list names simultaneously.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("NameItemLike")
        public String nameItemLike;

        /**
         * <p>The value used to fuzzy match list names.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>The column by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        public static ListListsRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListListsRequestQueryArgs self = new ListListsRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListListsRequestQueryArgs setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListListsRequestQueryArgs setDescriptionLike(String descriptionLike) {
            this.descriptionLike = descriptionLike;
            return this;
        }
        public String getDescriptionLike() {
            return this.descriptionLike;
        }

        public ListListsRequestQueryArgs setIdLike(String idLike) {
            this.idLike = idLike;
            return this;
        }
        public String getIdLike() {
            return this.idLike;
        }

        public ListListsRequestQueryArgs setItemLike(String itemLike) {
            this.itemLike = itemLike;
            return this;
        }
        public String getItemLike() {
            return this.itemLike;
        }

        public ListListsRequestQueryArgs setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListListsRequestQueryArgs setNameItemLike(String nameItemLike) {
            this.nameItemLike = nameItemLike;
            return this;
        }
        public String getNameItemLike() {
            return this.nameItemLike;
        }

        public ListListsRequestQueryArgs setNameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }
        public String getNameLike() {
            return this.nameLike;
        }

        public ListListsRequestQueryArgs setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

    }

}
