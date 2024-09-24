// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountedClientsResponseBody extends TeaModel {
    /**
     * <p>The queried clients.</p>
     */
    @NameInMap("Clients")
    public DescribeMountedClientsResponseBodyClients clients;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of IP addresses returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A70BEE5D-76D3-49FB-B58F-1F398211****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMountedClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountedClientsResponseBody self = new DescribeMountedClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMountedClientsResponseBody setClients(DescribeMountedClientsResponseBodyClients clients) {
        this.clients = clients;
        return this;
    }
    public DescribeMountedClientsResponseBodyClients getClients() {
        return this.clients;
    }

    public DescribeMountedClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountedClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountedClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountedClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMountedClientsResponseBodyClientsClient extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.1</p>
         */
        @NameInMap("ClientIP")
        public String clientIP;

        public static DescribeMountedClientsResponseBodyClientsClient build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountedClientsResponseBodyClientsClient self = new DescribeMountedClientsResponseBodyClientsClient();
            return TeaModel.build(map, self);
        }

        public DescribeMountedClientsResponseBodyClientsClient setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

    }

    public static class DescribeMountedClientsResponseBodyClients extends TeaModel {
        @NameInMap("Client")
        public java.util.List<DescribeMountedClientsResponseBodyClientsClient> client;

        public static DescribeMountedClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountedClientsResponseBodyClients self = new DescribeMountedClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public DescribeMountedClientsResponseBodyClients setClient(java.util.List<DescribeMountedClientsResponseBodyClientsClient> client) {
            this.client = client;
            return this;
        }
        public java.util.List<DescribeMountedClientsResponseBodyClientsClient> getClient() {
            return this.client;
        }

    }

}
