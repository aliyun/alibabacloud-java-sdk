// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2B93C43A-F824-40C8-AF79-844342B0F43A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceResponseBody self = new AddFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceResponseBody setData(AddFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceResponseBodyData getData() {
        return this.data;
    }

    public AddFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FaceId")
        public String faceId;

        /**
         * <strong>example:</strong>
         * <p>99.79581</p>
         */
        @NameInMap("QualitieScore")
        public Float qualitieScore;

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

        public AddFaceResponseBodyData setQualitieScore(Float qualitieScore) {
            this.qualitieScore = qualitieScore;
            return this;
        }
        public Float getQualitieScore() {
            return this.qualitieScore;
        }

    }

}
