// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DescribeDashboardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;success&quot;:true,
     *     &quot;model&quot;:{
     *         &quot;perfMonthCount&quot;:0,
     *         &quot;compatibilityMonthCount&quot;:0,
     *         &quot;perfLastMonthCount&quot;:0,
     *         &quot;compatibilityLastMonthCount&quot;:0,
     *         &quot;automationMonthCount&quot;:0,
     *         &quot;automationLastMonthCount&quot;:0
     *     }
     * }</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>4CC30A8F-787C-55CA-87A6-7D1BED56067E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardResponseBody self = new DescribeDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
