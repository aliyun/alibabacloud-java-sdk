// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextDeformationResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateTextDeformationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateTextDeformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextDeformationResponseBody self = new GenerateTextDeformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTextDeformationResponseBody setData(GenerateTextDeformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateTextDeformationResponseBodyData getData() {
        return this.data;
    }

    public GenerateTextDeformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateTextDeformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateTextDeformationResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateTextDeformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateTextDeformationResponseBodyData self = new GenerateTextDeformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateTextDeformationResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
