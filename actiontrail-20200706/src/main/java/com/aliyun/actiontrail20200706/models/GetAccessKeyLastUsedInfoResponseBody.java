// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedInfoResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI****************</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>104758519118****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The type of the account to which the AccessKey pair belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ram-user</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The details about the event.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
     *   &quot;eventVersion&quot;: 1,
     *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
     *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
     *   &quot;eventType&quot;: &quot;ApiCall&quot;,
     *   &quot;userIdentity&quot;: {
     *     &quot;accountId&quot;: &quot;104758519118****&quot;,
     *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
     *     &quot;type&quot;: &quot;ram-user&quot;,
     *     &quot;userName&quot;: &quot;alice&quot;
     *   },
     *   &quot;serviceName&quot;: &quot;Ecs&quot;,
     *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
     *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
     *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
     *   &quot;isGlobal&quot;: false,
     *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
     * }</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the account to which the AccessKey pair belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>24549429003625****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239EB588-CD24-522E-B0B5-174A1A588BE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud service that was last accessed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The Chinese name of the Alibaba Cloud service that was last accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>Elastic Compute Service (ECS)</p>
     */
    @NameInMap("ServiceNameCn")
    public String serviceNameCn;

    /**
     * <p>The English name of the Alibaba Cloud service that was last accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>Elastic Compute Service</p>
     */
    @NameInMap("ServiceNameEn")
    public String serviceNameEn;

    /**
     * <p>The event source.</p>
     * 
     * <strong>example:</strong>
     * <p>ManagementEvent</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The timestamp when the AccessKey pair was last called.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1657247532000</p>
     */
    @NameInMap("UsedTimestamp")
    public Long usedTimestamp;

    /**
     * <p>The name of the account to which the AccessKey pair belongs.</p>
     * <p>If the value of the AccountType parameter is root-account, the value of the UserName parameter is root. If the value of the AccountType parameter is ram-user, the value of the UserName parameter is the name of a RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
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
