// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AiSensitiveDataCount")
    public Long aiSensitiveDataCount;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AssetCount")
    public Long assetCount;

    /**
     * <strong>example:</strong>
     * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SensitiveDataCount")
    public Long sensitiveDataCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalTraffic")
    public Long totalTraffic;

    public static DescribeSdlEventStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventStatisticResponseBody self = new DescribeSdlEventStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventStatisticResponseBody setAiSensitiveDataCount(Long aiSensitiveDataCount) {
        this.aiSensitiveDataCount = aiSensitiveDataCount;
        return this;
    }
    public Long getAiSensitiveDataCount() {
        return this.aiSensitiveDataCount;
    }

    public DescribeSdlEventStatisticResponseBody setAssetCount(Long assetCount) {
        this.assetCount = assetCount;
        return this;
    }
    public Long getAssetCount() {
        return this.assetCount;
    }

    public DescribeSdlEventStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlEventStatisticResponseBody setSensitiveDataCount(Long sensitiveDataCount) {
        this.sensitiveDataCount = sensitiveDataCount;
        return this;
    }
    public Long getSensitiveDataCount() {
        return this.sensitiveDataCount;
    }

    public DescribeSdlEventStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSdlEventStatisticResponseBody setTotalTraffic(Long totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public Long getTotalTraffic() {
        return this.totalTraffic;
    }

}
