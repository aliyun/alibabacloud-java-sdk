// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedComponentVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ProductComponentRelationDetail> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListProductVersionRelatedComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionRelatedComponentVersionsResponseBody self = new ListProductVersionRelatedComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionRelatedComponentVersionsResponseBody setData(java.util.List<ProductComponentRelationDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProductComponentRelationDetail> getData() {
        return this.data;
    }

    public ListProductVersionRelatedComponentVersionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListProductVersionRelatedComponentVersionsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListProductVersionRelatedComponentVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
