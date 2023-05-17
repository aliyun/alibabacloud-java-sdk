// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The list of username of convenience users.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The time when the virtual MFA device was enabled. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The time when a locked virtual MFA device is automatically unlocked. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
