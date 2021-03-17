// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateDynamicImageResponseBodyData data;

    public static GenerateDynamicImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageResponseBody self = new GenerateDynamicImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDynamicImageResponseBody setData(GenerateDynamicImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDynamicImageResponseBodyData getData() {
        return this.data;
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
