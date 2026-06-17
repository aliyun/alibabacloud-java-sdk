// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventDetailRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.102.XXX</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <p>The end time. The value is a UNIX timestamp that is accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1753755251</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>121.40.84.XXX</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start time. The value is a UNIX timestamp that is accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>326ce10e-5e17-4235-879a-6f2502cd****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSdlEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventDetailRequest self = new DescribeSdlEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSdlEventDetailRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public DescribeSdlEventDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSdlEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSdlEventDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSdlEventDetailRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeSdlEventDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSdlEventDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
