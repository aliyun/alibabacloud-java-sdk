// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWebHostingStatusResponseBodyData data;

    public static GetWebHostingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingStatusResponseBody self = new GetWebHostingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebHostingStatusResponseBody setData(GetWebHostingStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetWebHostingStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SpaceId")
        public String spaceId;

        public static GetWebHostingStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingStatusResponseBodyData self = new GetWebHostingStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWebHostingStatusResponseBodyData setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

}
