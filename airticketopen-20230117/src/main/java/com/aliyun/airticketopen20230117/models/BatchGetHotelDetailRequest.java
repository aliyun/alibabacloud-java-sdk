// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BatchGetHotelDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;H001&quot;,&quot;H002&quot;]</p>
     */
    @NameInMap("StandardHotelIds")
    public java.util.List<String> standardHotelIds;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static BatchGetHotelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetHotelDetailRequest self = new BatchGetHotelDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetHotelDetailRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public BatchGetHotelDetailRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BatchGetHotelDetailRequest setStandardHotelIds(java.util.List<String> standardHotelIds) {
        this.standardHotelIds = standardHotelIds;
        return this;
    }
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    public BatchGetHotelDetailRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
