// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeCpfsAccessPointMountedClientsResponseBody extends TeaModel {
    @NameInMap("MountedClient")
    public java.util.List<DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient> mountedClient;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCpfsAccessPointMountedClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCpfsAccessPointMountedClientsResponseBody self = new DescribeCpfsAccessPointMountedClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCpfsAccessPointMountedClientsResponseBody setMountedClient(java.util.List<DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient> mountedClient) {
        this.mountedClient = mountedClient;
        return this;
    }
    public java.util.List<DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient> getMountedClient() {
        return this.mountedClient;
    }

    public DescribeCpfsAccessPointMountedClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCpfsAccessPointMountedClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCpfsAccessPointMountedClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCpfsAccessPointMountedClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsc</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p>vsc-8vb864o3ppwfvh****</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>219.145.34.210</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        public static DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient build(java.util.Map<String, ?> map) throws Exception {
            DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient self = new DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient();
            return TeaModel.build(map, self);
        }

        public DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeCpfsAccessPointMountedClientsResponseBodyMountedClient setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

    }

}
