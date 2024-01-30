// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class ConfirmTransferInEmailResponseBody extends TeaModel {
    @NameInMap("FailList")
    public ConfirmTransferInEmailResponseBodyFailList failList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public ConfirmTransferInEmailResponseBodySuccessList successList;

    public static ConfirmTransferInEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTransferInEmailResponseBody self = new ConfirmTransferInEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmTransferInEmailResponseBody setFailList(ConfirmTransferInEmailResponseBodyFailList failList) {
        this.failList = failList;
        return this;
    }
    public ConfirmTransferInEmailResponseBodyFailList getFailList() {
        return this.failList;
    }

    public ConfirmTransferInEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmTransferInEmailResponseBody setSuccessList(ConfirmTransferInEmailResponseBodySuccessList successList) {
        this.successList = successList;
        return this;
    }
    public ConfirmTransferInEmailResponseBodySuccessList getSuccessList() {
        return this.successList;
    }

    public static class ConfirmTransferInEmailResponseBodyFailList extends TeaModel {
        @NameInMap("FailDomain")
        public java.util.List<String> failDomain;

        public static ConfirmTransferInEmailResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            ConfirmTransferInEmailResponseBodyFailList self = new ConfirmTransferInEmailResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public ConfirmTransferInEmailResponseBodyFailList setFailDomain(java.util.List<String> failDomain) {
            this.failDomain = failDomain;
            return this;
        }
        public java.util.List<String> getFailDomain() {
            return this.failDomain;
        }

    }

    public static class ConfirmTransferInEmailResponseBodySuccessList extends TeaModel {
        @NameInMap("SuccessDomain")
        public java.util.List<String> successDomain;

        public static ConfirmTransferInEmailResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            ConfirmTransferInEmailResponseBodySuccessList self = new ConfirmTransferInEmailResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public ConfirmTransferInEmailResponseBodySuccessList setSuccessDomain(java.util.List<String> successDomain) {
            this.successDomain = successDomain;
            return this;
        }
        public java.util.List<String> getSuccessDomain() {
            return this.successDomain;
        }

    }

}
