// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordsRequest extends TeaModel {
    /**
     * <p>Query condition in JSON string format, specifically including fields:</p>
     * <ul>
     * <li><strong>DownloadMode (String)</strong>: Download mode,<ul>
     * <li>Example value: sync</li>
     * </ul>
     * </li>
     * <li><strong>InvokeType (String)</strong>: Product plan, corresponding to <strong>ProductType</strong></li>
     * <li><strong>SceneIdList (List<Long>)</strong>: List of scene IDs</li>
     * <li><strong>StatisticsType (String)</strong>: Statistics type<ul>
     * <li>day</li>
     * <li>month</li>
     * </ul>
     * </li>
     * <li><strong>StartDate (String)</strong>: Start date of the query<ul>
     * <li>Example value: 2025-09-17 00:00:00 +0800</li>
     * </ul>
     * </li>
     * <li><strong>EndDate (String)</strong>: End date of the query<ul>
     * <li>Example value: 2025-10-16 23:59:59 +0800</li>
     * </ul>
     * </li>
     * <li><strong>ProductProgramList</strong>: List of product codes under the queried product plan<ul>
     * <li>Example value: [&quot;FINANCE_FACE_VERIFY&quot;,&quot;MFVC&quot;]</li>
     * </ul>
     * </li>
     * <li><strong>Code (Information Verification API)</strong>:<ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-factor verification</li>
     * <li><strong>ID_PERIOD</strong>: Validity period of ID card verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile online duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile online status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: Simplified mobile three-factor verification</li>
     * <li><strong>MOBILE_3_META</strong>: Detailed mobile three-factor verification</li>
     * <li><strong>MOBILE_2_META</strong>: Mobile two-factor verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: Detailed bank card verification</li>
     * <li><strong>MOBILE_DETECT</strong>: Number detection </li>
     * <li><strong>VEHICLE_N_META</strong>: Enhanced vehicle factor verification</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle five-item information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle insurance date inquiry</li>
     * <li><strong>VEHICLE_CHECK</strong>: Vehicle factor verification</li>
     * </ul>
     * </li>
     * <li><strong>ProductCode</strong> (Information Verification): Same as Code</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductType&quot;:&quot;INVOKE_STATISTICS&quot;,&quot;BizParam&quot;:{&quot;DownloadMode&quot;:&quot;sync&quot;,&quot;InvokeType&quot;:&quot;FINANCE_VERIFY&quot;,&quot;SceneIdList&quot;:&quot;[]&quot;,&quot;ProductProgramList&quot;:&quot;[\&quot;FINANCE_FACE_VERIFY\&quot;,\&quot;MFVC\&quot;,\&quot;PV_FV\&quot;,\&quot;CLOUD_FACE_CAPTURE\&quot;,\&quot;FACE_GUARD\&quot;,\&quot;PV_FC\&quot;]&quot;,&quot;StatisticsType&quot;:&quot;day&quot;,&quot;StartDate&quot;:&quot;2025-09-17 00:00:00 +0800&quot;,&quot;EndDate&quot;:&quot;2025-10-16 23:59:59 +0800&quot;}}</p>
     */
    @NameInMap("BizParam")
    public String bizParam;

    /**
     * <p>Product type:</p>
     * <ul>
     * <li><strong>FINANCE_VERIFY</strong>: Financial-level real-person authentication</li>
     * <li><strong>SMART_VERIFY</strong>: Enhanced real-person authentication (discontinued)</li>
     * <li><strong>FACE_VERIFY</strong>: Real-person authentication (discontinued)</li>
     * <li><strong>INFO_CHECK_STATISTICS</strong>: Information verification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_VERIFY</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static DownloadVerifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordsRequest self = new DownloadVerifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordsRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public DownloadVerifyRecordsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
