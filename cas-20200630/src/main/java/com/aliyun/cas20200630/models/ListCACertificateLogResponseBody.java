// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogResponseBody extends TeaModel {
    /**
     * <p>A list of operation logs for the CA certificate.</p>
     */
    @NameInMap("LogList")
    public java.util.List<ListCACertificateLogResponseBodyLogList> logList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCACertificateLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCACertificateLogResponseBody self = new ListCACertificateLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCACertificateLogResponseBody setLogList(java.util.List<ListCACertificateLogResponseBodyLogList> logList) {
        this.logList = logList;
        return this;
    }
    public java.util.List<ListCACertificateLogResponseBodyLogList> getLogList() {
        return this.logList;
    }

    public ListCACertificateLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCACertificateLogResponseBodyLogList extends TeaModel {
        /**
         * <p>The description of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>add sub-root ca</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time of the operation. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634539509000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The unique identifier of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><p><strong>ADD</strong>: A CA certificate is created.</p>
         * </li>
         * <li><p><strong>UPDATE</strong>: The status of the CA certificate is updated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("OpType")
        public String opType;

        public static ListCACertificateLogResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            ListCACertificateLogResponseBodyLogList self = new ListCACertificateLogResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public ListCACertificateLogResponseBodyLogList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCACertificateLogResponseBodyLogList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCACertificateLogResponseBodyLogList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListCACertificateLogResponseBodyLogList setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

    }

}
