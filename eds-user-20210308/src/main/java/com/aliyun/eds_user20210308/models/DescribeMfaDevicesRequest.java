// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesRequest extends TeaModel {
    /**
     * <p>The AD domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>cn.misumi.pri</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>An array of end user usernames.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The maximum number of results to return per page. Valid range: 1–500.<br>Default value: 100.<br></p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token for the next page of results. This value is the <code>NextToken</code> returned from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>An array of serial numbers for virtual MFA devices.</p>
     * 
     * <strong>example:</strong>
     * <p>c2d9ae94-a64b-4a0d-8024-9519ca50****</p>
     */
    @NameInMap("SerialNumbers")
    public java.util.List<String> serialNumbers;

    public static DescribeMfaDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesRequest self = new DescribeMfaDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMfaDevicesRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public DescribeMfaDevicesRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeMfaDevicesRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeMfaDevicesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeMfaDevicesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeMfaDevicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMfaDevicesRequest setSerialNumbers(java.util.List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public java.util.List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

}
