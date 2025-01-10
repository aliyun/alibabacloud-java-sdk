// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPagesRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: <strong>1 to 100000</strong>. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryArgs")
    public ListPagesRequestQueryArgs queryArgs;

    public static ListPagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPagesRequest self = new ListPagesRequest();
        return TeaModel.build(map, self);
    }

    public ListPagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPagesRequest setQueryArgs(ListPagesRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListPagesRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public static class ListPagesRequestQueryArgs extends TeaModel {
        @NameInMap("NameDescriptionLike")
        public String nameDescriptionLike;

        public static ListPagesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListPagesRequestQueryArgs self = new ListPagesRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListPagesRequestQueryArgs setNameDescriptionLike(String nameDescriptionLike) {
            this.nameDescriptionLike = nameDescriptionLike;
            return this;
        }
        public String getNameDescriptionLike() {
            return this.nameDescriptionLike;
        }

    }

}
