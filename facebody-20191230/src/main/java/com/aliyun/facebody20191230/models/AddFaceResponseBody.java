// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddFaceResponseBodyData data;

    public static AddFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceResponseBody self = new AddFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceResponseBody setData(AddFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceResponseBodyData getData() {
        return this.data;
    }

    public static class AddFaceResponseBodyData extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        public static AddFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceResponseBodyData self = new AddFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceResponseBodyData setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

    }

}
