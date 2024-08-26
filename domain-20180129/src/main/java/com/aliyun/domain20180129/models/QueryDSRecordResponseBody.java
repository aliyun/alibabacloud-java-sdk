// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDSRecordResponseBody extends TeaModel {
    @NameInMap("DSRecordList")
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList;

    /**
     * <strong>example:</strong>
     * <p>814B2AF0-ED6F-4C13-B41C-8AC0B1023583</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDSRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDSRecordResponseBody self = new QueryDSRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDSRecordResponseBody setDSRecordList(java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList) {
        this.DSRecordList = DSRecordList;
        return this;
    }
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> getDSRecordList() {
        return this.DSRecordList;
    }

    public QueryDSRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDSRecordResponseBodyDSRecordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <strong>example:</strong>
         * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DigestType")
        public Integer digestType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        public static QueryDSRecordResponseBodyDSRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryDSRecordResponseBodyDSRecordList self = new QueryDSRecordResponseBodyDSRecordList();
            return TeaModel.build(map, self);
        }

        public QueryDSRecordResponseBodyDSRecordList setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public QueryDSRecordResponseBodyDSRecordList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public QueryDSRecordResponseBodyDSRecordList setDigestType(Integer digestType) {
            this.digestType = digestType;
            return this;
        }
        public Integer getDigestType() {
            return this.digestType;
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
