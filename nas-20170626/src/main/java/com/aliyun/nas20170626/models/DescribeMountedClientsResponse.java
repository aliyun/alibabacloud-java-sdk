// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountedClientsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Clients")
    @Validation(required = true)
    public DescribeMountedClientsResponseClients clients;

    public static DescribeMountedClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountedClientsResponse self = new DescribeMountedClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountedClientsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountedClientsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMountedClientsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountedClientsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountedClientsResponse setClients(DescribeMountedClientsResponseClients clients) {
        this.clients = clients;
        return this;
    }
    public DescribeMountedClientsResponseClients getClients() {
        return this.clients;
    }

    public static class DescribeMountedClientsResponseClientsClient extends TeaModel {
        @NameInMap("ClientIP")
        @Validation(required = true)
        public String clientIP;

        public static DescribeMountedClientsResponseClientsClient build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountedClientsResponseClientsClient self = new DescribeMountedClientsResponseClientsClient();
            return TeaModel.build(map, self);
        }

        public DescribeMountedClientsResponseClientsClient setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

    }

    public static class DescribeMountedClientsResponseClients extends TeaModel {
        @NameInMap("Client")
        @Validation(required = true)
        public java.util.List<DescribeMountedClientsResponseClientsClient> client;

        public static DescribeMountedClientsResponseClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountedClientsResponseClients self = new DescribeMountedClientsResponseClients();
            return TeaModel.build(map, self);
        }

        public DescribeMountedClientsResponseClients setClient(java.util.List<DescribeMountedClientsResponseClientsClient> client) {
            this.client = client;
            return this;
        }
        public java.util.List<DescribeMountedClientsResponseClientsClient> getClient() {
            return this.client;
        }

    }

}
