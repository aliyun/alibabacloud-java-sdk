// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    // catalogId
    @NameInMap("IdPattern")
    public String idPattern;

    // namePattern
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // pageSize
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
