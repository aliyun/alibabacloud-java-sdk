// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordsRequest extends TeaModel {
    /**
     * <p>The query conditions in JSON string format. The following fields are included:</p>
     * <ul>
     * <li><strong>DownloadMode (String)</strong>: the download mode.<ul>
     * <li>Example: sync</li>
     * </ul>
     * </li>
     * <li><strong>InvokeType (String)</strong>: the product plan, which corresponds to <strong>ProductType</strong>.</li>
     * <li><strong>SceneIdList (List<Long>)</strong>: the list of scene IDs.</li>
     * <li><strong>StatisticsType (String)</strong>: the statistics type. Valid values:<ul>
     * <li>day</li>
     * <li>month</li>
     * </ul>
     * </li>
     * <li><strong>StartDate (String)</strong>: the query start time.<ul>
     * <li>Example: 2025-09-17 00:00:00 +0800</li>
     * </ul>
     * </li>
     * <li><strong>EndDate (String)</strong>: the query end time.<ul>
     * <li>Example: 2025-10-16 23:59:59 +0800</li>
     * </ul>
     * </li>
     * <li><strong>ProductProgramList</strong>: the list of product codes under the product plan to query.<ul>
     * <li>Example: [&quot;FINANCE_FACE_VERIFY&quot;,&quot;MFVC&quot;]</li>
     * </ul>
     * </li>
     * <li><strong>Code (information verification API)</strong>: Valid values:<ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-factor verification</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-factor verification (basic)</li>
     * <li><strong>MOBILE_3_META</strong>: mobile number three-factor verification (detailed)</li>
     * <li><strong>MOBILE_2_META</strong>: mobile number two-factor verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed)</li>
     * <li><strong>MOBILE_DETECT</strong>: phone number detection </li>
     * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced)</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
     * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification</li>
     * </ul>
     * </li>
     * <li><strong>ProductCode (information verification)</strong>: same as Code.</li>
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
     * <li><strong>FINANCE_VERIFY</strong>: financial-grade ID Verification</li>
     * <li><strong>SMART_VERIFY</strong>: enhanced ID Verification (discontinued)</li>
     * <li><strong>FACE_VERIFY</strong>: ID Verification (discontinued)</li>
     * <li><strong>INFO_CHECK_STATISTICS</strong>: information verification.</li>
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
