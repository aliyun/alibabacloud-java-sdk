// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateDynamicImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDynamicImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageResponseBody self = new GenerateDynamicImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageResponseBody setData(GenerateDynamicImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDynamicImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateDynamicImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateDynamicImageResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GenerateDynamicImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDynamicImageResponseBodyData self = new GenerateDynamicImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDynamicImageResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
