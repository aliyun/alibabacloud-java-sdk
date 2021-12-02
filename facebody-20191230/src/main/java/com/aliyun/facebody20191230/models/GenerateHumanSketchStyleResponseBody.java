// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateHumanSketchStyleResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateHumanSketchStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleResponseBody self = new GenerateHumanSketchStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleResponseBody setData(GenerateHumanSketchStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateHumanSketchStyleResponseBodyData getData() {
        return this.data;
    }

    public GenerateHumanSketchStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateHumanSketchStyleResponseBodyData extends TeaModel {
        // 出参图片地址
        @NameInMap("ImageURL")
        public String imageURL;

        public static GenerateHumanSketchStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateHumanSketchStyleResponseBodyData self = new GenerateHumanSketchStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateHumanSketchStyleResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
