// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSummaryDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageGroupNum")
    public Integer usageGroupNum;

    @NameInMap("UsageInstanceNum")
    public Integer usageInstanceNum;

    @NameInMap("UsageApiNum")
    public Integer usageApiNum;

    @NameInMap("Region")
    public String region;

    @NameInMap("ComeingSoonInstanceNum")
    public Integer comeingSoonInstanceNum;

    @NameInMap("ExpireInstanceNum")
    public Integer expireInstanceNum;

    public static DescribeSummaryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryDataResponseBody self = new DescribeSummaryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSummaryDataResponseBody setUsageGroupNum(Integer usageGroupNum) {
        this.usageGroupNum = usageGroupNum;
        return this;
    }
    public Integer getUsageGroupNum() {
        return this.usageGroupNum;
    }

    public DescribeSummaryDataResponseBody setUsageInstanceNum(Integer usageInstanceNum) {
        this.usageInstanceNum = usageInstanceNum;
        return this;
    }
    public Integer getUsageInstanceNum() {
        return this.usageInstanceNum;
    }

    public DescribeSummaryDataResponseBody setUsageApiNum(Integer usageApiNum) {
        this.usageApiNum = usageApiNum;
        return this;
    }
    public Integer getUsageApiNum() {
        return this.usageApiNum;
    }

    public DescribeSummaryDataResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeSummaryDataResponseBody setComeingSoonInstanceNum(Integer comeingSoonInstanceNum) {
        this.comeingSoonInstanceNum = comeingSoonInstanceNum;
        return this;
    }
    public Integer getComeingSoonInstanceNum() {
        return this.comeingSoonInstanceNum;
    }

    public DescribeSummaryDataResponseBody setExpireInstanceNum(Integer expireInstanceNum) {
        this.expireInstanceNum = expireInstanceNum;
        return this;
    }
    public Integer getExpireInstanceNum() {
        return this.expireInstanceNum;
    }

}
