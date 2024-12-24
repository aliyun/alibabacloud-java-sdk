// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    /**
     * <p>Regular matching of CatalogId</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("IdPattern")
    public String idPattern;

    /**
     * <p>The page turning token, which is returned from the returned result. If none is returned, an empty string or\&quot;\&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>‘’</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsRequest self = new ListCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsRequest setIdPattern(String idPattern) {
        this.idPattern = idPattern;
        return this;
    }
    public String getIdPattern() {
        return this.idPattern;
    }

    public ListCatalogsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListCatalogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
