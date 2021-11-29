// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationReferenceComponentsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ProductComponentRelationDetail> data;

    @NameInMap("msg")
    public String msg;

    public static ListFoundationReferenceComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationReferenceComponentsResponseBody self = new ListFoundationReferenceComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoundationReferenceComponentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFoundationReferenceComponentsResponseBody setData(java.util.List<ProductComponentRelationDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProductComponentRelationDetail> getData() {
        return this.data;
    }

    public ListFoundationReferenceComponentsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
