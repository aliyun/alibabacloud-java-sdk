// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWebHostingConfigResponseBodyData data;

    public static GetWebHostingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingConfigResponseBody self = new GetWebHostingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebHostingConfigResponseBody setData(GetWebHostingConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingConfigResponseBodyData getData() {
        return this.data;
    }

    public static class GetWebHostingConfigResponseBodyData extends TeaModel {
        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("AllowedIps")
        public String allowedIps;

        @NameInMap("ErrorPath")
        public String errorPath;

        @NameInMap("DefaultDomain")
        public String defaultDomain;

        @NameInMap("IndexPath")
        public String indexPath;

        public static GetWebHostingConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingConfigResponseBodyData self = new GetWebHostingConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingConfigResponseBodyData setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public GetWebHostingConfigResponseBodyData setAllowedIps(String allowedIps) {
            this.allowedIps = allowedIps;
            return this;
        }
        public String getAllowedIps() {
            return this.allowedIps;
        }

        public GetWebHostingConfigResponseBodyData setErrorPath(String errorPath) {
            this.errorPath = errorPath;
            return this;
        }
        public String getErrorPath() {
            return this.errorPath;
        }

        public GetWebHostingConfigResponseBodyData setDefaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        public GetWebHostingConfigResponseBodyData setIndexPath(String indexPath) {
            this.indexPath = indexPath;
            return this;
        }
        public String getIndexPath() {
            return this.indexPath;
        }

    }

}
