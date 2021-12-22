// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListConnectionPoolIpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("IpInfoList")
    public java.util.List<ListConnectionPoolIpResponseBodyIpInfoList> ipInfoList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageId")
    public String pageId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListConnectionPoolIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolIpResponseBody self = new ListConnectionPoolIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolIpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConnectionPoolIpResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListConnectionPoolIpResponseBody setIpInfoList(java.util.List<ListConnectionPoolIpResponseBodyIpInfoList> ipInfoList) {
        this.ipInfoList = ipInfoList;
        return this;
    }
    public java.util.List<ListConnectionPoolIpResponseBodyIpInfoList> getIpInfoList() {
        return this.ipInfoList;
    }

    public ListConnectionPoolIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConnectionPoolIpResponseBody setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListConnectionPoolIpResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConnectionPoolIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionPoolIpResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListConnectionPoolIpResponseBodyIpInfoList extends TeaModel {
        @NameInMap("CciotId")
        public String cciotId;

        @NameInMap("ConnectionPoolId")
        public String connectionPoolId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Status")
        public String status;

        public static ListConnectionPoolIpResponseBodyIpInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoolIpResponseBodyIpInfoList self = new ListConnectionPoolIpResponseBodyIpInfoList();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoolIpResponseBodyIpInfoList setCciotId(String cciotId) {
            this.cciotId = cciotId;
            return this;
        }
        public String getCciotId() {
            return this.cciotId;
        }

        public ListConnectionPoolIpResponseBodyIpInfoList setConnectionPoolId(String connectionPoolId) {
            this.connectionPoolId = connectionPoolId;
            return this;
        }
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        public ListConnectionPoolIpResponseBodyIpInfoList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListConnectionPoolIpResponseBodyIpInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
