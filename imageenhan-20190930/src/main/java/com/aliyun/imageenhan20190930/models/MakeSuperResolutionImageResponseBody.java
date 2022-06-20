// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public MakeSuperResolutionImageResponseBodyData data;

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
