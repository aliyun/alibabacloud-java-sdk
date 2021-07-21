// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedComponentVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductVersionRelatedComponentVersionsResponseBodyData data;

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

    public ListProductVersionRelatedComponentVersionsResponseBody setData(ListProductVersionRelatedComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductVersionRelatedComponentVersionsResponseBodyData getData() {
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

    public static class ListProductVersionRelatedComponentVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ProductComponentRelationDetail> list;

        public static ListProductVersionRelatedComponentVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionRelatedComponentVersionsResponseBodyData self = new ListProductVersionRelatedComponentVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductVersionRelatedComponentVersionsResponseBodyData setList(java.util.List<ProductComponentRelationDetail> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ProductComponentRelationDetail> getList() {
            return this.list;
        }

    }

}
