// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class TransferInCheckMailTokenResponseBody extends TeaModel {
    @NameInMap("FailList")
    public TransferInCheckMailTokenResponseBodyFailList failList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public TransferInCheckMailTokenResponseBodySuccessList successList;

    public static TransferInCheckMailTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferInCheckMailTokenResponseBody self = new TransferInCheckMailTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferInCheckMailTokenResponseBody setFailList(TransferInCheckMailTokenResponseBodyFailList failList) {
        this.failList = failList;
        return this;
    }
    public TransferInCheckMailTokenResponseBodyFailList getFailList() {
        return this.failList;
    }

    public TransferInCheckMailTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferInCheckMailTokenResponseBody setSuccessList(TransferInCheckMailTokenResponseBodySuccessList successList) {
        this.successList = successList;
        return this;
    }
    public TransferInCheckMailTokenResponseBodySuccessList getSuccessList() {
        return this.successList;
    }

    public static class TransferInCheckMailTokenResponseBodyFailList extends TeaModel {
        @NameInMap("FailDomain")
        public java.util.List<String> failDomain;

        public static TransferInCheckMailTokenResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            TransferInCheckMailTokenResponseBodyFailList self = new TransferInCheckMailTokenResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public TransferInCheckMailTokenResponseBodyFailList setFailDomain(java.util.List<String> failDomain) {
            this.failDomain = failDomain;
            return this;
        }
        public java.util.List<String> getFailDomain() {
            return this.failDomain;
        }

    }

    public static class TransferInCheckMailTokenResponseBodySuccessList extends TeaModel {
        @NameInMap("SuccessDomain")
        public java.util.List<String> successDomain;

        public static TransferInCheckMailTokenResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            TransferInCheckMailTokenResponseBodySuccessList self = new TransferInCheckMailTokenResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public TransferInCheckMailTokenResponseBodySuccessList setSuccessDomain(java.util.List<String> successDomain) {
            this.successDomain = successDomain;
            return this;
        }
        public java.util.List<String> getSuccessDomain() {
            return this.successDomain;
        }

    }

}
