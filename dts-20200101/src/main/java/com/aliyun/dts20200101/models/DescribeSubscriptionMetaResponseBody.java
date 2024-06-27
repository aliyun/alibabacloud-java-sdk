// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C12E7A51-09A4-5796-94BE-08B6DA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the subtasks.</p>
     */
    @NameInMap("SubscriptionMetaList")
    public java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> subscriptionMetaList;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSubscriptionMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaResponseBody self = new DescribeSubscriptionMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSubscriptionMetaResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSubscriptionMetaResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSubscriptionMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionMetaResponseBody setSubscriptionMetaList(java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> subscriptionMetaList) {
        this.subscriptionMetaList = subscriptionMetaList;
        return this;
    }
    public java.util.List<DescribeSubscriptionMetaResponseBodySubscriptionMetaList> getSubscriptionMetaList() {
        return this.subscriptionMetaList;
    }

    public DescribeSubscriptionMetaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSubscriptionMetaResponseBodySubscriptionMetaList extends TeaModel {
        /**
         * <p>The consumer offset of the subtask. It is a UNIX timestamp that is generated when the client consumes the first data record. Unit: seconds.</p>
         * <blockquote>
         * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1610524452</p>
         */
        @NameInMap("Checkpoint")
        public Long checkpoint;

        /**
         * <p>The objects of the subtask. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;dtstestdata\&quot;:{\&quot;name\&quot;:\&quot;dtstestdata\&quot;,\&quot;all\&quot;:false,\&quot;Table\&quot;:{\&quot;order\&quot;:{\&quot;name\&quot;:\&quot;order\&quot;,\&quot;all\&quot;:true}}}}</p>
         */
        @NameInMap("DBList")
        public String DBList;

        /**
         * <p>The endpoint and port number of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-cn-hangzhou.aliyuncs.com:18001</p>
         */
        @NameInMap("DProxyUrl")
        public String DProxyUrl;

        /**
         * <p>The consumer group ID of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>z38m91gg2******</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The topic of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_hangzhou_rm_bp1n0x0x5tz******_dtstestdata_version2</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static DescribeSubscriptionMetaResponseBodySubscriptionMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionMetaResponseBodySubscriptionMetaList self = new DescribeSubscriptionMetaResponseBodySubscriptionMetaList();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setCheckpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public Long getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setDBList(String DBList) {
            this.DBList = DBList;
            return this;
        }
        public String getDBList() {
            return this.DBList;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setDProxyUrl(String DProxyUrl) {
            this.DProxyUrl = DProxyUrl;
            return this;
        }
        public String getDProxyUrl() {
            return this.DProxyUrl;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeSubscriptionMetaResponseBodySubscriptionMetaList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
