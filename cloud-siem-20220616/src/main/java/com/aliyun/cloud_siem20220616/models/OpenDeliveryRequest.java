// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class OpenDeliveryRequest extends TeaModel {
    /**
     * <p>The log code of the cloud service, such as the code of the process log for Security Center. If you leave this parameter empty, operations are performed on all logs of the cloud service.</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The code of the cloud service. Valid values:</p>
     * <br>
     * <p>*   qcloud_waf</p>
     * <p>*   qlcoud_cfw</p>
     * <p>*   hcloud_waf</p>
     * <p>*   hcloud_cfw</p>
     * <p>*   ddos</p>
     * <p>*   sas</p>
     * <p>*   cfw</p>
     * <p>*   config</p>
     * <p>*   csk</p>
     * <p>*   fc</p>
     * <p>*   rds</p>
     * <p>*   nas</p>
     * <p>*   apigateway</p>
     * <p>*   cdn</p>
     * <p>*   mongodb</p>
     * <p>*   eip</p>
     * <p>*   slb</p>
     * <p>*   vpc</p>
     * <p>*   actiontrail</p>
     * <p>*   waf</p>
     * <p>*   bastionhost</p>
     * <p>*   oss</p>
     * <p>*   polardb</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static OpenDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDeliveryRequest self = new OpenDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public OpenDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public OpenDeliveryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public OpenDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
