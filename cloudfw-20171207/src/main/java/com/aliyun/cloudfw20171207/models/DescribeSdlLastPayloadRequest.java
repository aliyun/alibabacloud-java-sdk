// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlLastPayloadRequest extends TeaModel {
    /**
     * <p>The destination IP address. This is an optional parameter used to filter by destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.102.XXX</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <p>The end time of the query (UNIX timestamp in seconds). This parameter is required. If this parameter is not specified, the API returns an error.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408267</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of sensitive credential. This parameter is required. If this parameter is not specified, the API returns an error.</p>
     * 
     * <strong>example:</strong>
     * <p>id_card</p>
     */
    @NameInMap("SensitiveCategory")
    public String sensitiveCategory;

    /**
     * <p>The source IP address. This is an optional parameter used to filter by source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>121.40.84.XXX</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start time of the query (UNIX timestamp in seconds). This parameter is required. If this parameter is not specified, the API returns an error.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSdlLastPayloadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlLastPayloadRequest self = new DescribeSdlLastPayloadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdlLastPayloadRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public DescribeSdlLastPayloadRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSdlLastPayloadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSdlLastPayloadRequest setSensitiveCategory(String sensitiveCategory) {
        this.sensitiveCategory = sensitiveCategory;
        return this;
    }
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    public DescribeSdlLastPayloadRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeSdlLastPayloadRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
