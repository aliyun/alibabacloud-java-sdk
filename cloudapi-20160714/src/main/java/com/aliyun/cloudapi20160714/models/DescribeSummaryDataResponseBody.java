// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSummaryDataResponseBody extends TeaModel {
    /**
     * <p>The number of subscription dedicated instances that expire in 14 days or less.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpireInstanceNum")
    public Integer expireInstanceNum;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UsageApiNum")
    public Integer usageApiNum;

    /**
     * <p>The number of API groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsageGroupNum")
    public Integer usageGroupNum;

    /**
     * <p>The number of running dedicated instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsageInstanceNum")
    public Integer usageInstanceNum;

    public static DescribeSummaryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryDataResponseBody self = new DescribeSummaryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryDataResponseBody setExpireInstanceNum(Integer expireInstanceNum) {
        this.expireInstanceNum = expireInstanceNum;
        return this;
    }
    public Integer getExpireInstanceNum() {
        return this.expireInstanceNum;
    }

    public DescribeSummaryDataResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeSummaryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSummaryDataResponseBody setUsageApiNum(Integer usageApiNum) {
        this.usageApiNum = usageApiNum;
        return this;
    }
    public Integer getUsageApiNum() {
        return this.usageApiNum;
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

}
