// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MakeSuperResolutionImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static MakeSuperResolutionImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageResponseBody self = new MakeSuperResolutionImageResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MakeSuperResolutionImageResponseBody setData(MakeSuperResolutionImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MakeSuperResolutionImageResponseBodyData getData() {
        return this.data;
    }

    public MakeSuperResolutionImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
