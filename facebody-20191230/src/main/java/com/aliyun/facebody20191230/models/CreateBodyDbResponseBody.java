// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyDbResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateBodyDbResponseBodyData data;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBodyDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyDbResponseBody self = new CreateBodyDbResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBodyDbResponseBody setData(CreateBodyDbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBodyDbResponseBodyData getData() {
        return this.data;
    }

    public CreateBodyDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBodyDbResponseBodyData extends TeaModel {
        // 数据库ID
        @NameInMap("Id")
        public Long id;

        public static CreateBodyDbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBodyDbResponseBodyData self = new CreateBodyDbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBodyDbResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
