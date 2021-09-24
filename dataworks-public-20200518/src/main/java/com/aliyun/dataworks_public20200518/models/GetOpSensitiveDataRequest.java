// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("Date")
    @Validation(required = true)
    public String date;

    @NameInMap("OpType")
    public String opType;

    public static GetOpSensitiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataRequest self = new GetOpSensitiveDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOpSensitiveDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpSensitiveDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOpSensitiveDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetOpSensitiveDataRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

}
