// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeOrgAttackSurfaceDetailsResponseBody extends TeaModel {
    @NameInMap("LastScannedAt")
    public Long lastScannedAt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FirstScannedAt")
    public Long firstScannedAt;

    @NameInMap("Occurrences")
    public Integer occurrences;

    public static DescribeOrgAttackSurfaceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgAttackSurfaceDetailsResponseBody self = new DescribeOrgAttackSurfaceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrgAttackSurfaceDetailsResponseBody setLastScannedAt(Long lastScannedAt) {
        this.lastScannedAt = lastScannedAt;
        return this;
    }
    public Long getLastScannedAt() {
        return this.lastScannedAt;
    }

    public DescribeOrgAttackSurfaceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrgAttackSurfaceDetailsResponseBody setFirstScannedAt(Long firstScannedAt) {
        this.firstScannedAt = firstScannedAt;
        return this;
    }
    public Long getFirstScannedAt() {
        return this.firstScannedAt;
    }

    public DescribeOrgAttackSurfaceDetailsResponseBody setOccurrences(Integer occurrences) {
        this.occurrences = occurrences;
        return this;
    }
    public Integer getOccurrences() {
        return this.occurrences;
    }

}
