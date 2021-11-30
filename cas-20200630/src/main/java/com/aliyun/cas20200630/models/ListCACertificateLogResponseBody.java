// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogResponseBody extends TeaModel {
    @NameInMap("LogList")
    public java.util.List<ListCACertificateLogResponseBodyLogList> logList;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Identifier")
        public String identifier;

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
