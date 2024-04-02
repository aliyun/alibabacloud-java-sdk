// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypesResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBizTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypesResponseBody self = new DescribeBizTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypesResponseBody setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public DescribeBizTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
