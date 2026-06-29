// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSOverseasAttackCountResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EBCECE18-DA96-5307-8506-01E5A0E21530</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of attacks supported by the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The number of attacks that have been used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UsedCount")
    public Integer usedCount;

    public static DescribeDDoSOverseasAttackCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSOverseasAttackCountResponseBody self = new DescribeDDoSOverseasAttackCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSOverseasAttackCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSOverseasAttackCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDDoSOverseasAttackCountResponseBody setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Integer getUsedCount() {
        return this.usedCount;
    }

}
