// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public MakeSuperResolutionImageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>47DD87F1-D077-499A-8D96-C82F006A6839</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MakeSuperResolutionImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageResponseBody self = new MakeSuperResolutionImageResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageResponseBody setData(MakeSuperResolutionImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MakeSuperResolutionImageResponseBodyData getData() {
        return this.data;
    }

    public MakeSuperResolutionImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MakeSuperResolutionImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://ivpd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/upload/ai-gateway_prod/ds%253D20191121/sisrx2_157433961551387538.jpg?Expires=1574598816&OSSAccessKeyId=LTAI4FeJ8qKkYn6SrHhQ****&Signature=8phY6dOz4U889nHfHC1g51nwAi">http://ivpd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/upload/ai-gateway_prod/ds%253D20191121/sisrx2_157433961551387538.jpg?Expires=1574598816&amp;OSSAccessKeyId=LTAI4FeJ8qKkYn6SrHhQ****&amp;Signature=8phY6dOz4U889nHfHC1g51nwAi</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static MakeSuperResolutionImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MakeSuperResolutionImageResponseBodyData self = new MakeSuperResolutionImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MakeSuperResolutionImageResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
