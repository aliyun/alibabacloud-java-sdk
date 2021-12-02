// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyPersonResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateBodyPersonResponseBodyData data;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyPersonResponseBody self = new CreateBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBodyPersonResponseBody setData(CreateBodyPersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBodyPersonResponseBodyData getData() {
        return this.data;
    }

    public CreateBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBodyPersonResponseBodyData extends TeaModel {
        // 数据库ID
        @NameInMap("Id")
        public Long id;

        public static CreateBodyPersonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBodyPersonResponseBodyData self = new CreateBodyPersonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBodyPersonResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
