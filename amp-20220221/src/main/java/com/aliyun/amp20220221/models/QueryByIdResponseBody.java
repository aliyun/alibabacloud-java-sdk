// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amp20220221.models;

import com.aliyun.tea.*;

public class QueryByIdResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    // fsdfsa
    @NameInMap("Color")
    public String color;

    @NameInMap("Name")
    public String name;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static QueryByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryByIdResponseBody self = new QueryByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryByIdResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryByIdResponseBody setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public QueryByIdResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
