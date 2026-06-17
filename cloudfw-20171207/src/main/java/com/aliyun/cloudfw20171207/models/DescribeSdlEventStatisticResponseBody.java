// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventStatisticResponseBody extends TeaModel {
    /**
     * <p>The number of AI-related leak threats.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AiSensitiveDataCount")
    public Long aiSensitiveDataCount;

    /**
     * <p>The total number of assets.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AssetCount")
    public Long assetCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of sensitive data leak events.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SensitiveDataCount")
    public Long sensitiveDataCount;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total traffic. Unit: bytes.</p>
     * 
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
