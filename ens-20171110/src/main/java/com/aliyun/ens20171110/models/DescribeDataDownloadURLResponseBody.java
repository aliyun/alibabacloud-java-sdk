// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDataDownloadURLResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    public static DescribeDataDownloadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDownloadURLResponseBody self = new DescribeDataDownloadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataDownloadURLResponseBody setData(DescribeDataDownloadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataDownloadURLResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataDownloadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataDownloadURLResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeDataDownloadURLResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class DescribeDataDownloadURLResponseBodyDataServerList extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDataDownloadURLResponseBodyDataServerList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDownloadURLResponseBodyDataServerList self = new DescribeDataDownloadURLResponseBodyDataServerList();
            return TeaModel.build(map, self);
        }

        public DescribeDataDownloadURLResponseBodyDataServerList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeDataDownloadURLResponseBodyDataServerList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDataDownloadURLResponseBodyData extends TeaModel {
        @NameInMap("ServerList")
        public java.util.List<DescribeDataDownloadURLResponseBodyDataServerList> serverList;

        @NameInMap("Url")
        public String url;

        @NameInMap("ExpireTime")
        public String expireTime;

        public static DescribeDataDownloadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDownloadURLResponseBodyData self = new DescribeDataDownloadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataDownloadURLResponseBodyData setServerList(java.util.List<DescribeDataDownloadURLResponseBodyDataServerList> serverList) {
            this.serverList = serverList;
            return this;
        }
        public java.util.List<DescribeDataDownloadURLResponseBodyDataServerList> getServerList() {
            return this.serverList;
        }

        public DescribeDataDownloadURLResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeDataDownloadURLResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
