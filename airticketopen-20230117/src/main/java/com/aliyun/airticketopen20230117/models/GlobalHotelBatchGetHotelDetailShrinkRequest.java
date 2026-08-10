// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelBatchGetHotelDetailShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the distributor account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The language. For example, en or zh.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The list of standard hotel IDs. A maximum of 100 IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;H001&quot;,&quot;H002&quot;]</p>
     */
    @NameInMap("StandardHotelIds")
    public String standardHotelIdsShrink;

    /**
     * <p>string</p>
     * 
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelBatchGetHotelDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelBatchGetHotelDetailShrinkRequest self = new GlobalHotelBatchGetHotelDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelBatchGetHotelDetailShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelBatchGetHotelDetailShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GlobalHotelBatchGetHotelDetailShrinkRequest setStandardHotelIdsShrink(String standardHotelIdsShrink) {
        this.standardHotelIdsShrink = standardHotelIdsShrink;
        return this;
    }
    public String getStandardHotelIdsShrink() {
        return this.standardHotelIdsShrink;
    }

    public GlobalHotelBatchGetHotelDetailShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
