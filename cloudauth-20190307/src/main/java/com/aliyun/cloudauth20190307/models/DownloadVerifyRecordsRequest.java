// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordsRequest extends TeaModel {
    /**
     * <p>The query conditions in JSON string format. This parameter includes the following fields:</p>
     * <ul>
     * <li><strong>DownloadMode</strong> (String): The download mode.<ul>
     * <li>Example value: sync</li>
     * </ul>
     * </li>
     * <li><strong>InvokeType</strong> (String): The product solution, which corresponds to <strong>ProductType</strong>.</li>
     * <li><strong>SceneIdList</strong> (List<Long>): The list of scene IDs.</li>
     * <li><strong>StatisticsType</strong> (String): The statistics type.<ul>
     * <li>day</li>
     * <li>month</li>
     * </ul>
     * </li>
     * <li><strong>StartDate</strong> (String): The start time of the query.<ul>
     * <li>Example value: 2025-09-17 00:00:00 +0800</li>
     * </ul>
     * </li>
     * <li><strong>EndDate</strong> (String): The end time of the query.<ul>
     * <li>Example value: 2025-10-16 23:59:59 +0800</li>
     * </ul>
     * </li>
     * <li><strong>ProductProgramList</strong>: The list of product codes corresponding to the product solution to be queried.<ul>
     * <li>Example value: [&quot;FINANCE_FACE_VERIFY&quot;,&quot;MFVC&quot;]</li>
     * </ul>
     * </li>
     * <li><strong>Code</strong> (Information verification API):<ul>
     * <li><strong>ID_CARD_2_META</strong>: Two-element verification for ID cards</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile phone in-network duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile phone in-network status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: Simplified three-element verification for mobile phone numbers</li>
     * <li><strong>MOBILE_3_META</strong>: Detailed three-element verification for mobile phone numbers</li>
     * <li><strong>MOBILE_2_META</strong>: Two-element verification for mobile phone numbers</li>
     * <li><strong>BANK_CARD_N_META</strong>: Detailed bank card verification</li>
     * <li><strong>MOBILE_DETECT</strong>: Phone number detection </li>
     * <li><strong>VEHICLE_N_META</strong>: Enhanced vehicle element verification</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: Five-item vehicle information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle insurance date query</li>
     * <li><strong>VEHICLE_CHECK</strong>: Vehicle element verification</li>
     * </ul>
     * </li>
     * <li><strong>ProductCode</strong> (Information verification): Same as Code.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductType&quot;:&quot;INVOKE_STATISTICS&quot;,&quot;BizParam&quot;:{&quot;DownloadMode&quot;:&quot;sync&quot;,&quot;InvokeType&quot;:&quot;FINANCE_VERIFY&quot;,&quot;SceneIdList&quot;:&quot;[]&quot;,&quot;ProductProgramList&quot;:&quot;[\&quot;FINANCE_FACE_VERIFY\&quot;,\&quot;MFVC\&quot;,\&quot;PV_FV\&quot;,\&quot;CLOUD_FACE_CAPTURE\&quot;,\&quot;FACE_GUARD\&quot;,\&quot;PV_FC\&quot;]&quot;,&quot;StatisticsType&quot;:&quot;day&quot;,&quot;StartDate&quot;:&quot;2025-09-17 00:00:00 +0800&quot;,&quot;EndDate&quot;:&quot;2025-10-16 23:59:59 +0800&quot;}}</p>
     */
    @NameInMap("BizParam")
    public String bizParam;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>FINANCE_VERIFY</strong>: Financial-grade ID Verification</li>
     * <li><strong>SMART_VERIFY</strong>: Enhanced ID Verification (discontinued)</li>
     * <li><strong>FACE_VERIFY</strong>: ID Verification (discontinued)</li>
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
