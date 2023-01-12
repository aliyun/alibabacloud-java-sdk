// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesResponseBody extends TeaModel {
    @NameInMap("IspTypeList")
    public java.util.List<String> ispTypeList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListIspTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIspTypesResponseBody self = new ListIspTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIspTypesResponseBody setIspTypeList(java.util.List<String> ispTypeList) {
        this.ispTypeList = ispTypeList;
        return this;
    }
    public java.util.List<String> getIspTypeList() {
        return this.ispTypeList;
    }

    public ListIspTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
