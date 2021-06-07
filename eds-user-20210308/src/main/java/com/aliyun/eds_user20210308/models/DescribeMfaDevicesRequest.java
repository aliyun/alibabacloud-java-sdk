// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("SerialNumbers")
    public java.util.List<String> serialNumbers;

    public static DescribeMfaDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesRequest self = new DescribeMfaDevicesRequest();
        return TeaModel.build(map, self);
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

    public DescribeMfaDevicesRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeMfaDevicesRequest setSerialNumbers(java.util.List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public java.util.List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

}
