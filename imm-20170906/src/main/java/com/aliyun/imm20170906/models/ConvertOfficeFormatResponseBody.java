// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ConvertOfficeFormatResponseBody extends TeaModel {
    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("RequestId")
    public String requestId;

    public static ConvertOfficeFormatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertOfficeFormatResponseBody self = new ConvertOfficeFormatResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertOfficeFormatResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ConvertOfficeFormatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
