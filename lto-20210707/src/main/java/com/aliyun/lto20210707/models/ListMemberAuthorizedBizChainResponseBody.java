// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAuthorizedBizChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMemberAuthorizedBizChainResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMemberAuthorizedBizChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAuthorizedBizChainResponseBody self = new ListMemberAuthorizedBizChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemberAuthorizedBizChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemberAuthorizedBizChainResponseBody setData(java.util.List<ListMemberAuthorizedBizChainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMemberAuthorizedBizChainResponseBodyData> getData() {
        return this.data;
    }

    public ListMemberAuthorizedBizChainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemberAuthorizedBizChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemberAuthorizedBizChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemberAuthorizedBizChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMemberAuthorizedBizChainResponseBodyDataPeerList extends TeaModel {
        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("PeerName")
        public String peerName;

        public static ListMemberAuthorizedBizChainResponseBodyDataPeerList build(java.util.Map<String, ?> map) throws Exception {
            ListMemberAuthorizedBizChainResponseBodyDataPeerList self = new ListMemberAuthorizedBizChainResponseBodyDataPeerList();
            return TeaModel.build(map, self);
        }

        public ListMemberAuthorizedBizChainResponseBodyDataPeerList setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public ListMemberAuthorizedBizChainResponseBodyDataPeerList setPeerName(String peerName) {
            this.peerName = peerName;
            return this;
        }
        public String getPeerName() {
            return this.peerName;
        }

    }

    public static class ListMemberAuthorizedBizChainResponseBodyData extends TeaModel {
        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("BizChainType")
        public String bizChainType;

        @NameInMap("PeerList")
        public java.util.List<ListMemberAuthorizedBizChainResponseBodyDataPeerList> peerList;

        public static ListMemberAuthorizedBizChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberAuthorizedBizChainResponseBodyData self = new ListMemberAuthorizedBizChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemberAuthorizedBizChainResponseBodyData setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public ListMemberAuthorizedBizChainResponseBodyData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListMemberAuthorizedBizChainResponseBodyData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public ListMemberAuthorizedBizChainResponseBodyData setBizChainType(String bizChainType) {
            this.bizChainType = bizChainType;
            return this;
        }
        public String getBizChainType() {
            return this.bizChainType;
        }

        public ListMemberAuthorizedBizChainResponseBodyData setPeerList(java.util.List<ListMemberAuthorizedBizChainResponseBodyDataPeerList> peerList) {
            this.peerList = peerList;
            return this;
        }
        public java.util.List<ListMemberAuthorizedBizChainResponseBodyDataPeerList> getPeerList() {
            return this.peerList;
        }

    }

}
