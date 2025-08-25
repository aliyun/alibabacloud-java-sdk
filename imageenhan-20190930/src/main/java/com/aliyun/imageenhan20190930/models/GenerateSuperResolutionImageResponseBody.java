// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateSuperResolutionImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4ad5c3ef-5ac4-4e1c-b14f-90d939aa73eb</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateSuperResolutionImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSuperResolutionImageResponseBody self = new GenerateSuperResolutionImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSuperResolutionImageResponseBody setData(GenerateSuperResolutionImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateSuperResolutionImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateSuperResolutionImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateSuperResolutionImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateSuperResolutionImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/diffusion-sr/2023-02-07/d01cede5-28bf-4719-96d9-77198d51c2f2/20230207_150650515242_3dbctnjy5f.jpg?Expires=1675755681&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=4FeDXpp0DilXsHdt7qc%2Ffh3zoC">http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/diffusion-sr/2023-02-07/d01cede5-28bf-4719-96d9-77198d51c2f2/20230207_150650515242_3dbctnjy5f.jpg?Expires=1675755681&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=4FeDXpp0DilXsHdt7qc%2Ffh3zoC</a>****</p>
         */
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateSuperResolutionImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateSuperResolutionImageResponseBodyData self = new GenerateSuperResolutionImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateSuperResolutionImageResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
