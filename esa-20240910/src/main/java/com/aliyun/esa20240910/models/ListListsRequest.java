// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsRequest extends TeaModel {
    /**
     * <p>Specifies the page number for paginated results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Specifies the number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A JSON object containing query parameters to filter the results.</p>
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
         * <p>If true, sorts the results in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>Filters by a partial match on the list description.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        @NameInMap("DescriptionLike")
        public String descriptionLike;

        /**
         * <p>Filters by a partial match on the list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        @NameInMap("IdLike")
        public String idLike;

        /**
         * <p>Filters by a partial match on a list item.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("ItemLike")
        public String itemLike;

        /**
         * <p>Filters by the list kind.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>Filters by a partial match on both the list name and list items.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("NameItemLike")
        public String nameItemLike;

        /**
         * <p>Filters by a partial match on the list name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>Specifies the sort field.</p>
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
