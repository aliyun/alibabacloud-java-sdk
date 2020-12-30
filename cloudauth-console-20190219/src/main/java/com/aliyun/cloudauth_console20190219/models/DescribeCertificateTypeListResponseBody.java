// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeCertificateTypeListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TypeList")
    public java.util.List<String> typeList;

    public static DescribeCertificateTypeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateTypeListResponseBody self = new DescribeCertificateTypeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateTypeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCertificateTypeListResponseBody setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
