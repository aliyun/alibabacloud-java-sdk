// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnEsTemplateInfoRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Op")
    public String op;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDcdnEsTemplateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnEsTemplateInfoRequest self = new ListDcdnEsTemplateInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListDcdnEsTemplateInfoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListDcdnEsTemplateInfoRequest setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public ListDcdnEsTemplateInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDcdnEsTemplateInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDcdnEsTemplateInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
