// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionRelatedComponentVersionDetailResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ProductComponentRelationDetail> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductVersionRelatedComponentVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRelatedComponentVersionDetailResponseBody self = new GetProductVersionRelatedComponentVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRelatedComponentVersionDetailResponseBody setData(java.util.List<ProductComponentRelationDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProductComponentRelationDetail> getData() {
        return this.data;
    }

    public GetProductVersionRelatedComponentVersionDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductVersionRelatedComponentVersionDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductVersionRelatedComponentVersionDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
