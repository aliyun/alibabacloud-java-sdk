// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The available elastic AnalyticDB compute units (ACUs).</p>
     * 
     * <strong>example:</strong>
     * <p>512ACU</p>
     */
    @NameInMap("ElasticACU")
    public String elasticACU;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0322C7FB-4584-5D2A-BF7F-F9036E940C35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The available reserved computing resources.</p>
     * 
     * <strong>example:</strong>
     * <p>48ACU</p>
     */
    @NameInMap("ReserverdCompteACU")
    public String reserverdCompteACU;

    /**
     * <p>The available reserved storage resources.</p>
     * 
     * <strong>example:</strong>
     * <p>24ACU</p>
     */
    @NameInMap("ReserverdStorageACU")
    public String reserverdStorageACU;

    /**
     * <p>The number of available resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ResourceGroupCount")
    public String resourceGroupCount;

    public static DescribeUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaResponseBody self = new DescribeUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserQuotaResponseBody setElasticACU(String elasticACU) {
        this.elasticACU = elasticACU;
        return this;
    }
    public String getElasticACU() {
        return this.elasticACU;
    }

    public DescribeUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserQuotaResponseBody setReserverdCompteACU(String reserverdCompteACU) {
        this.reserverdCompteACU = reserverdCompteACU;
        return this;
    }
    public String getReserverdCompteACU() {
        return this.reserverdCompteACU;
    }

    public DescribeUserQuotaResponseBody setReserverdStorageACU(String reserverdStorageACU) {
        this.reserverdStorageACU = reserverdStorageACU;
        return this;
    }
    public String getReserverdStorageACU() {
        return this.reserverdStorageACU;
    }

    public DescribeUserQuotaResponseBody setResourceGroupCount(String resourceGroupCount) {
        this.resourceGroupCount = resourceGroupCount;
        return this;
    }
    public String getResourceGroupCount() {
        return this.resourceGroupCount;
    }

}
