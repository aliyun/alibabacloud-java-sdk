// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListOpenSourcePermissionsResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOpenSourcePermissionsResponseBodyData> data;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEBA5E0C-50D0-4FA6-A794-4901E5465***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOpenSourcePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenSourcePermissionsResponseBody self = new ListOpenSourcePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenSourcePermissionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListOpenSourcePermissionsResponseBody setData(java.util.List<ListOpenSourcePermissionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOpenSourcePermissionsResponseBodyData> getData() {
        return this.data;
    }

    public ListOpenSourcePermissionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpenSourcePermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOpenSourcePermissionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOpenSourcePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenSourcePermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOpenSourcePermissionsResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("AliyunUserId")
        public Long aliyunUserId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-v0h1kb9nu***</p>
         */
        @NameInMap("CInstanceId")
        public String CInstanceId;

        /**
         * <p>The regular expression for configure permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>^$</p>
         */
        @NameInMap("Configure")
        public String configure;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>shhtzn</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The regular expression for read permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>^$</p>
         */
        @NameInMap("Read")
        public String read;

        /**
         * <p>The vhost name.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("Vhost")
        public String vhost;

        /**
         * <p>The regular expression for write permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>order_exchange</p>
         */
        @NameInMap("Write")
        public String write;

        public static ListOpenSourcePermissionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOpenSourcePermissionsResponseBodyData self = new ListOpenSourcePermissionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOpenSourcePermissionsResponseBodyData setAliyunUserId(Long aliyunUserId) {
            this.aliyunUserId = aliyunUserId;
            return this;
        }
        public Long getAliyunUserId() {
            return this.aliyunUserId;
        }

        public ListOpenSourcePermissionsResponseBodyData setCInstanceId(String CInstanceId) {
            this.CInstanceId = CInstanceId;
            return this;
        }
        public String getCInstanceId() {
            return this.CInstanceId;
        }

        public ListOpenSourcePermissionsResponseBodyData setConfigure(String configure) {
            this.configure = configure;
            return this;
        }
        public String getConfigure() {
            return this.configure;
        }

        public ListOpenSourcePermissionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOpenSourcePermissionsResponseBodyData setRead(String read) {
            this.read = read;
            return this;
        }
        public String getRead() {
            return this.read;
        }

        public ListOpenSourcePermissionsResponseBodyData setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

        public ListOpenSourcePermissionsResponseBodyData setWrite(String write) {
            this.write = write;
            return this;
        }
        public String getWrite() {
            return this.write;
        }

    }

}
