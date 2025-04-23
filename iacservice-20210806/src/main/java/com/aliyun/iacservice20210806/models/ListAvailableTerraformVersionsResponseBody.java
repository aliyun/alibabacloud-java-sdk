// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAvailableTerraformVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>b19952f6-1e03-43e3-ac9b-1be20c9ac1a6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("verisonList")
    public java.util.List<String> verisonList;

    public static ListAvailableTerraformVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTerraformVersionsResponseBody self = new ListAvailableTerraformVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableTerraformVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableTerraformVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAvailableTerraformVersionsResponseBody setVerisonList(java.util.List<String> verisonList) {
        this.verisonList = verisonList;
        return this;
    }
    public java.util.List<String> getVerisonList() {
        return this.verisonList;
    }

}
