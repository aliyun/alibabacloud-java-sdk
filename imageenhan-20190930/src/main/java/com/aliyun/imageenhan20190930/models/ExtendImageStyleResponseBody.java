// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExtendImageStyleResponseBodyData data;

    public static ExtendImageStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponseBody self = new ExtendImageStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtendImageStyleResponseBody setData(ExtendImageStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtendImageStyleResponseBodyData getData() {
        return this.data;
    }

    public static class ExtendImageStyleResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("MajorUrl")
        public String majorUrl;

        public static ExtendImageStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtendImageStyleResponseBodyData self = new ExtendImageStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtendImageStyleResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ExtendImageStyleResponseBodyData setMajorUrl(String majorUrl) {
            this.majorUrl = majorUrl;
            return this;
        }
        public String getMajorUrl() {
            return this.majorUrl;
        }

    }

}
