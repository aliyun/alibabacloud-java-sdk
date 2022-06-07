// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class PageDO extends TeaModel {
    // code
    @NameInMap("code")
    public Integer code;

    // pageNo
    @NameInMap("pageNo")
    public Integer pageNo;

    // records
    @NameInMap("records")
    public java.util.List<java.util.Map<String, ?>> records;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // totalCount
    @NameInMap("totalCount")
    public Integer totalCount;

    public static PageDO build(java.util.Map<String, ?> map) throws Exception {
        PageDO self = new PageDO();
        return TeaModel.build(map, self);
    }

    public PageDO setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PageDO setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public PageDO setRecords(java.util.List<java.util.Map<String, ?>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

    public PageDO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageDO setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
