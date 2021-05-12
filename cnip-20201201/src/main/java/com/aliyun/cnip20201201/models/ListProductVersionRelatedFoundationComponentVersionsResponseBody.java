// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedFoundationComponentVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ProductComponentRelationDetail> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListProductVersionRelatedFoundationComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionRelatedFoundationComponentVersionsResponseBody self = new ListProductVersionRelatedFoundationComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponseBody setData(java.util.List<ProductComponentRelationDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProductComponentRelationDetail> getData() {
        return this.data;
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
