// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordIntlRequest extends TeaModel {
    /**
     * <p>Business type:</p>
     * <ul>
     * <li>INVOKE_STATISTICS</li>
     * <li>INVOKE_RECORD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INVOKE_RECORD</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Query code.</p>
     * 
     * <strong>example:</strong>
     * <p>vrf_intl_verify_record_real_id_idv_invoke_statistics_query</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Download mode:</p>
     * <ul>
     * <li><strong>async</strong>: Asynchronous</li>
     * <li><strong>sync</strong>: Synchronous</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("DownloadMode")
    public String downloadMode;

    /**
     * <p>Parameters related to the export and download query task.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;productCode\&quot;:\&quot;FACE_LIVENESS\&quot;,\&quot;startDs\&quot;:\&quot;20251121\&quot;,\&quot;endDs\&quot;:\&quot;20251128\&quot;,\&quot;language\&quot;:\&quot;en\&quot;}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>Product Code.</p>
     * 
     * <strong>example:</strong>
     * <p>KYC</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static DownloadVerifyRecordIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordIntlRequest self = new DownloadVerifyRecordIntlRequest();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordIntlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DownloadVerifyRecordIntlRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadVerifyRecordIntlRequest setDownloadMode(String downloadMode) {
        this.downloadMode = downloadMode;
        return this;
    }
    public String getDownloadMode() {
        return this.downloadMode;
    }

    public DownloadVerifyRecordIntlRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public DownloadVerifyRecordIntlRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
