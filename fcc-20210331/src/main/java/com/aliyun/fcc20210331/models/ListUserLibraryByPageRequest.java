// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListUserLibraryByPageRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Name")
    public String name;

    public static ListUserLibraryByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserLibraryByPageRequest self = new ListUserLibraryByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListUserLibraryByPageRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListUserLibraryByPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUserLibraryByPageRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListUserLibraryByPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
