// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDSRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DSRecordList")
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList;

    public static QueryDSRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDSRecordResponseBody self = new QueryDSRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDSRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDSRecordResponseBody setDSRecordList(java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList) {
        this.DSRecordList = DSRecordList;
        return this;
    }
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> getDSRecordList() {
        return this.DSRecordList;
    }

    public static class QueryDSRecordResponseBodyDSRecordList extends TeaModel {
        @NameInMap("DigestType")
        public Integer digestType;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("Algorithm")
        public Integer algorithm;

        @NameInMap("KeyTag")
        public Integer keyTag;

        public static QueryDSRecordResponseBodyDSRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryDSRecordResponseBodyDSRecordList self = new QueryDSRecordResponseBodyDSRecordList();
            return TeaModel.build(map, self);
        }

        public QueryDSRecordResponseBodyDSRecordList setDigestType(Integer digestType) {
            this.digestType = digestType;
            return this;
        }
        public Integer getDigestType() {
            return this.digestType;
        }

        public QueryDSRecordResponseBodyDSRecordList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public QueryDSRecordResponseBodyDSRecordList setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public QueryDSRecordResponseBodyDSRecordList setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

    }

}
