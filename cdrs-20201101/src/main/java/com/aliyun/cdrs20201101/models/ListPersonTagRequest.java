// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListPersonTagRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("TagCode")
    @Validation(required = true)
    public String tagCode;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListPersonTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTagRequest self = new ListPersonTagRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonTagRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListPersonTagRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public ListPersonTagRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTagRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
