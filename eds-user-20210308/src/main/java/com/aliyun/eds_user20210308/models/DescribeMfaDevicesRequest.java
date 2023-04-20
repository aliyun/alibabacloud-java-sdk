// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesRequest extends TeaModel {
    /**
     * <p>The list of username of convenience users.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The serial numbers of the virtual MFA devices.</p>
     */
    @NameInMap("SerialNumbers")
    public java.util.List<String> serialNumbers;

    public static DescribeMfaDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesRequest self = new DescribeMfaDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMfaDevicesRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
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
