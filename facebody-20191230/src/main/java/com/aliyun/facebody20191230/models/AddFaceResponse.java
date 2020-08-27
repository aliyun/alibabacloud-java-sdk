// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddFaceResponseData data;

    public static AddFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceResponse self = new AddFaceResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceResponse setData(AddFaceResponseData data) {
        this.data = data;
        return this;
    }
    public AddFaceResponseData getData() {
        return this.data;
    }

    public static class AddFaceResponseData extends TeaModel {
        @NameInMap("FaceId")
        @Validation(required = true)
        public String faceId;

        public static AddFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceResponseData self = new AddFaceResponseData();
            return TeaModel.build(map, self);
        }

        public AddFaceResponseData setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

    }

}
