// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedInfoResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceNameCn")
    public String serviceNameCn;

    @NameInMap("ServiceNameEn")
    public String serviceNameEn;

    @NameInMap("Source")
    public String source;

    @NameInMap("UsedTimestamp")
    public Long usedTimestamp;

    @NameInMap("UserName")
    public String userName;

    public static GetAccessKeyLastUsedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedInfoResponseBody self = new GetAccessKeyLastUsedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedInfoResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GetAccessKeyLastUsedInfoResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAccessKeyLastUsedInfoResponseBody setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetAccessKeyLastUsedInfoResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GetAccessKeyLastUsedInfoResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetAccessKeyLastUsedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessKeyLastUsedInfoResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetAccessKeyLastUsedInfoResponseBody setServiceNameCn(String serviceNameCn) {
        this.serviceNameCn = serviceNameCn;
        return this;
    }
    public String getServiceNameCn() {
        return this.serviceNameCn;
    }

    public GetAccessKeyLastUsedInfoResponseBody setServiceNameEn(String serviceNameEn) {
        this.serviceNameEn = serviceNameEn;
        return this;
    }
    public String getServiceNameEn() {
        return this.serviceNameEn;
    }

    public GetAccessKeyLastUsedInfoResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetAccessKeyLastUsedInfoResponseBody setUsedTimestamp(Long usedTimestamp) {
        this.usedTimestamp = usedTimestamp;
        return this;
    }
    public Long getUsedTimestamp() {
        return this.usedTimestamp;
    }

    public GetAccessKeyLastUsedInfoResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
