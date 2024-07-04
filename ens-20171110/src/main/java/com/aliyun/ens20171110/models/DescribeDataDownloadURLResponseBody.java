// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The download URLs of data files.</p>
     */
    @NameInMap("Data")
    public DescribeDataDownloadURLResponseBodyData data;

    /**
     * <p>The response message. Success is returned for a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataDownloadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDownloadURLResponseBody self = new DescribeDataDownloadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataDownloadURLResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeDataDownloadURLResponseBody setData(DescribeDataDownloadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataDownloadURLResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataDownloadURLResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataDownloadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataDownloadURLResponseBodyDataServerList extends TeaModel {
        /**
         * <p>The host address of the file server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1:8080</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chenzhou-5</p>
         */
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
        /**
         * <p>The time when the data file expires. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T03:36:27Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The file servers.</p>
         */
        @NameInMap("ServerList")
        public java.util.List<DescribeDataDownloadURLResponseBodyDataServerList> serverList;

        /**
         * <p>The download URL of the data file.</p>
         * 
         * <strong>example:</strong>
         * <p>/file/1450088842124331/97a32f2a-aa2c-436a-b19c-05b20d258618/f0313053530fc727f81b7d03fad93cd2/e4c2e8edac362acab7123654b9e73432?ak=edgepaas-innerapi-daily&amp;ts=1611229454&amp;sign=Yycbax%2F4OsTgm6BLoxR6lPs5gKE%3D</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeDataDownloadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDownloadURLResponseBodyData self = new DescribeDataDownloadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataDownloadURLResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
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

    }

}
